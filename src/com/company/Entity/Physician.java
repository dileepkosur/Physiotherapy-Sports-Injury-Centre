package com.company.Entity;

import com.company.Enums.Treatment;
import com.company.Utils.PhysiotherapyCentreUtil;

import java.time.DayOfWeek;
import java.util.*;

public class Physician extends User{

    private int physicianId;

    private List<Treatment> treatmentList;

    private ConsultationPeriod consultationPeriod;

    public Physician() throws Exception{
        this.physicianId = PhysiotherapyCentreUtil.getPhysicianCounter();
        this.createNewPhysician();
    }

    public Physician(String name, String address, int age, long mobile) {
        super(name, address, age, mobile);
        this.physicianId = PhysiotherapyCentreUtil.getPhysicianCounter();
    }

    public Physician(String name, String address, int age, long mobile, List<Treatment> treatmentList) {
        super(name, address, age, mobile);
        this.physicianId    =   PhysiotherapyCentreUtil.getPhysicianCounter();
        this.treatmentList  =   treatmentList;
    }

    public Physician(String name, String address, int age, long mobile, Treatment... treatmentList) {
        super(name, address, age, mobile);
        this.physicianId    =   PhysiotherapyCentreUtil.getPhysicianCounter();
        this.treatmentList  =   Arrays.asList(treatmentList);
    }

    public List<Treatment> getTreatmentList() {
        return treatmentList;
    }

    public Physician setTreatmentList(List<Treatment> treatmentList) {
        this.treatmentList  =   treatmentList;
        return this;
    }

    public Physician setTreatmentList(Treatment... treatmentList) {
        this.treatmentList  =   Arrays.asList(treatmentList);
        return this;
    }

    public int getPhysicianId() {
        return this.physicianId;
    }

    public ConsultationPeriod getConsultationPeriod() {
        return consultationPeriod;
    }

    public Physician setConsultationPeriod(ConsultationPeriod consultationPeriod) {
        this.consultationPeriod = consultationPeriod;
        return this;
    }

    public void createNewPhysician() throws Exception{

        super.createNewUser();

        String input;
        Scanner scanner         =   new Scanner(System.in);
        Treatment[] treatments  =   Treatment.values();

        System.out.println("Select option for your Areas of Expertise [Ex: 1,2,3] --> ");

        try {
            int i = 1;
            for (Treatment treatment : treatments) {
                System.out.println(i + ". " + treatment.name() + " [" + treatment.getExpertise() + "] ");
                i++;
            }

            input = scanner.nextLine();
            this.setTreatments(input, treatments);
        }
        catch (NumberFormatException ex){
            throw new Exception("Invalid treatment values");
        }
        catch (ArrayIndexOutOfBoundsException indEx){
            throw new Exception("Please provide valid treatment value. From 1 To 10. Ex[1,5,10]");
        }

        int day, startTime;
        System.out.println("Enter enter your ConsultationPeriod details --> \n" +
                "Choose Day of a Week\n" +
                "1. Monday\n" +
                "2. Tuesday\n" +
                "3. Wednesday\n" +
                "4. Thursday\n" +
                "5. Friday");
        day = scanner.nextInt();

        System.out.println("Enter Start Time Starting from 9(9 am) to 18(6 pm) 1 to 2 is Lunch time. [Ex: 14]");
        startTime = scanner.nextInt();

        this.setConsultationPeriod(new ConsultationPeriod(day, startTime));

    }

    private void setTreatments(String input, Treatment[] treatments) {

        String[] indexes = input.split(",");
        List<Treatment> treatmentList = new ArrayList<Treatment>();

        for (String index : indexes) {
            treatmentList.add(treatments[Integer.parseInt(index)-1]);
        }
        this.setTreatmentList(treatmentList);

    }

    @Override
    public String toString() {
        return super.toString() +
                new StringJoiner(", ", Physician.class.getSimpleName() + "[", "]")
                .add("physicianId='" + physicianId + "'")
                .add("treatmentList=" + treatmentList)
                .toString() +
                this.getConsultationPeriod().toString();
    }

    public static class ConsultationPeriod {
        DayOfWeek  dayOfWeek;
        int startTime;
        int durationInHours=1;

        public ConsultationPeriod(int dayOfWeek, int startTime) throws Exception{

            if(dayOfWeek <1 || dayOfWeek > 5 || startTime <9 || startTime > 18 || startTime == 13){
                throw new Exception("Invalid ConsultationPeriod");
            }

            this.dayOfWeek = DayOfWeek.values()[dayOfWeek-1];
            this.startTime = startTime;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getDurationInHours() {
            return durationInHours;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", ConsultationPeriod.class.getSimpleName() + "[", "]")
                    .add("dayOfWeek=" + dayOfWeek)
                    .add("startTime=" + startTime)
                    .add("durationInHours=" + durationInHours)
                    .toString();
        }
    }

}
