package com.company.Entity;

import java.util.Scanner;
import java.util.StringJoiner;

public abstract class User {

    private String name;
    private String address;
    private int age;
    private long mobile;

    public User() {
    }

    public User(String name, String address, int age, long mobile) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobile=mobile;
    }

    public long getMobile() {
        return mobile;
    }

    public User setMobile(long mobile) throws Exception{

        /*Add your validation here*/

        this.mobile = mobile;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) throws Exception{

        /*Add your validation here*/

        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) throws Exception{

        /*Add your validation here*/

        this.address = address;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) throws Exception{

        if(age<=0){
            throw new Exception("Invalid Age");
        }

        this.age = age;
        return this;
    }

    protected void createNewUser() throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name --> ");
        this.setName(scanner.nextLine().trim());

        System.out.println("Enter Address --> ");
        this.setAddress(scanner.nextLine().trim());

        System.out.println("Enter Age --> ");
        this.setAge(scanner.nextInt());

        System.out.println("Enter mobile number --> ");
        this.setMobile(scanner.nextLong());

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .add("age=" + age)
                .add("mobile=" + mobile)
                .toString();
    }
}
