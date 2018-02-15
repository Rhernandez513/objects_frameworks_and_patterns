package io.roberthernandez;

import java.util.*;

public class FacilityMaintenance {

    private Facility facility;
    private Date maint_start_date = new Date();
    private int cost_for_maintenance_in_dollars = 0;


    // Facility Maintenance
    //    this  functionality  covers  the
    //    maintenance  of  a  Facility  such  as
    //    scheduling  a  Facility  for  maintenance;  checking  maintenance  status;  listing  maintenance
    //    requests; calculating down time of a Facility and many more functionalities.
    public Object makeFacilityMaintRequest() {
        return null;
    }

//    public Object scheduleMaintenance(Facility facility) {
//        Date now = new Date();
//        facilities_under_maintenance.put(facility, now);
//        System.out.print("Maintenance scheduled for: ");
//        System.out.println(now.getTime());
//        return now;
//    }
    public Object calcProblemRateForFacility() {
        return null;
    }
    public Object calcDownTimeForFacility() {
        return null;
    }
    public Object listMaintRequests() {
        return null;
    }
    public Object listMaintenance() {
        return null;
    }
    public Object listFacilityProblems() {
        return null;
    }
}
