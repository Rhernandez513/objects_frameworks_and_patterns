package io.roberthernandez;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class mainapp {
    public static void main(String[] args) {

//        int TimesFacilitiesShouldBeInUse = 10;
//        double MaintenanceCost = 100.00;
//
//
//        System.out.println("Creating users and facilities, attempting to create a maintenance request on said facility");
//
//        User user_one = new User();
//        user_one.setUserID(1);
//        user_one.setUsername("Robert");
//        user_one.setContactInfo("rhernandez3@luc.edu");
//
//        Facility facility_one = new Facility();
//        facility_one.setCapacity(50);
//        facility_one.setName("Loyola Damen");
//
//
//        MaintenanceRequest request = new MaintenanceRequest();
//
//        request.setFacility(facility_one);
//        request.setUser(user_one);
//
//        System.out.println("Now that we have a request, we create an instance of Maintenance, which represents a " +
//                "single instance of a maintenance incident.");
//
//        System.out.println("In order to schedule we need a start and end time");
//
//        Schedule schedule = createSchedule();
//
//        Maintenance instance_one = new Maintenance(request, schedule, MaintenanceCost, "Boiler out");
//
//
//        MaintenanceManangement management_object = new MaintenanceManangement();
//
//        management_object.addMaintenanceToBeManaged(instance_one);
//
//        System.out.println("Let's add some detail to the problem report");
//        instance_one.addProbelmComment("Waiting on Parts");
//
//
//        int ExpectedPerfornamce = 4; // 4 problems per anum is expected
//        double performance_percentage = management_object.calcProblemRateForFacility(instance_one, ExpectedPerfornamce);
//
//        System.out.println("Facility Problem Percentage: " + performance_percentage + "%");
//
//
//        management_object.listMaintenance();

        testListFacilities();
        testGetFacilityInformation();


    }

    public static void testGetFacilityInformation() {
        Facility facility_one = new Facility();
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        System.out.println(facility_one.getFacilityInformation());
    }

    public static void testListFacilities() {
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

