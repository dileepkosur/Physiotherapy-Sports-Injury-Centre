package com.company.Entity;

import com.company.Enums.Expertise;
import com.company.Enums.Treatment;

import java.util.*;

public class Physician extends User{

    private String physicianId;

    private List<Treatment> treatmentList;

    public Physician() throws Exception{
        this.physicianId    =   UUID.randomUUID().toString();
        this.createNewPhysician();
    }

    public Physician(String name, String address, int age, long mobile) {
        super(name, address, age, mobile);
    }

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

    public Physician createNewPhysician() throws Exception{

        super.createNewUser();

        String input;
        Scanner scanner         =   new Scanner(System.in);
        Treatment[] treatments  =   Treatment.values();

        System.out.println("Select option for your Areas of Expertise [Ex: 1,2,3] --> ");

        try {
            int i = 1;
            for (Treatment treatment : treatments) {
                System.out.println(i + ". " + treatment.name() + " [" + treatment.getExpertise() + "] ");
                i++;
            }

            input = scanner.nextLine();
            this.setTreatments(input, treatments);
        }
        catch (NumberFormatException ex){
            throw new Exception("Invalid treatment values");
        }

        return this;
    }

    private void setTreatments(String input, Treatment[] treatments) {

        String[] indexes = input.split(",");
        List<Treatment> treatmentList = new ArrayList<Treatment>();

        for (String index : indexes) {
            treatmentList.add(treatments[Integer.parseInt(index)-1]);
        }
        this.setTreatmentList(treatmentList);

    }

    @Override
    public String toString() {
        return super.toString() +
                new StringJoiner(", ", Physician.class.getSimpleName() + "[", "]")
                .add("physicianId='" + physicianId + "'")
                .add("treatmentList=" + treatmentList)
                .toString();
    }
}
