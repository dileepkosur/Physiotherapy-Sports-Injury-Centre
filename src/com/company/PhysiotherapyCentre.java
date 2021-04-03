package com.company;

import com.company.Controller.RegistrationController;
import com.company.Utils.UserData;


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
