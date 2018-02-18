package io.roberthernandez;

import java.util.ArrayList;
import java.util.Date;

// Facility Use
public class Usage {

    private int min_capacity = 0;
    private int reservations = 10;
    private int max_capacity = 50;
    private Facility facility;
//    private ArrayList<Facility> Inspections = new ArrayList<io.roberthernandez.Facility>();
    private ArrayList<Facility> facilities_in_use = new ArrayList<Facility>();
    private boolean isInUse = false;
    private User user;
    private Schedule schedule;

    public Facility getFacility() {
        return facility;
    }

    // returns true if the date is inclusive in the scheduled usage time
    public Object isInUseDuringInterval(Date date) {
        Date startTime = schedule.getStartTime();
        Date endTime = schedule.getEndTime();
        return startTime.compareTo(date) * date.compareTo(endTime) >= 0;
    }

    public Object assignFacilityToUse(Facility facility) {
        facilities_in_use.add(facility);
        return null;
    }
    public Object vacateFacility() {
        System.out.println("Kicking out tenants...");
        facilities_in_use = null;
        return null;
    }

//    public Object listInspections() {
//        int counter = 1;
//        for(Facility fac: Inspections) {
//            System.out.println("Inspection result: " + counter);
//            counter += 1;
//        }
//        return counter;
//    }
    public Object listActualUsage() {
        return reservations;
    }
    public Object calcUsageRate() {
        double percentage_in_use = reservations / max_capacity;
        String percentage = percentage_in_use + "%";
        return percentage;
    }
}
