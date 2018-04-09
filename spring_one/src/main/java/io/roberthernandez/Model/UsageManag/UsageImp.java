package main.java.io.roberthernandez.Model.UsageManag;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.UserManag.User;

import java.util.ArrayList;
import java.util.Date;

// Facility Use
public class UsageImp implements Usage {

    private int min_capacity;
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

    public void setMin_capacity(int min_capacity){this.min_capacity=min_capacity;}
    public void setMax_capacity(int max_capacity){this.max_capacity=max_capacity;}

    public void setFacility(Facility f){
        this.facility=f;
        max_capacity=f.getCapacity();
    }

    public void setReservations(int reservations){
        this.reservations=reservations;
    }
    public void setUser(User u){
        this.user=u;
    }

    public void setSchedule(Schedule s){
        this.schedule=s;
    }

    public int getMax_capacity(){
        return max_capacity;
    }

    // returns true if the date is inclusive in the scheduled usage time
    public Object isInUseDuringInterval(Date date) {
        Date startTime = schedule.getStartTime();
        Date endTime = schedule.getEndTime();
        return startTime.compareTo(date) * date.compareTo(endTime) >= 0;
    }

    public Object assignFacilityToUse(Facility facility) {
        facilities_in_use.add(facility);
        for(Facility f : facilities_in_use){
            System.out.println(f + " is in use.");
        }
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
        double percentage_in_use = reservations / (double)max_capacity *100;
        String percentage = percentage_in_use + "%";
        return percentage;
    }
}
