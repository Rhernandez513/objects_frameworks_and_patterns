package io.roberthernandez;

import sun.applet.Main;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class mainapp {
    public static void main(String[] args) {


        testListFacilities();
        testGetFacilityInformation();
        testRequestAvalibleCapacity();
        testAddNewFacility();
        testAddFacilityDetail();
        testRemoveFacility();

        testIsInUseDuringInterval();
        testAssignFacilityToUse();
        testVacateFacility();
        testListActualUsage();
        testcalFacilityUsageRate();
        testListInspection();

        testMakeMaintRequest();
        testScheduleMaintenance();
        testcalMaintenanceCostForFacility();
        testcalProblemRateForFacility();
        testcalDownTimeForFacility();
        testListMaintRequest();
        testListMaintenance();
        testListFacilityProblems();

    }

    public  static void testListInspection(){
        System.out.println("Test list all Inspections:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        User user_two = new User();
        user_two.setUserID(2);
        user_two.setUsername("Jun");
        user_two.setContactInfo("jwei4@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        Facility facility_two = new Facility();
        facility_two.setCapacity(50);
        facility_two.setName("Loyola Cuneo");

        InspectionRequest ir1=new InspectionRequest(facility_one,user_one);
        InspectionRequest ir2 = new InspectionRequest(facility_two,user_two);


        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        Inspection ins1=new Inspection(ir1,s);


        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        Inspection ins2=new Inspection(ir2, s2);

        InspectionManagement im=new InspectionManagement();
        im.addInspection(ins1);
        im.addInspection(ins2);

        im.listInspections();

    }


    public static void testListFacilityProblems(){
        System.out.println("Test list all problems of facility:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.println("List of problems of " + facility_one + ":");
        mm.listFacilityProblems(facility_one);


    }


    public static void testListMaintenance(){
        System.out.println("Test list all maintenance:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print(mm.listMaintenance());
        System.out.println();

    }


    public static void testListMaintRequest(){
        System.out.println("Test list of all maintenance requests:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print(mm.listMaintRequests());
        System.out.println();

    }


    public static void testcalDownTimeForFacility(){
        System.out.println("Test calculation of total maintenance time for facility:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The total down time of maintenances for " + facility_one + " is: ");
        System.out.print(mm.calcDownTimeForFacility(facility_one));
        System.out.println(" second.");
        System.out.println();;

    }

    public  static void  testcalProblemRateForFacility(){
        System.out.println("Test calculation of problem rate for facility:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The problem rate of " + facility_one + " is: ");
        System.out.println(mm.calcProblemRateForFacility(facility_one,10));
        System.out.println();
    }


    public static void testcalMaintenanceCostForFacility(){
        System.out.println("Test calculation of maintenance cost for facility:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new Maintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequest();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new Schedule();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new Maintenance(mr2, s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangement();
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The total cost of maintenances for " + facility_one + " is: ");
        System.out.println(mm.calcMaintenanceCostForFacility(facility_one));




    }


    public static void testScheduleMaintenance(){
        System.out.println("Test schedule maintenance:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";

        Maintenance maint=new Maintenance(mr,s,c,problem);

        System.out.println(maint);



    }


    public static void testMakeMaintRequest(){
        System.out.println("Test make maintenace request:");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequest();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        System.out.println(mr);


    }


    public static void testcalFacilityUsageRate(){
        System.out.print("Test calculation of facility usage rate: ");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");



        Usage use=new Usage();
        use.setUser(user_one);

        use.setFacility(facility_one);
        use.setReservations(5);



        System.out.print("In this usage, actual usage is: ");
        System.out.println(use.listActualUsage());
        System.out.print("Facility capacity is: ");
        System.out.println(use.getMax_capacity());
        System.out.print("The usage rate is: ");
        System.out.println(use.calcUsageRate());


    }

    public static void testListActualUsage() {
        System.out.print("Test List Actual Usage: ");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Usage use=new Usage();
        use.setUser(user_one);

        use.setFacility(facility_one);

        use.assignFacilityToUse(use.getFacility());

        UsageManagement management = new UsageManagement();
        management.AddUsage(use);
        System.out.print("Acutal Usage: ");
        management.listActualUsage(use.getFacility());
    }

    public static void testVacateFacility() {
        System.out.print("Test Vacate Facility: ");
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Usage use=new Usage();
        use.setUser(user_one);

        use.setFacility(facility_one);

        use.assignFacilityToUse(use.getFacility());
        use.vacateFacility();
        // facilities in use will be null now
    }

    public static void testAssignFacilityToUse() {
        System.out.println("Test Assign Facility To Use: ");

        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Usage use=new Usage();
        use.setUser(user_one);

        use.setFacility(facility_one);

        use.assignFacilityToUse(use.getFacility());


    }
    public static void testIsInUseDuringInterval() {
        User user_one = new User();
        user_one.setUserID(1);
        user_one.setUsername("Robert");
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = new Facility();
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 1);
        Date second_time = gcal.getTime();
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();


        Schedule s=new Schedule();

        s.setStartTime(first_time);
        s.setEndTime(third_time);



        Usage use=new Usage();
        use.setUser(user_one);
        use.setSchedule(s);
        use.setFacility(facility_one);

        System.out.print("Test Use interval: ");
        System.out.println(use.isInUseDuringInterval(second_time));


    }

    public static void testRemoveFacility() {
        System.out.print("Test Remove Facility: ");
        FacilityManagement management = new FacilityManagement();

        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        management.addFacility(facility_one);
        management.removeFacility(facility_one);
        System.out.print("Should be blank: ");
        management.listFacilities();
        System.out.println();
    }

    public static void testAddFacilityDetail() {
        System.out.print("Test Add Facility Detail: ");
        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        String detailString = "Located on Lake Shore Campus";
        FacilityDetail detail = new FacilityDetail(detailString);

        facility_one.addFacilityDetail(detail);
        ArrayList<FacilityDetail> details = facility_one.getFacilityDetails();

        for (FacilityDetail det : details)  {
            System.out.print("Facility Detail: ");
            System.out.println(det);
        }
    }

    public static void testAddNewFacility() {
        System.out.print("Test Add New Facility: ");
        FacilityManagement management = new FacilityManagement();

        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        management.addFacility(facility_one);

        management.listFacilities();

    }

    public static void testRequestAvalibleCapacity() {
        System.out.print("Test Request Availible Capacity: ");
        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        facility_one.requestAvailableCapacity();
    }

    public static void testGetFacilityInformation() {
        System.out.print("Test Get Facility Information: ");
        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        System.out.println(facility_one.getFacilityInformation());
    }

    public static void testListFacilities() {
        System.out.print("Test List Facilities: ");
        FacilityManagement management = new FacilityManagement();

        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        Facility facility_two = new Facility();
        facility_two.setName("Loyola Cuneo");
        facility_two.setCapacity(30);

        management.addFacility(facility_one);
        management.addFacility(facility_two);

        management.listFacilities();
    }
    public static Schedule createSchedule() {
        Date first_time = new Date();

        Schedule schedule = new Schedule();

        schedule.setStartTime(first_time);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Date second_time = new Date();

        schedule.setEndTime(second_time);

        return schedule;
    }
}

