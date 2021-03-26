package com.company.Utils;

import com.company.Entity.Expertise;
import com.company.Entity.Patient;
import com.company.Entity.Physician;

import java.util.ArrayList;

public class UserData {
    ArrayList<Physician> physicians=new ArrayList<Physician>();
    ArrayList<Patient> patients=new ArrayList<Patient>();

    public UserData(){
        // Patients Data
        patients.add(new Patient("Alex","London",25,12479721));
        patients.add(new Patient("Mike","Hatfield",55,12479721));
        patients.add(new Patient("Jessy","Luton",23,12479721));
        patients.add(new Patient("Siva","Betford",26,12479721));
        patients.add(new Patient("Brad","Manchester",75,12479721));
        // Physicians Data
        ArrayList<Expertise> expertise = new ArrayList<Expertise>();
        ArrayList<String> treatmentList=new ArrayList<String>();
        ArrayList<String> treatmentList1=new ArrayList<String>();
        ArrayList<String> treatmentList2=new ArrayList<String>();
        treatmentList.add("Electrotherapy");treatmentList.add("Ultrasound");treatmentList.add("neural mobilisation");treatmentList.add("Heat Therapy");
        expertise.add(new Expertise("Physiotherapy",treatmentList));
        treatmentList1.add("Structural Osteopathy");treatmentList1.add("Classical Osteopathy");treatmentList1.add("Cranial Osteopathy");
        expertise.add(new Expertise("Osteopathy",treatmentList1));
        treatmentList2.add("Physical Excercise");treatmentList2.add("Gym");treatmentList2.add("Swimming Pool");
        expertise.add(new Expertise("Rehabilitation",treatmentList2));
        this.physicians.add(new Physician("Dileep Kosur","Hatfield",26,789689632,expertise));
        // Physician 2
        ArrayList<Expertise> expertise2 = new ArrayList<Expertise>();
        ArrayList<String> treatmentList3=new ArrayList<String>();
        ArrayList<String> treatmentList4=new ArrayList<String>();
        ArrayList<String> treatmentList5=new ArrayList<String>();
        treatmentList3.add("Electrotherapy");treatmentList3.add("Ultrasound");treatmentList3.add("neural mobilisation");
        expertise2.add(new Expertise("Physiotherapy",treatmentList3));
        treatmentList4.clear();
        treatmentList4.add("Structural Osteopathy");
        expertise2.add(new Expertise("Osteopathy",treatmentList4));
        treatmentList5.clear();
        treatmentList5.add("Physical Excercise");treatmentList5.add("Gym");treatmentList5.add("Swimming Pool");
        expertise2.add(new Expertise("Rehabilitation",treatmentList5));
        this.physicians.add(new Physician("Dileep Kosur","Hatfield",26,789689632,
                expertise2));


    }
    public void addPhysician(Physician physician){
        this.physicians.add(physician);
        System.out.println("register");
    }
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    public ArrayList<Physician> getPhysicians() {
        return physicians;
    }

    public void setPhysicians(ArrayList<Physician> physicians) {
        this.physicians = physicians;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
