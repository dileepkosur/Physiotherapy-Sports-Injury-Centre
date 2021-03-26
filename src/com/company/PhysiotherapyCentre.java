package com.company;

import com.company.Controller.RegistrationController;
import com.company.Entity.Expertise;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Utils.UserData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PhysiotherapyCentre {
    public PhysiotherapyCentre() {
        UserData userData=new UserData();
    }

    public static void main(String[] args) {
	// write your code here
        RegistrationController registrationController=new RegistrationController();
        registrationController.runRegistration();
    }

}
