package main.java.io.roberthernandez.Model.FacilManag;

import java.util.List;

public class FacilityManagementImp implements FacilityManagement{
    private List<Facility> facilities;

    public void setFacilityList(List<Facility> facilities ) {
        this.facilities = facilities;
    }

    public List<Facility> getFacilityArrayList() {
        return this.facilities;
    }

    public void addFacility(Facility f) {
        this.facilities.add(f);
    }

    public void removeFacility(Facility f) {
        if (this.facilities.contains(f)) {
            this.facilities.remove(f);
        }
    }

    public void listFacilities() {
        for(Facility f : facilities) {
            System.out.println(f);
        }
    }

    public void setFacilities(List facilities) {
        this.facilities = facilities;
    }

    public List getFacilities() {
        return facilities;
    }
}
