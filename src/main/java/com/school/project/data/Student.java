package com.school.project.data;

public class Student {
    private long idnum;
    private String name;
    private String address;
    private int phone;
    private static long idnumcount = 0;

    public Student() {
        this("");
    }

    public Student(String name) {
        this.idnum = idnumcount++;
    }

    public Student(String name, int phone, String address) {
        this.phone = phone;
        this.address = address;
        this.idnum = idnumcount++;
    }

    public long getIdnum() {
        return this.idnum;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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