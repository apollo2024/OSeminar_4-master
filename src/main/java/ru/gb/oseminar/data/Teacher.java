package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    //private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = teacherId;
    }

    public Long getTeacherId() {
        return id;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + id +
                '}';
    }
}
