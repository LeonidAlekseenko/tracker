package ru.job4j.elementary.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Vasy");
        student.setGroup("Group");
        student.setCreated(new Date());
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getCreated());
    }
}
