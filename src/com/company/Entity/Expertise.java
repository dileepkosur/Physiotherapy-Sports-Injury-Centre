package com.company.Entity;

import java.util.ArrayList;

public class Expertise {
    private String title;
    private ArrayList<String> listOfTreatments;

    public Expertise(String title, ArrayList<String> listOfTreatments) {
        this.title = title;
        this.listOfTreatments = listOfTreatments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public void setListOfTreatments(ArrayList<String> listOfTreatments) {
        this.listOfTreatments = listOfTreatments;
    }
}
