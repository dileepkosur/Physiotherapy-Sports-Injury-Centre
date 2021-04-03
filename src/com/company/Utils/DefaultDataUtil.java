package com.company.Utils;

import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Enums.Treatment;

import java.util.List;

public class DefaultDataUtil {

    public static void createDefaultPhysicians(List<Physician> physicians){

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
                Treatment.SWIMMING_POOL);

        Physician physician2 = new Physician("Johny Depp", "Hatfield", 32, 789689632)
                .setTreatmentList(Treatment.ELECTROTHERAPY,
                Treatment.ULTRASOUND,
                Treatment.HEAT_THERAPY,
                Treatment.CLASSICAL_OSTEOPATHY,
                Treatment.CRANIAL_OSTEOPATHY,
                Treatment.PHYSICAL_EXCERCISE);

        physicians.add(physician1);
        physicians.add(physician2);

    }

    public static void createDefaultPatients(List<Patient> patients){

        patients.add(new Patient("Alex","London",25,12479721));
        patients.add(new Patient("Mike","Hatfield",55,12479721));
        patients.add(new Patient("Jessy","Luton",23,12479721));
        patients.add(new Patient("Siva","Betford",26,12479721));
        patients.add(new Patient("Brad","Manchester",75,12479721));

    }

}
