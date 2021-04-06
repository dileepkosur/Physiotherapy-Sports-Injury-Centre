package com.company;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;

import com.company.Utils.DefaultDataUtil;

import java.util.*;

public class PhysiotherapyCentre {

    private static Map<Integer, Patient> patientList = new HashMap<>();

    private static Map<Integer, Physician> physicianList = new HashMap<>();

    private static List <Visitor> visitorList = new ArrayList<>();

    private static Map<Integer, Appointment> appointmentList = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

        loadDefaultData();

        initApplication();
    }

    private static void initApplication() {

        int input;

        do{
            printInfo();
            input = scanner.nextInt();

            switch (input){
                case 1:
                    createNewEntity();
                    break;
                case 2:
                    createEditAppointment();
                    break;
                case 3:
                    createEditVisitorAppointment();
                    break;
                case 4:
                    search();
                    break;
                default:
                    System.out.println("Kindly enter valid values from 1 to 4 or -1 to exit");
                    break;
            }

        }while (input != -1);

    }

    private static void createNewEntity(){

        int input;

        do {
            printCreateInfo();
            input = scanner.nextInt();

            switch (input) {

                case 1:
                    try {
                        Physician physician  = new Physician();
                        physicianList.put(Physician.getPhysicianId(), physician);
                        System.out.println("Physician Added successfully - "+physician);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a physician. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        Patient patient  = new Patient();
                        patientList.put(Patient.getPatientId(), patient);
                        System.out.println("Patient Added successfully - "+patient);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a patient. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        Visitor visitor  = new Visitor();
                        visitorList.add(visitor);
                        System.out.println("Visitor Added successfully - "+visitor);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a visitor. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case -1:
                    break;

                default:
                    System.out.println("Kindly enter valid values from 1 to 3 or -1");
                    break;
            }

        } while (input != -1);

    }

    private static void createEditAppointment(){

        int input;

        do {
            printAppointmentInfo();
            input = scanner.nextInt();

            switch (input) {

                case 1:
                    try {
                        Appointment appointment  = new Appointment();
                        appointmentList.put(Appointment.getAppointmentId(), appointment);
                        System.out.println("Appointment Added successfully - "+appointment);
                    }
                    catch (Exception ex) {
                        System.out.println("Error in adding a physician. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter Appointment id to edit");
                        input = scanner.nextInt();
                        Appointment appointment = appointmentList.get(input);
                        appointment.editAppointment();
                        System.out.println("Appointment edited successfully - "+appointment);
                    }
                    catch (ArrayIndexOutOfBoundsException indexEx){
                        System.out.println("Error in editing a appointment. Try again. Reason : There is no such appointment");
                    }
                    catch (Exception ex) {
                        System.out.println("Error in editing a appointment. Try again. Reason : " + ex.getMessage());
                    }

                    break;

                case 3:
                    try {
                        System.out.println("Enter Appointment id to view");
                        input = scanner.nextInt();
                        System.out.println(appointmentList.get(input));
                    }
                    catch (ArrayIndexOutOfBoundsException indexEx){
                        System.out.println("Error in editing a appointment. Try again. Reason : There is no such appointment");
                    }
                    catch (Exception ex) {
                        System.out.println("Error in viewing a appointment. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case -1:
                    break;

                default:
                    System.out.println("Kindly enter valid values from 1 to 3 or -1 to exit");
                    break;
            }

        } while (input != -1);

    }

    private static void search() {
    }

    private static void createEditVisitorAppointment() {
    }


    private static void loadDefaultData() throws Exception{
        DefaultDataUtil.loadDefaultPhysicians(physicianList);
        DefaultDataUtil.loadDefaultPatients(patientList);
    }

    private static void printInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Create New Physician/Patient/Visitor \n" +
                "2. Create/Edit/View an Appointment\n" +
                "3. Create/Edit/View a Visitor Admission\n" +
                "4. Search \n" +
                "-1. Back");
    }

    private static void printCreateInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Add Physician\n" +
                "2. Add Patient\n" +
                "3. Add Visitor\n" +
                "-1. Back");
    }

    private static void printAppointmentInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Create New Appointment\n" +
                "2. Edit an Appointment\n" +
                "3. View an Appointment\n" +
                "-1. Back");
    }

    private static void printVisitorInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Create New Visitor Appointment\n" +
                "2. Edit a Visitor Appointment\n" +
                "3. View a Visitor Appointment\n" +
                "-1. Back");
    }

    private static void printSearchInfo(){

        System.out.println("Kindly press any of the following keys\n" +
                "1. Search Based on Treatment\n" +
                "2. Search Based on Physician Name\n" +
                "-1. Back");
    }

    public static Map<Integer, Patient> getPatientList() {
        return patientList;
    }

    public static Map<Integer, Physician> getPhysicianList() {
        return physicianList;
    }

    public static List<Visitor> getVisitorList() {
        return visitorList;
    }

    public static Map<Integer, Appointment> getAppointmentList() {
        return appointmentList;
    }
}
