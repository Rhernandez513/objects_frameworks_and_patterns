package io.roberthernandez;

import java.util.ArrayList;

// Facility Use
public class FacilityUse {

    private int total_usage = 50;
    private int current_usage = 0;
    private facility Facility;
    private ArrayList<facility> Inspections = new ArrayList<facility>();
    private ArrayList<facility> facilities_in_use = new ArrayList<facility>();


    //    this  covers  the  functionalities  of  managing  the  facility  such  as  reserving  a
    //    facility; the cost of using and maintaining it; assigning and de-assigning a facility for use.
    public Object isInUseDuringInterval() { }
    public Object assignFacilityToUse(facility facility) {
        facilities_in_use.add(facility);
    }
    public Object vacateFacility() {
        System.out.println("Kicking out tenants...");
        return null;
    }

    public Object listInspections() {
        int counter = 1;
        for(facility fac: Inspections) {
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
