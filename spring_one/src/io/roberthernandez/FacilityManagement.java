package io.roberthernandez;

import java.util.ArrayList;

public class FacilityManagement {
    ArrayList<Facility> facilityArrayList;

    public FacilityManagement() {
        this.facilityArrayList = new ArrayList<Facility>();
    }
    public void setFacilityArrayList(ArrayList<Facility> list ) {
        this.facilityArrayList = list;
    }

    public ArrayList<Facility> getFacilityArrayList() {
        return this.facilityArrayList;
    }

    public void addFacility(Facility f) {
        this.facilityArrayList.add(f);
    }

    public void removeFacility(Facility f) {
        if (this.facilityArrayList.contains(f)) {
            this.facilityArrayList.remove(f);
        }
    }

    public void listFacilities() {
        for(Facility f : facilityArrayList) {
            System.out.println(f);
        }
    }
}
