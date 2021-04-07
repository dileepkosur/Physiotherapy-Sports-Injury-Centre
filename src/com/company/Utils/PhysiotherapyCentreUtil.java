package com.company.Utils;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.PhysiotherapyCentre;

import java.util.Map;

public class PhysiotherapyCentreUtil {

    private static int physicianCounter=0;

    private static int patientCounter=0;

    private static int visitorCounter=0;

    public static int getPhysicianCounter() {
        return ++physicianCounter;
    }

    public static int getPatientCounter() {
        return ++patientCounter;
    }

    public static int getVisitorCounter() {
        return ++visitorCounter;
    }

    public static Physician getPhysician(int physicianID) throws Exception{

        Physician physician = PhysiotherapyCentre.getPhysicianMap().get(physicianID);

        if(physician == null){
            throw new Exception("No Physician Found");
        }

        return physician;
    }

    public static Patient getPatient(int patientID) throws Exception{

        Patient patient = PhysiotherapyCentre.getPatientMap().get(patientID);

        if(patient == null){
            throw new Exception("No Patient Found");
        }

        return patient;

    }

    public static Appointment getAppointment(int appointmentID) throws Exception{

        Appointment appointment = PhysiotherapyCentre.getAppointmentMap().get(appointmentID);

        if(appointment == null){
            throw new Exception("No Appointment Found");
        }

        return appointment;

    }
    public static void printPhysician(Map<Integer, Physician> physicianMap){
        System.out.println("Id\tName\t\t\t\t Mobile No\t\t Consultation Detail\tTreatments Provided");

        for(Map.Entry<Integer, Physician> entry : physicianMap.entrySet()){
            System.out.println(entry.getKey()+ "\t" + entry.getValue().getName() + "\t\t\t\t " + entry.getValue().getMobile() + "\t\t"
                    + entry.getValue().getConsultationPeriod().getDayOfWeek() + "-" + entry.getValue().getConsultationPeriod().getStartTime() + "\t"
                    + entry.getValue().getTreatmentList());
        }

    }

}
