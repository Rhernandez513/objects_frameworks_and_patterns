package io.roberthernandez;

import java.util.ArrayList;

public class UsageManagement {
    private ArrayList<Facility> Facilities;

    public void AddFacility(Facility f) {
        this.Facilities.add(f);
    }
    public void RemoveFacility(Facility f) {
        if (this.Facilities.contains(f)) {
            this.Facilities.remove(f);
        }
    }

    public Object listFacilities(){
        int count = 1;
        for (Facility f : Facilities) {
            System.out.println(count + ": " + f);
        }
        return null;
    }
}
