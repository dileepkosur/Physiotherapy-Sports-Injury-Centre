package com.company.Utils;

import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Enums.Treatment;

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

        physicians.put(Physician.getPhysicianId(), physician1);

        Physician physician2 = new Physician("Johny Depp", "Hatfield", 32, 789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                Treatment.ULTRASOUND,
                Treatment.HEAT_THERAPY,
                Treatment.CLASSICAL_OSTEOPATHY,
                Treatment.CRANIAL_OSTEOPATHY,
                Treatment.PHYSICAL_EXCERCISE)
                .setConsultationPeriod(new Physician.ConsultationPeriod(2, 11));



        physicians.put(Physician.getPhysicianId(), physician2);

    }

    public static void loadDefaultPatients( Map<Integer, Patient> patients){

        Patient patient1 = new Patient("Alex","London",25,12479721);
        patients.put(Patient.getPatientId(), patient1);

        Patient patient2 = new Patient("Mike","Hatfield",55,12479721);
        patients.put(Patient.getPatientId(), patient2);

        Patient patient3 = new Patient("Siva","Betford",26,12479721);
        patients.put(Patient.getPatientId(), patient3);

        Patient patient4 = new Patient("Brad","Manchester",75,12479721);
        patients.put(Patient.getPatientId(), patient4);

    }

}
