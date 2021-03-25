package com.company.Controller;

import com.company.Entity.Expertise;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationController {
    ArrayList<String> appointmentDays=new ArrayList<String>();
    ArrayList<String> appointmentHours=new ArrayList<String>();
    ArrayList<String> consultationDays=new ArrayList<String>();
    ArrayList<String> consultationHours=new ArrayList<String>();
    ArrayList<Expertise> expertise = new ArrayList<Expertise>();
    public void runRegistration(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("*** Welcome ***\n");
            System.out.println("1: Register New Physician");
            System.out.println("2: Register New Patient");
            System.out.println("3: Back\n");
            int response = 0;
            response = scanner.nextInt();
            if (response == 1) {
                registerPhysician();
            } else if (response == 2) {
            }  else if (response == 3) {
                break;
            } else {
                System.out.println("Invalid option, please try again!\n");
            }
        }
    }

    private void registerPhysician(){
        Scanner scanner = new Scanner(System.in);
        String name,age,address;long mobile,id;int temp;
        System.out.println("*** Registration :: Register New Physician ***\n");
        System.out.println("Enter Name --> ");
        name=scanner.nextLine().trim();
        System.out.println("Enter Age --> ");
        age=scanner.nextLine().trim();
        System.out.println("Enter Address --> ");
        address=scanner.nextLine().trim();
        System.out.println("Enter mobile number --> ");
        mobile=scanner.nextLong();
        areaOfExpertise();

        System.out.println("Physician has been registered successfully!\n");
    }
    public void areaOfExpertise(){
        Scanner scanner = new Scanner(System.in);
        int temp;String title;
        while(true){
            System.out.println("Select option for you Areas of Expertise --> ");
            System.out.println("1. Physiotherapy \n2. Osteopathy \n3. Rehabilitation\n4. Back");
            temp=scanner.nextInt();
            if (temp==1){
                title="Physiotherapy";
                listOfTreatments(title);
            } else if (temp==2){
                title="Osteopathy";
                listOfTreatments(title);
            }else if (temp==3){
                title="Rehabilitation";
                listOfTreatments(title);
            }else{
                System.out.println("Invalid option, please try again!\n");
            }
            if (temp==4){
                break;
            }
        }
        System.out.println("ajgfdak");
    }
    public void listOfTreatments(String title){
        ArrayList<String> treatmentList=new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        if (title.contentEquals("Physiotherapy")){
            while(true){
                System.out.println("Select treatments you can provide for Physiotherapy--> ");
                System.out.println("1: Electrotherapy");
                System.out.println("2: Ultrasound");
                System.out.println("3: Heat Therapy");
                System.out.println("4: neural mobilisation");
                System.out.println("5: Back\n");
                int response = 0;
                response = scanner.nextInt();
                if (response == 1) {
                    treatmentList.add("Electrotherapy");
                } else if (response == 2) {
                    treatmentList.add("Ultrasound");
                }  else if (response == 3) {
                    treatmentList.add("Heat Therapy");
                }else if (response == 4) {
                    treatmentList.add("neural mobilisation");
                }  else if (response == 5) {
                    break;
                } else {
                    System.out.println("Invalid option, please try again!\n");
                }

            }
        } else if (title.contentEquals("Osteopathy")){
            while(true){
                System.out.println("Select treatments you can provide for Osteopathy--> ");
                System.out.println("1: Structural Osteopathy");
                System.out.println("2: Classical Osteopathy");
                System.out.println("3: Cranial Osteopathy");
                System.out.println("4: Back\n");
                int response = 0;
                response = scanner.nextInt();
                if (response == 1) {
                    treatmentList.add("Structural Osteopathy");
                } else if (response == 2) {
                    treatmentList.add("Classical Osteopathy");
                }  else if (response == 3) {
                    treatmentList.add("Cranial Osteopathy");
                }else if (response == 4) {
                    break;
                } else {
                    System.out.println("Invalid option, please try again!\n");
                }
            }
        }else if (title.contentEquals("Rehabilitation") ){
            while(true){
                System.out.println("Select treatments you can provide for Rehabilitation--> ");
                System.out.println("1: Physical Excercise");
                System.out.println("2: Gym");
                System.out.println("3: Swimming Pool");
                System.out.println("4: Back\n");
                int response = 0;
                response = scanner.nextInt();
                if (response == 1) {
                    treatmentList.add("Physical Excercise");
                } else if (response == 2) {
                    treatmentList.add("Gym");
                }  else if (response == 3) {
                    treatmentList.add("Swimming Pool");
                }else if (response == 4) {
                    break;
                } else {
                    System.out.println("Invalid option, please try again!\n");
                }
            }
        }
        expertise.add(new Expertise(title,treatmentList));
    }
}
