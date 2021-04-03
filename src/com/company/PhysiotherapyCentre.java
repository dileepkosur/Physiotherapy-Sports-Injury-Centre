package com.company;

import com.company.Controller.RegistrationController;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;
import com.company.Utils.DefaultDataUtil;

import java.util.ArrayList;
import java.util.List;

public class PhysiotherapyCentre {

    private static List<Patient> patientList = new ArrayList<>();

    private static List<Physician> physicianList = new ArrayList<>();

    private static List<Visitor> visitorList = new ArrayList<>();

    public static void main(String[] args) {

        addDefaultData();

    }

    private static void addDefaultData(){

        DefaultDataUtil.createDefaultPhysicians(physicianList);
        DefaultDataUtil.createDefaultPatients(patientList);

        System.out.println(physicianList);
        System.out.println(patientList);

    }

}
