package com.school.project.data;

public class Course {
    private long id;
    private String name;
    private static long idcount = 0;

    public Course(){
        this("");
    }
    public Course(String name) {
        this.id = idcount++;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}