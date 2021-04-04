package com.company;

import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;

import com.company.Utils.DefaultDataUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhysiotherapyCentre {

    private static List<Patient> patientList = new ArrayList<>();

    private static List<Physician> physicianList = new ArrayList<>();

    private static List<Visitor> visitorList = new ArrayList<>();

    public static void main(String[] args) throws Exception{

        addDefaultData();

        int input;
        Scanner scanner = new Scanner(System.in);

        printInfo();
        do {

            input = scanner.nextInt();

            switch (input) {

                case 1:
                    try {
                        Physician physician  = new Physician();
                        physicianList.add(physician);
                        System.out.println("Physician Added successfully - "+physician);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a physician. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        Patient patient  = new Patient();
                        patientList.add(patient);
                        System.out.println("Patient Added successfully - "+patient);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a patient. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        Visitor visitor  = new Visitor();
                        visitorList.add(visitor);
                        System.out.println("Visitor Added successfully - "+visitor);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a visitor. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case -1:
                    break;

                default:
                    System.out.println("Kindly enter valid values from 1 to 3 or -1");
            }
            printInfo();

        } while (input != -1);
    }

    private static void addDefaultData(){
        DefaultDataUtil.createDefaultPhysicians(physicianList);
        DefaultDataUtil.createDefaultPatients(patientList);

    }

    private static void printInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Add Physician\n" +
                "2. Add Patient\n" +
                "3. Add Visitor\n" +
                "-1. Back");
    }


}
