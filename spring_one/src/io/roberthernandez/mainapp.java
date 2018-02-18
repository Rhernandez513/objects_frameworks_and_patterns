package io.roberthernandez;

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

