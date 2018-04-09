package main.java.io.roberthernandez.Model.UsageManag;

import main.java.io.roberthernandez.Model.FacilManag.Facility;

import java.util.List;

public class UsageManagementImp implements UsageManagement{
    private List<Usage> usages;

    public void setUsages(List<Usage> usages){this.usages=usages;}

    public void AddUsage(Usage u) {
        this.usages.add(u);
    }
    public void RemoveUsage(Usage u) {
        if (this.usages.contains(u)) {
            this.usages.remove(u);
        }
    }

    public Object listUsage(){
        int count = 1;
        for (Usage u : usages) {
            System.out.println(count + ": " + u);
        }
        return null;
    }

    public Object listActualUsage(Facility f) {
        for(Usage u : usages) {
            Facility fac = u.getFacility();
            if (f == fac) {
                System.out.println(u.listActualUsage());
            }
        }
        return null;
    }
}
