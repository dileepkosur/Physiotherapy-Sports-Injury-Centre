package com.company;

import com.company.Controller.RegistrationController;
import com.company.Entity.Expertise;
import com.company.Entity.Patient;
import com.company.Entity.Physician;

import java.util.ArrayList;
import java.util.Scanner;

public class PhysiotherapyCentre {
    public static void main(String[] args) {
	// write your code here
        RegistrationController registrationController=new RegistrationController();
        registrationController.runRegistration();
    }

}
