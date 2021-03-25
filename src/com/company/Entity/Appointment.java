package com.company.Entity;

import com.company.Enums.MedicalRoom;

import java.util.Date;

public class Appointment {
    private long appointmentId;
    private long patientId;
    private long doctorId;
    private Date date;
    private String treatment;
    private MedicalRoom room;
    private boolean isAttended;
}
