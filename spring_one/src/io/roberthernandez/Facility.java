package io.roberthernandez;


import java.util.ArrayList;

public class Facility {

    private String name;
    private int capacity;
    private ArrayList<FacilityDetail> facilityDetails;


    public String toString() {
        return getName();
    }

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

    // Facility
    //    this will cover the
    //    functionalities such as adding a new Facility to
    //    be managed; removing a Facility from being managed; getting general information such as
    //    the number and capacity of facilities and their current statuses.
    // create List<T>
    public Object getFacilityInformation() {

        String response = "";
        response += "Name: " + this.getName();
        response += "Capacity: " + this.getCapacity();
//        response += "Detail Information: " + this.getDetail();
        return response;
    }

    public void addFacilityDetail() { }

    public Object requestAvailableCapacity() {
        System.out.println("Retrieving Capacity: " + capacity);
        return capacity;
    }
    // Add / remove from List<T> etc
//    public Object addNewFacility(Facility facility) {
//        facilityDetails.add(facility);
//        capacity -= 1;
//        return true;
//    }

//    public Object removeFacility(Facility facility) {
//        boolean result = facilityDetails.remove(facility);
//        if (result) {
//            capacity += 1;
//            return true;
//        }
//        return false;
//    }
}
