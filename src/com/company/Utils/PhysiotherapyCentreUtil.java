package com.company.Utils;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.PhysiotherapyCentre;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhysiotherapyCentreUtil {

    private static int physicianCounter=0;

    private static int patientCounter=0;

    private static int visitorCounter=0;

    private static int appointmentCounter=0;

    public static int getAppointmentCounter() { return ++appointmentCounter;}

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

    public static List<Appointment> getAppointmentsByPhysicianId(int physicianId) throws Exception{

        return PhysiotherapyCentre.getAppointmentMap().values().stream().filter(appointment ->
                appointment.getPhysicianId() == physicianId).collect(Collectors.toList());

    }

    public static List<Appointment> getAppointmentsByPatientId(int ptientId) throws Exception{

        return PhysiotherapyCentre.getAppointmentMap().values().stream().filter(appointment ->
                appointment.getPatientId() == ptientId).collect(Collectors.toList());

    }

    public static void printAppointmentInterval(int physicianId) throws Exception{

        List<Appointment> appointments = PhysiotherapyCentreUtil.getAppointmentsByPhysicianId(physicianId);
        if(appointments.size() > 0){
            System.out.println("Below are the date time where physician busy with appointments. You can't book an appointment in this interval");
        }
        for(Appointment appointment : appointments){
            System.out.println(
                    appointment.getDateTime().toLocalDate()+" "+appointment.getDateTime().toLocalTime()+" to "+
                            appointment.getDateTime().plusHours(1).toLocalDate()+" "+appointment.getDateTime().plusHours(1).toLocalTime());
        }
    }

    public static void printPhysician(Map<Integer, Physician> physicianMap) throws Exception{
        System.out.println("Id\tName\t\t\t\t Mobile No\t\t Consultation Detail\tTreatments Provided");

        for(Map.Entry<Integer, Physician> entry : physicianMap.entrySet()){
            System.out.println(entry.getKey()+ "\t" + entry.getValue().getName() + "\t\t\t\t " + entry.getValue().getMobile() + "\t\t"
                    + entry.getValue().getConsultationPeriod().getDayOfWeek() + "-" + entry.getValue().getConsultationPeriod().getStartTime() + "\t"
                    + entry.getValue().getTreatmentList());

            /*Comment out this line if we don't need it*/
            printAppointmentInterval(entry.getKey());
        }

    }

}
