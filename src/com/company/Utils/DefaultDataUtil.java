package com.company.Utils;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;
import com.company.Enums.Treatment;

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
        physicians.put(physician3.getPhysicianId(), physician1);

        Physician physician4 = new Physician("Steve Kosur","London",26,789689632)
                .setTreatmentList(
                        Treatment.STRUCTURAL_OSTEOPATHY,
                        Treatment.CLASSICAL_OSTEOPATHY,
                        Treatment.CRANIAL_OSTEOPATHY,
                        Treatment.PHYSICAL_EXCERCISE,
                        Treatment.GYM,
                        Treatment.SWIMMING_POOL)
                .setConsultationPeriod(new Physician.ConsultationPeriod(4, 14));
        physicians.put(physician4.getPhysicianId(), physician1);

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
        physicians.put(physician5.getPhysicianId(), physician1);

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

    }

    public static void loadDefaultAppointments(Map<Integer, Appointment> appointmentList) {
        /* Need to loadDefaultAppointments */
    }

    public static void loadDefaultVisitors(List<Visitor> visitorList) {
        /* Need to loadDefaultVisitors */
    }
}
