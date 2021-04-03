package com.company.Entity;

import java.util.ArrayList;

public class Physician extends User{

    private String physicianId;
    private ArrayList<Expertise> areas_of_expertise;
//    private ArrayList<String> appointmentDays;
//    private ArrayList<String> consultaionDays;
//    private ArrayList<String> appointmentHours;
//    private ArrayList<String> consultationHours;

    public Physician(String name, String address, int age, long mobile, ArrayList<Expertise> areas_of_expertise) {
        super(name, address, age, mobile);
        this.areas_of_expertise = areas_of_expertise;
//        this.appointmentDays = appointmentDays;
//        this.consultaionDays = consultaionDays;
//        this.appointmentHours = appointmentHours;
//        this.consultationHours = consultationHours;
    }


    public ArrayList<Expertise> getAreas_of_expertise() {
        return areas_of_expertise;
    }

    public void setAreas_of_expertise(ArrayList<Expertise> areas_of_expertise) {
        this.areas_of_expertise = areas_of_expertise;
    }

//    public ArrayList<String> getAppointmentDays() {
//        return appointmentDays;
//    }
//
//    public void setAppointmentDays(ArrayList<String> appointmentDays) {
//        this.appointmentDays = appointmentDays;
//    }
//
//    public ArrayList<String> getConsultaionDays() {
//        return consultaionDays;
//    }
//
//    public void setConsultaionDays(ArrayList<String> consultaionDays) {
//        this.consultaionDays = consultaionDays;
//    }
//
//    public ArrayList<String> getAppointmentHours() {
//        return appointmentHours;
//    }
//
//    public void setAppointmentHours(ArrayList<String> appointmentHours) {
//        this.appointmentHours = appointmentHours;
//    }
//
//    public ArrayList<String> getConsultationHours() {
//        return consultationHours;
//    }

//    public void setConsultationHours(ArrayList<String> consultationHours) {
//        this.consultationHours = consultationHours;
//    }
}
