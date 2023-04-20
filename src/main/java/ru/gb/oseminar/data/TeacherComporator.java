package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;

public class TeacherComporator extends Teacher implements Comparator {
    public TeacherComporator(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public TeacherComporator(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth, teacherId);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

