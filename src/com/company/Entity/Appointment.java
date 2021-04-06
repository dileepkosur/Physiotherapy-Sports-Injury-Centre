package com.company.Entity;

import com.company.Enums.AppointmentStatus;
import com.company.Enums.MedicalRoom;

import java.util.Date;
import java.util.StringJoiner;

public class Appointment {

    private static int appointmentId;
    private long patientId;
    private long doctorId;
    private Date date;
    private String treatment;
    private MedicalRoom room;
    private AppointmentStatus status;

    public static int getAppointmentId() {
        return appointmentId;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public MedicalRoom getRoom() {
        return room;
    }

    public void setRoom(MedicalRoom room) {
        this.room = room;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public void editAppointment(){

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Appointment.class.getSimpleName() + "[", "]")
                .add("appointmentId=" + appointmentId)
                .add("patientId=" + patientId)
                .add("doctorId=" + doctorId)
                .add("date=" + date)
                .add("treatment='" + treatment + "'")
                .add("room=" + room)
                .add("status=" + status)
                .toString();
    }
}
