package io.roberthernandez;


import java.util.List;

public class facility {

    private String name;
    private int capacity;
    private String detail;
    private List<facility> facilities_under_management;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setDetail(String name) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
    // Facility
    //    this will cover the
    //    functionalities such as adding a new facility to
    //    be managed; removing a facility from being managed; getting general information such as
    //    the number and capacity of facilities and their current statuses.
    // create List<T>
    public Object listFacilities(){
        for(facility Facility: facilities_under_management) {
            System.out.println(Facility.name);
        }
    }
    public Object getFacilityInformation() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Detail Information: " + detail);

    }

    public Object requestAvailableCapacity() {
        return capacity;
    }
    // Add / remove from List<T> etc
    public Object addNewFacility(facility Facility) {
        facilities_under_management.add(Facility);
        capacity -= 1;
        return true;
    }

    public void addFacilityDetail() { }
    public Object removeFacility(facility Facility) {
        boolean result = facilities_under_management.remove(Facility);
        if (result) {
            capacity += 1;
            return true;
        }
        return false;
    }
}

// Facility Use
public class facility_use {
    //    this  covers  the  functionalities  of  managing  the  facility  such  as  reserving  a
    //    facility; the cost of using and maintaining it; assigning and de-assigning a facility for use.
    public Object isInUseDuringInterval() { }
    public Object assignFacilityToUse() { }
    public Object vacateFacility() { }
    public Object listInspections() { }
    public Object listActualUsage() { }
    public Object calcUsageRate() { }
}

public class facility_maintenance {
    // Facility Maintenance
    //    this  functionality  covers  the
    //    maintenance  of  a  facility  such  as
    //    scheduling  a  facility  for  maintenance;  checking  maintenance  status;  listing  maintenance
    //    requests; calculating down time of a facility and many more functionalities.
    public Object makeFacilityMaintRequest() { }
    // use date objects
    public Object scheduleMaintenance() { }
    public Object calcMaintenanceCostForFacility() { }
    public Object calcProblemRateForFacility() { }
    public Object calcDownTimeForFacility() { }
    public Object listMaintRequests() { }
    public Object listMaintenance() { }
    public Object listFacilityProblems() { }
}
