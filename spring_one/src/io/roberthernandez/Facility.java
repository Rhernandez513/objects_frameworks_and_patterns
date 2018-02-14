package io.roberthernandez;

import java.util.List;

public class Facility {

    private String name;
    private int capacity;
    private String detail;
    private String InspectionDetails;
    private List<Facility> facilities_under_management;


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

    public void setInspectionDetails(String InspectionDetails) {
        this.InspectionDetails = InspectionDetails;
    }
    public String getInspectionDetails() {
        return this.InspectionDetails;
    }

    // Facility
    //    this will cover the
    //    functionalities such as adding a new Facility to
    //    be managed; removing a Facility from being managed; getting general information such as
    //    the number and capacity of facilities and their current statuses.
    // create List<T>
    public Object listFacilities(){
        for(io.roberthernandez.Facility Facility: facilities_under_management) {
            System.out.println(Facility.name);
        }
    }
    public Object getFacilityInformation() {
        System.out.println("Name: " + this.getName());
        System.out.println("Capacity: " + this.getCapacity());
        System.out.println("Detail Information: " + this.getDetail());

    }

    public Object requestAvailableCapacity() {
        return capacity;
    }
    // Add / remove from List<T> etc
    public Object addNewFacility(Facility Facility) {
        facilities_under_management.add(Facility);
        capacity -= 1;
        return true;
    }

    public void addFacilityDetail() { }
    public Object removeFacility(Facility Facility) {
        boolean result = facilities_under_management.remove(Facility);
        if (result) {
            capacity += 1;
            return true;
        }
        return false;
    }
}
