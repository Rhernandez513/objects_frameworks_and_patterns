package io.roberthernandez;


import java.util.ArrayList;

public class Facility {

    private String name;
    private int capacity;
    private ArrayList<FacilityDetail> facilityDetails = new ArrayList<FacilityDetail>();


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

    public ArrayList<FacilityDetail> getFacilityDetails() {
        return facilityDetails;
    }

    public String getFacilityInformation() {

        String response = "";
        response += "Name: " + this.getName() + "\n";
        response += "Capacity: " + this.getCapacity();
        return response;
    }

    public void addFacilityDetail(FacilityDetail f) {
        this.facilityDetails.add(f);
    }


    public int requestAvailableCapacity() {
        System.out.println("Retrieving Capacity: " + capacity);
        return capacity;
    }
}
