package io.roberthernandez;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class mainapp {
    public static void main(String[] args) {

        int TimesFacilitiesShouldBeInUse = 10;
        double MaintenanceCost = 100.00;


        System.out.println("Creating users and facilities, attempting to create a maintenance request on said facility");
        User user_one = new User();
        Facility facility_one = new Facility();
        MaintenanceRequest request = new MaintenanceRequest();

        request.setFacility(facility_one);
        request.setUser(user_one);

        System.out.println("Now that we have a request, we create an instance of Maintenance, which represents a " +
                "single instance of a maintenance incident.");

        System.out.println("In order to schedule we need a start and end time");

        Schedule schedule = createSchedule();

        Maintenance instance_one = new Maintenance(request, schedule, MaintenanceCost, "Boiler out");


        MaintenanceManangement management_object = new MaintenanceManangement();

        management_object.addMaintenanceToBeManaged(instance_one);

        System.out.println("Let's add some detail to the problem report");
        instance_one.addProbelmComment("Waiting on Parts");


        int ExpectedPerfornamce = 4; // 4 problems per anum is expected
        double performance_percentage = management_object.calcProblemRateForFacility(instance_one, ExpectedPerfornamce);

        System.out.println("Facility Problem Percentage: " + performance_percentage + "%");




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

