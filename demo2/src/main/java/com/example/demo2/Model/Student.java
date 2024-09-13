package com.example.demo2.Model;

public class Student {
    private int id_student;
    private String name_student;
    private String clas;

    public Student(int id_student, String name_student, String clas) {
        this.id_student = id_student;
        this.name_student = name_student;
        this.clas = clas;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
