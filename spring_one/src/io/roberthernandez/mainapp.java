package io.roberthernandez;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class mainapp {
    public static void main(String[] args) {


        System.out.println("Creating users and facilities, attempting to create a maintenance request on said facility");
        User user_one = new User();
        Facility facility_one = new Facility();
        MaintenanceRequest request = new MaintenanceRequest();

        request.setFacility(facility_one);
        request.setUser(user_one);

        System.out.println("Now that the request is created we should be able to send it to the manangement system for scheduling");
//        request.send();

        System.out.println("In order to schedule we need a start and end time");

        Schedule schedule = createSchedule();


        int TimesFacilitiesShouldBeInUse = 10;


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

