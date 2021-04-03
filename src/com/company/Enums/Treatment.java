package com.company.Enums;

public enum Treatment {

    ELECTROTHERAPY (Expertise.PHYSIOTHERAPY),

    ULTRASOUND (Expertise.PHYSIOTHERAPY),

    HEAT_THERAPY (Expertise.PHYSIOTHERAPY),

    NEURAL_MOBILISATION (Expertise.PHYSIOTHERAPY),

    STRUCTURAL_OSTEOPATHY (Expertise.OSTEOPATHY),

    CLASSICAL_OSTEOPATHY (Expertise.OSTEOPATHY),

    CRANIAL_OSTEOPATHY (Expertise.OSTEOPATHY),

    PHYSICAL_EXCERCISE (Expertise.REHABILITATION),

    GYM (Expertise.REHABILITATION),

    SWIMMING_POOL (Expertise.REHABILITATION);

    private Expertise expertise;

    Treatment(Expertise expertise) {
        this.expertise = expertise;
    }

    public Expertise getExpertise() {
        return expertise;
    }

}
