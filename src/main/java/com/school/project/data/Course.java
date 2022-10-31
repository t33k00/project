package com.school.project.data;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private long id;
    private String name;
    private String teacher;
    private String classroom;
    private static long idcount = 0;
    private List<Student> studentids = new ArrayList<>();

    public Course() {
        this("");
    }

    public Course(String name) {
        this.id = idcount++;
    }

    public Course(String name, String teacher, String classroom) {
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        this.id = idcount++;
    }

    public void addtocourse(Student student) {
        studentids.add(student);
    }

    public void delfromcourse(Student student) {
        studentids.remove(student);
    }

    public List<Student> getParticipants() {
        return new ArrayList<>(this.studentids);
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getclassroom() {
        return this.classroom;
    }

    public void setclassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }
}