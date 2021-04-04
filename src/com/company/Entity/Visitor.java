package com.company.Entity;

import java.util.StringJoiner;

public class Visitor extends User{

    public Visitor() throws Exception{
        this.createNewUser();
    }

    public Visitor(String name, String address, int age, long mobile) {
        super(name, address, age,mobile);
    }

    @Override
    public String toString() {
        return super.toString() +
                new StringJoiner(", ", Visitor.class.getSimpleName() + "[", "]")
                .toString();
    }
}

