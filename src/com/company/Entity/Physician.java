package com.company.Entity;

import com.company.Enums.Treatment;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;

public class Physician extends User{

    private String physicianId;

    private List<Treatment> treatmentList;

    public Physician(String name, String address, int age, long mobile, List<Treatment> treatmentList) {
        super(name, address, age, mobile);
        this.physicianId    =   UUID.randomUUID().toString();
        this.treatmentList  =   treatmentList;
    }

    public Physician(String name, String address, int age, long mobile, Treatment... treatmentList) {
        super(name, address, age, mobile);
        this.physicianId    =   UUID.randomUUID().toString();
        this.treatmentList  = Arrays.asList(treatmentList);
    }

    public List<Treatment> getExpertiseList() {
        return treatmentList;
    }

    public Physician setTreatmentList(List<Treatment> treatmentList) {
        this.treatmentList  =   treatmentList;
        return this;
    }

    public Physician setTreatmentList(Treatment... treatmentList) {
        this.treatmentList  =   Arrays.asList(treatmentList);
        return this;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Physician.class.getSimpleName() + "[", "]")
                .add("physicianId='" + physicianId + "'")
                .add("treatmentList=" + treatmentList)
                .toString();
    }
}
