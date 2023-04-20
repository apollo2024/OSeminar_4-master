package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService<T extends Teacher> implements UserService<T> {
    private final List<T> teachers;

    public TeacherService(List<T> teachers) {
        this.teachers = new ArrayList<T>();
    }

    @Override
    public List<T> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > countMaxId) {
                countMaxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add((T) teacher);
    }

    @Override
    public Long getId(Teacher teacher) {
        return teacher.getTeacherId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(teachers);
    }


    @Override
    public String toString() {
        return "TeacherService{" +
                "teachers=" + teachers +
                '}';
    }
}
