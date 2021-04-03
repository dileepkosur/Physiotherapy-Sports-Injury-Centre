package com.company.Enums;

import java.util.Arrays;
import java.util.List;

public enum TreatmentConfig {

    LEG,

    HAND;

    private List<String> subCategory;

    private TreatmentConfig(String... subCategories){
        this.subCategory = Arrays.asList(subCategories);
    }
    public List<String> getCategory(){
        return subCategory;
    }
}
