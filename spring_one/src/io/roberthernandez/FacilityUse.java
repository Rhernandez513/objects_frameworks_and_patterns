package io.roberthernandez;

import java.util.ArrayList;

// Facility Use
public class FacilityUse {

    private int total_usage = 50;
    private int current_usage = 0;
    private Facility facility;
    private ArrayList<Facility> Inspections = new ArrayList<io.roberthernandez.Facility>();
    private ArrayList<Facility> facilities_in_use = new ArrayList<io.roberthernandez.Facility>();


    //    this  covers  the  functionalities  of  managing  the  Facility  such  as  reserving  a
    //    Facility; the cost of using and maintaining it; assigning and de-assigning a Facility for use.
    public Object isInUseDuringInterval() { }
    public Object assignFacilityToUse(Facility facility) {
        facilities_in_use.add(facility);
    }
    public Object vacateFacility() {
        System.out.println("Kicking out tenants...");
        return null;
    }

    public Object listInspections() {
        int counter = 1;
        for(io.roberthernandez.Facility fac: Inspections) {
            System.out.println("Inspection result: " + counter);
            counter += 1;
        }
        return counter;
    }
    public Object listActualUsage() {
        return total_usage - current_usage;
    }
    public Object calcUsageRate() {
        int percentage_in_use = current_usage / total_usage;
        String percentage = percentage_in_use + "%";
        return percentage;
    }
}
