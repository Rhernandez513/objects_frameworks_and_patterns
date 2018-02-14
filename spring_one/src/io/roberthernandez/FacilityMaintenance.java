package io.roberthernandez;

import java.util.*;

public class FacilityMaintenance {

    private io.roberthernandez.Facility Facility;
    private Map<io.roberthernandez.Facility, Date> facilities_under_maintenance = new HashMap<io.roberthernandez.Facility, Date>();
    private Date maint_start_date = new Date();
    private int cost_for_maintenance_in_dollars = 0;


    // Facility Maintenance
    //    this  functionality  covers  the
    //    maintenance  of  a  Facility  such  as
    //    scheduling  a  Facility  for  maintenance;  checking  maintenance  status;  listing  maintenance
    //    requests; calculating down time of a Facility and many more functionalities.
    public Object makeFacilityMaintRequest() { }

    public Object scheduleMaintenance(io.roberthernandez.Facility Facility) {
        Date now = new Date();
        facilities_under_maintenance.put(Facility, now);
    }
    public Object calcMaintenanceCostForFacility(io.roberthernandez.Facility Facility) {
        if (facilities_under_maintenance.containsKey(Facility)) {
            System.out.println("True, can calculate maintenance costs");

        } else {
            System.out.println("False, Facility not under maintenance");
        }
    }
    public Object calcProblemRateForFacility() { }
    public Object calcDownTimeForFacility() { }
    public Object listMaintRequests() { }
    public Object listMaintenance() {}
    public Object listFacilityProblems() { }
}
