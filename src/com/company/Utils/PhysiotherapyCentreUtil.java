package com.company.Utils;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.PhysiotherapyCentre;

public class PhysiotherapyCentreUtil {

    public static Physician getPhysician(int physicianID) throws Exception{

        Physician physician = PhysiotherapyCentre.getPhysicianList().get(physicianID);

        if(physician == null){
            throw new Exception("No Physician Found");
        }

        return physician;
    }

    public static Patient getPatient(int patientID) throws Exception{

        Patient patient = PhysiotherapyCentre.getPatientList().get(patientID);

        if(patient == null){
            throw new Exception("No Patient Found");
        }

        return patient;

    }

    public static Appointment getAppointment(int appointmentID) throws Exception{

        Appointment appointment = PhysiotherapyCentre.getAppointmentList().get(appointmentID);

        if(appointment == null){
            throw new Exception("No Appointment Found");
        }

        return appointment;

    }

}
