package io.roberthernandez.Model.FacilManag;


import java.util.List;

public class FacilityImp implements Facility{

    private String name;
    private int capacity;
    private List<FacilityDetail> facilityDetails;


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

    public List<FacilityDetail> getFacilityDetails() {
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
        return capacity;
    }

    public void setFacilityDetails(List<FacilityDetail> facilityDetails) {
        this.facilityDetails = facilityDetails;
    }
}
