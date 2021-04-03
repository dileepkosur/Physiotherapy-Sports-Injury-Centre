package com.company.Entity;

import java.util.StringJoiner;
import java.util.UUID;

public class Patient extends User{

    private String patientId;

    public Patient(String name, String address, int age,long mobile) {
        super(name, address, age,mobile);
        this.patientId = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Patient.class.getSimpleName() + "[", "]")
                .add("patientId='" + patientId + "'")
                .toString();
    }
}
