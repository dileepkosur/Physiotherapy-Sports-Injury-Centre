package com.company.Entity;

import java.util.StringJoiner;

public class Patient extends User{

    private static int patientId;

    public Patient() throws Exception {
        patientId++;
        this.createNewUser();
    }

    public Patient(String name, String address, int age, long mobile) {
        super(name, address, age,mobile);
        patientId++;
    }

    public static int getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return super.toString() +
                new StringJoiner(", ", Patient.class.getSimpleName() + "[", "]")
                .add("patientId='" + patientId + "'")
                .toString();
    }
}
