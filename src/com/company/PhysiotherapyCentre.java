package com.company;

import com.company.Entity.Appointment;
import com.company.Entity.Patient;
import com.company.Entity.Physician;
import com.company.Entity.Visitor;

import com.company.Enums.AppointmentStatus;
import com.company.Enums.Treatment;
import com.company.Utils.DefaultDataUtil;
import com.company.Utils.PhysiotherapyCentreUtil;

import java.util.stream.*;

import java.util.*;

public class PhysiotherapyCentre {

    private static Map<Integer, Patient> patientMap = new HashMap<>();

    private static Map<Integer, Physician> physicianMap = new HashMap<>();

    private static List <Visitor> visitorMap = new ArrayList<>();

    private static Map<Integer, Appointment> appointmentMap = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

        loadDefaultData();

        initApplication();
    }

    private static void initApplication() {

        int input=-1;

        do{
            printInfo();

            try {
                input = scanner.nextInt();
            }catch (Exception ex){
                System.out.println("Error in reading input");
            }

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
                case -1:
                    break;
                default:
                    System.out.println("Kindly enter valid values from 1 to 4 or -1 to exit");
                    break;
            }

        }while (input != -1);

    }

    private static void createNewEntity(){

        int input=-1;

        do {
            printCreateInfo();

            try {
                input = scanner.nextInt();
            }catch (Exception ex){
                System.out.println("Error in reading input");
            }

            switch (input) {

                case 1:
                    try {
                        Physician physician  = new Physician();
                        physicianMap.put(physician.getPhysicianId(), physician);
                        System.out.println("Physician Added successfully - "+physician);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a physician. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        Patient patient  = new Patient();
                        patientMap.put(patient.getPatientId(), patient);
                        System.out.println("Patient Added successfully - "+patient);
                    } catch (Exception ex) {
                        System.out.println("Error in adding a patient. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        Visitor visitor  = new Visitor();
                        visitorMap.add(visitor);
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

        int input=-1;

        do {
            printAppointmentInfo();

            try {
                input = scanner.nextInt();
            }catch (Exception ex){
                System.out.println("Error in reading input");
            }

            switch (input) {

                case 1:
                    try {
                        Appointment appointment  = new Appointment();
                        appointmentMap.put(appointment.getAppointmentId(), appointment);
                        System.out.println("Appointment Added successfully - "+appointment);
                    }
                    catch (Exception ex) {
                        System.out.println("Error in adding a physician. Try again. Reason : " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter Appointment id to cancel");
                        input = scanner.nextInt();
                        appointmentMap.get(input).setAppointmentStatus(AppointmentStatus.CANCELLED);
                        System.out.println("Appointment cancelled successfully - "+ appointmentMap.get(input));
                    }
                    catch (ArrayIndexOutOfBoundsException indexEx){
                        System.out.println("Error in editing a appointment. Try again. Reason : No appointment found");
                    }
                    catch (Exception ex) {
                        System.out.println("Error in editing a appointment. Try again. Reason : " + ex.getMessage());
                    }

                    break;

                case 3:
                    try {
                        System.out.println("Enter Appointment id to view");
                        input = scanner.nextInt();
                        System.out.println(appointmentMap.get(input));
                    }
                    catch (ArrayIndexOutOfBoundsException indexEx){
                        System.out.println("Error in editing a appointment. Try again. Reason : No appointment found");
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

        int input=-1;

        do{

            printSearchInfo();
            try {
                input = scanner.nextInt();
            }catch (Exception ex){
                System.out.println("Error in reading input");
            }

            switch (input) {
                case 1:

                    System.out.println("Choose a treatment to search. To search single treatment [Ex: 4], To search list of treatment [Ex: 1,2,10] --> ");
                    Treatment[] treatments  =   Treatment.values();
                    try {
                        int i = 1;
                        for (Treatment treatment : treatments) {
                            System.out.println(i + ". " + treatment.name() + " [" + treatment.getExpertise() + "] ");
                            i++;
                        }

                        String inputStr;
                        scanner.nextLine();
                        inputStr = scanner.nextLine();

                        String[] indexes = inputStr.split(",");
                        List<Treatment> treatmentList = new ArrayList<Treatment>();

                        for (String index : indexes) {
                            treatmentList.add(treatments[Integer.parseInt(index)-1]);
                        }

                        Map<Integer, Physician> filteredValue=new HashMap<>();

                        for(Treatment treatment : treatmentList) {
                            Map<Integer, Physician> val = physicianMap.entrySet().stream().filter(qw -> qw.getValue().getTreatmentList().contains(treatment))
                                    .collect(Collectors.toMap(qw -> qw.getKey(), qw -> qw.getValue()));
                            filteredValue.putAll(val);
                        }

                        if(filteredValue.size() > 0) {
                            PhysiotherapyCentreUtil.printPhysician(filteredValue);
                        }else{
                            System.out.println("No Physician Found");
                        }

                    }
                    catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
                        System.out.println("Error in searching a physician. Try again. Reason : Invalid treatment value");
                    }
                    catch (Exception ex){
                        System.out.println("Error in searching a physician. Try again. Reason : "+ex.getMessage());
                    }
                    break;

                case 2:

                    System.out.println("Enter a physician name to search --> ");
                    scanner.nextLine();
                    String name = scanner.nextLine().toUpperCase();

                    Map<Integer, Physician> filteredValue = physicianMap.entrySet().stream().filter(qw -> qw.getValue().getName().contains(name))
                            .collect(Collectors.toMap(qw->qw.getKey(), qw->qw.getValue()));

                    if(filteredValue.size() > 0) {
                        PhysiotherapyCentreUtil.printPhysician(filteredValue);
                    }else{
                        System.out.println("No Physician Found");
                    }

            }

        }while (input != -1);

    }

    private static void createEditVisitorAppointment() {
    }


    private static void loadDefaultData() throws Exception{
        DefaultDataUtil.loadDefaultPhysicians(physicianMap);
        DefaultDataUtil.loadDefaultPatients(patientMap);
        DefaultDataUtil.loadDefaultAppointments(appointmentMap);
        DefaultDataUtil.loadDefaultVisitors(visitorMap);
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
                "2. Cancel an Appointment\n" +
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
                "1. Search Physician Based on Treatment\n" +
                "2. Search Physician Based on Physician Name\n" +
                "-1. Back");
    }

    public static Map<Integer, Patient> getPatientMap() {
        return patientMap;
    }

    public static Map<Integer, Physician> getPhysicianMap() {
        return physicianMap;
    }

    public static List<Visitor> getVisitorMap() {
        return visitorMap;
    }

    public static Map<Integer, Appointment> getAppointmentMap() {
        return appointmentMap;
    }
}
