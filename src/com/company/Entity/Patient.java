package com.company.Entity;

public class Patient extends User{
    private long patientId;

    public Patient(String name, String address, int age,long mobile) {
        super(name, address, age,mobile);
    }
}
