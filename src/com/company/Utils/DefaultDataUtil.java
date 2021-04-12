package com.company.Utils;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;
import com.company.Enums.AppointmentStatus;
import com.company.Enums.MedicalRoom;
import com.company.Enums.Treatment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class DefaultDataUtil {

    public static void loadDefaultPhysicians( Map<Integer, Physician> physicians) throws Exception{

        Physician physician1 = new Physician("Dileep Kosur","Hatfield",26,789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.NEURAL_MOBILISATION,
                        Treatment.STRUCTURAL_OSTEOPATHY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE,
                        Treatment.GYM,
                        Treatment.SWIMMING_POOL)
                .setConsultationPeriod(new Physician.ConsultationPeriod(1, 12));
        physicians.put(physician1.getPhysicianId(), physician1);

        Physician physician2 = new Physician("Johny Depp", "Hatfield", 32, 789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE)
                .setConsultationPeriod(new Physician.ConsultationPeriod(2, 11));
        physicians.put(physician2.getPhysicianId(), physician2);

        Physician physician3 = new Physician("Mark Wright","Hatfield",26,1234567880)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.PHYSICAL_EXCERCISE,
                        Treatment.GYM,
                        Treatment.SWIMMING_POOL)
                .setConsultationPeriod(new Physician.ConsultationPeriod(3, 16));
        physicians.put(physician3.getPhysicianId(), physician3);

        Physician physician4 = new Physician("Steve bob","London",26,789689632)
                .setTreatmentList(
                        Treatment.STRUCTURAL_OSTEOPATHY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE,
                        Treatment.GYM,
                        Treatment.SWIMMING_POOL)
                .setConsultationPeriod(new Physician.ConsultationPeriod(4, 14));
        physicians.put(physician4.getPhysicianId(), physician4);

        Physician physician5 = new Physician("Anil Kumble","Hatfield",26,789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.NEURAL_MOBILISATION,
                        Treatment.STRUCTURAL_OSTEOPATHY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY
                )
                .setConsultationPeriod(new Physician.ConsultationPeriod(1, 12));
        physicians.put(physician5.getPhysicianId(), physician5);

        Physician physician6 = new Physician("Mitchel","Hatfield",26,789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.NEURAL_MOBILISATION,
                        Treatment.STRUCTURAL_OSTEOPATHY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE,
                        Treatment.GYM,
                        Treatment.SWIMMING_POOL)
                .setConsultationPeriod(new Physician.ConsultationPeriod(1, 12));
        physicians.put(physician6.getPhysicianId(), physician6);

        Physician physician7 = new Physician("Ross Geller", "Hatfield", 32, 789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                        Treatment.ULTRASOUND,
                        Treatment.HEAT_THERAPY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE)
                .setConsultationPeriod(new Physician.ConsultationPeriod(2, 11));
        physicians.put(physician7.getPhysicianId(), physician7);

    }

    public static void loadDefaultPatients( Map<Integer, Patient> patients){

        Patient patient1 = new Patient("Alex","London",25,12479721);
        patients.put(patient1.getPatientId(), patient1);

        Patient patient2 = new Patient("Mike","Hatfield",55,12479721);
        patients.put(patient2.getPatientId(), patient2);

        Patient patient3 = new Patient("Siva","Betford",26,12479721);
        patients.put(patient3.getPatientId(), patient3);

        Patient patient4 = new Patient("Brad","Manchester",75,12479721);
        patients.put(patient4.getPatientId(), patient4);

        Patient patient5 = new Patient("Rohit","London",25,12479721);
        patients.put(patient5.getPatientId(), patient1);

        Patient patient6 = new Patient("Vas","Hatfield",55,12479721);
        patients.put(patient6.getPatientId(), patient2);

        Patient patient7 = new Patient("Kevin","Betford",26,12479721);
        patients.put(patient7.getPatientId(), patient3);

        Patient patient8 = new Patient("Ashley","Manchester",75,12479721);
        patients.put(patient8.getPatientId(), patient4);

        Patient patient9 = new Patient("Philip","Betford",26,12479721);
        patients.put(patient9.getPatientId(), patient3);

        Patient patient10 = new Patient("Dina","Manchester",75,12479721);
        patients.put(patient10.getPatientId(), patient4);
    }

    public static void loadDefaultAppointments(Map<Integer, Appointment> appointmentList) throws Exception {
        Appointment appointment1=new Appointment(1,1, LocalDateTime.parse("06-Apr-2021 14", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.CLASSICAL_OSTEOPATHY, MedicalRoom.MEDICAL_CONSULTING_SUITE_A, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment1.getAppointmentId(),appointment1);

        Appointment appointment2=new Appointment(1,1, LocalDateTime.parse("09-Apr-2021 15", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.GYM, MedicalRoom.GYM, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment2.getAppointmentId(),appointment2);

        Appointment appointment3=new Appointment(1,1, LocalDateTime.parse("20-Apr-2021 14", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.STRUCTURAL_OSTEOPATHY, MedicalRoom.MEDICAL_CONSULTING_SUITE_B, AppointmentStatus.UPCOMING);
        appointmentList.put(appointment3.getAppointmentId(),appointment3);

        Appointment appointment4=new Appointment(1,1, LocalDateTime.parse("21-Apr-2021 15", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.ULTRASOUND, MedicalRoom.MEDICAL_CONSULTING_SUITE_C, AppointmentStatus.UPCOMING);
        appointmentList.put(appointment4.getAppointmentId(),appointment4);

        Appointment appointment5=new Appointment(2,2, LocalDateTime.parse("06-Apr-2021 10", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.PHYSICAL_EXCERCISE, MedicalRoom.MEDICAL_CONSULTING_SUITE_A, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment5.getAppointmentId(),appointment5);

        Appointment appointment6=new Appointment(2,2, LocalDateTime.parse("08-Apr-2021 15", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.HEAT_THERAPY, MedicalRoom.MEDICAL_CONSULTING_SUITE_A, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment6.getAppointmentId(),appointment6);

        Appointment appointment7=new Appointment(3,2, LocalDateTime.parse("21-Apr-2021 11", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.ULTRASOUND, MedicalRoom.MEDICAL_CONSULTING_SUITE_B, AppointmentStatus.UPCOMING);
        appointmentList.put(appointment7.getAppointmentId(),appointment7);

        Appointment appointment8=new Appointment(4,3, LocalDateTime.parse("08-Apr-2021 16", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.ELECTROTHERAPY, MedicalRoom.MEDICAL_CONSULTING_SUITE_A, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment8.getAppointmentId(),appointment8);

        Appointment appointment9=new Appointment(5,3, LocalDateTime.parse("08-Apr-2021 15", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.ELECTROTHERAPY, MedicalRoom.MEDICAL_CONSULTING_SUITE_A, AppointmentStatus.COMPLETED);
        appointmentList.put(appointment9.getAppointmentId(),appointment9);

        Appointment appointment10=new Appointment(6,4, LocalDateTime.parse("20-Apr-2021 14", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.STRUCTURAL_OSTEOPATHY, MedicalRoom.MEDICAL_CONSULTING_SUITE_B, AppointmentStatus.UPCOMING);
        appointmentList.put(appointment10.getAppointmentId(),appointment10);

        Appointment appointment11=new Appointment(1,5, LocalDateTime.parse("21-Apr-2021 15", DateTimeFormatter.ofPattern("dd-MMM-yyyy HH")),Treatment.NEURAL_MOBILISATION, MedicalRoom.MEDICAL_CONSULTING_SUITE_C, AppointmentStatus.UPCOMING);
        appointmentList.put(appointment11.getAppointmentId(),appointment11);

    }

    public static void loadDefaultVisitors(List<Visitor> visitorList) {
        /* Need to loadDefaultVisitors */
    }
}
