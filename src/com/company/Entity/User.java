package com.company.Entity;

public abstract class User {
    private String name;
    private String address;
    private int age;
    private long mobile;

    public User(String name, String address, int age,long mobile) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobile=mobile;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
