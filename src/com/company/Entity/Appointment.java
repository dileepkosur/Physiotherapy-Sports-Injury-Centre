package com.company.Entity;

import com.company.Enums.AppointmentStatus;
import com.company.Enums.MedicalRoom;
import com.company.Enums.Treatment;
import com.company.Utils.PhysiotherapyCentreUtil;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class Appointment {

    private int appointmentId;
    private int patientId;
    private int physicianId;
    private LocalDateTime dateTime;
    private Treatment treatment;
    private MedicalRoom medicalRoom;
    private AppointmentStatus appointmentStatus;

    public Appointment() throws Exception{
        this.appointmentId=PhysiotherapyCentreUtil.getAppointmentCounter();
        this.appointmentStatus = AppointmentStatus.UPCOMING;
        this.createNewAppointment();
    }

    public Appointment(int patientId, int physicianId, LocalDateTime dateTime, Treatment treatment, MedicalRoom medicalRoom, AppointmentStatus appointmentStatus) {
        this.appointmentId=PhysiotherapyCentreUtil.getAppointmentCounter();
        this.patientId = patientId;
        this.physicianId = physicianId;
        this.dateTime = dateTime;
        this.treatment = treatment;
        this.medicalRoom = medicalRoom;
        this.appointmentStatus = appointmentStatus;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) throws Exception{
        PhysiotherapyCentreUtil.getPatient(patientId);
        this.patientId = patientId;
    }

    public int getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(int physicianId) throws Exception{
        PhysiotherapyCentreUtil.getPhysician(physicianId);
        this.physicianId = physicianId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public void setDateTime(LocalDateTime dateTime) throws Exception{
        if(dateTime.getDayOfWeek() == DayOfWeek.SATURDAY || dateTime.getDayOfWeek() == DayOfWeek.SUNDAY){
            throw new Exception("Can't book an appointment on weekends. Saturday and Sunday are weekend");
        }

        Physician physician = PhysiotherapyCentreUtil.getPhysician(this.physicianId);

        if(dateTime.getHour() == 13){
            throw new Exception("Sorry, the given time is lunch break. please change the time");
        }

        if(dateTime.getDayOfWeek() == physician.getConsultationPeriod().dayOfWeek && dateTime.getHour() == physician.getConsultationPeriod().startTime){
            throw new Exception("Sorry, the given period is consultation hour. please change the time");
        }
        this.dateTime = dateTime;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) throws Exception{

        Physician physician = PhysiotherapyCentreUtil.getPhysician(this.physicianId);

        if(!physician.getTreatmentList().contains(treatment)) {
            throw new Exception("Doctor is not providing such treatment. He is providing the below treatments\n" +
                    physician.getTreatmentList());
        }
        this.treatment = treatment;
    }

    public MedicalRoom getMedicalRoom() {
        return medicalRoom;
    }

    public void setMedicalRoom(MedicalRoom medicalRoom) {
        this.medicalRoom = medicalRoom;
    }

    private void createNewAppointment() throws Exception{

        int input;
        Scanner scanner = new Scanner(System.in);
        MedicalRoom[] medicalRooms  =   MedicalRoom.values();

        System.out.println("Enter PatientId");
        this.setPatientId(scanner.nextInt());

        System.out.println("Enter PhysicianId");
        this.setPhysicianId(scanner.nextInt());

        Physician physician = PhysiotherapyCentreUtil.getPhysician(this.physicianId);
        List<Treatment> treatments = physician.getTreatmentList();

        System.out.println("Choose Treatment");
        try {
            int i = 1;
            for (Treatment treatment : treatments) {
                System.out.println(i + ". " + treatment.name() + " [" + treatment.getExpertise() + "] ");
                i++;
            }

            input = scanner.nextInt();
            this.setTreatment(treatments.get(input-1));
        }
        catch (ArrayIndexOutOfBoundsException indEx){
            throw new Exception("Please provide valid treatment value.");
        }

        System.out.println("Choose MedicalRoom");
        try {
            int i = 1;
            for (MedicalRoom medicalRoom : medicalRooms) {
                System.out.println(i + ". " + medicalRoom.name() );
                i++;
            }

            input = scanner.nextInt();
            this.setMedicalRoom(medicalRooms[input-1]);
        }
        catch (ArrayIndexOutOfBoundsException indEx){
            throw new Exception("Please provide valid MedicalRoom. From 1 To 5.");
        }

        System.out.println("Enter Appointment Date [Ex: 06-Apr-2021 14:00:00]");
        LocalDateTime dateTime;

        try{
            scanner.nextLine();
            String dateStr = scanner.nextLine();
            dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"));

        }catch (Exception ex){
            throw new Exception("Invalid Date refer example date [Ex: 06-Apr-2021 14:00:00]");
        }

        if(Objects.requireNonNull(dateTime).isBefore(LocalDateTime.now())){
            throw new Exception("Appointment can't be a past date");
        }
        this.setDateTime(dateTime);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Appointment.class.getSimpleName() + "[", "]")
                .add("appointmentId="+ appointmentId)
                .add("patientId=" + patientId)
                .add("physicianId=" + physicianId)
                .add("dateTime=" + dateTime)
                .add("treatment=" + treatment)
                .add("medicalRoom=" + medicalRoom)
                .add("appointmentStatus=" + appointmentStatus)
                .toString();
    }
}
