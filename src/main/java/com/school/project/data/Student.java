package com.school.project.data;

import java.util.List;


public class Student {
    private long idnum;
    private String name;
    private int phone;
    private static long idnumcount = 0;
    

    
    public Student(){
        this("");
    }
    public Student(String name) {
        this.idnum = idnumcount++;
    }
    public Student(String name, int phone, List oncourses) {
        this.phone=phone;
        
        this.idnum = idnumcount++;
    }


    public long getIdnum() {
        return this.idnum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}