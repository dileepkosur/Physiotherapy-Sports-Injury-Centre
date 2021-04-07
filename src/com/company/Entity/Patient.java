package com.company.Entity;

import com.company.Utils.PhysiotherapyCentreUtil;

import java.util.StringJoiner;

public class Patient extends User{

    private int patientId;

    public Patient() throws Exception {
        patientId = PhysiotherapyCentreUtil.getPatientCounter();
        this.createNewUser();
    }

    public Patient(String name, String address, int age, long mobile) {
        super(name, address, age,mobile);
        patientId = PhysiotherapyCentreUtil.getPatientCounter();
    }

    public int getPatientId() {
        return this.patientId;
    }

    @Override
    public String toString() {
        return super.toString() +
                new StringJoiner(", ", Patient.class.getSimpleName() + "[", "]")
                .add("patientId='" + patientId + "'")
                .toString();
    }
}
