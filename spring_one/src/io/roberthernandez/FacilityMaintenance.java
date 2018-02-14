package io.roberthernandez;

import java.util.*;

public class FacilityMaintenance {

    private Facility facility;
    private Map<Facility, Date> facilities_under_maintenance = new HashMap<Facility, Date>();
    private Date maint_start_date = new Date();
    private int cost_for_maintenance_in_dollars = 0;


    // Facility Maintenance
    //    this  functionality  covers  the
    //    maintenance  of  a  Facility  such  as
    //    scheduling  a  Facility  for  maintenance;  checking  maintenance  status;  listing  maintenance
    //    requests; calculating down time of a Facility and many more functionalities.
    public Object makeFacilityMaintRequest() { }

    public Object scheduleMaintenance(Facility facility) {
        Date now = new Date();
        facilities_under_maintenance.put(facility, now);
    }
    public Object calcMaintenanceCostForFacility(Facility facility) {
        if (facilities_under_maintenance.containsKey(facility)) {
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
