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
    public String getFacilityInformation() {

        String response = "";
        response += "Name: " + this.getName() + "\n";
        response += "Capacity: " + this.getCapacity();
        return response;
    }

    public void addFacilityDetail(FacilityDetail f) {
        this.facilityDetails.add(f);
    }

    public Object requestAvailableCapacity() {
        System.out.println("Retrieving Capacity: " + capacity);
        return capacity;
    }
}
