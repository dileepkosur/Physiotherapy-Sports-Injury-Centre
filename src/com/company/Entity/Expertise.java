package com.company.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Expertise {
    private String title;
    private List<String> listOfTreatments;

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

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public void setListOfTreatments(ArrayList<String> listOfTreatments) {
        this.listOfTreatments = listOfTreatments;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Expertise.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("listOfTreatments=" + listOfTreatments)
                .toString();
    }
}
