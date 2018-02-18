package io.roberthernandez;

import java.util.ArrayList;

public class UsageManagement {
    private ArrayList<Usage> Usages = new ArrayList<Usage>();

    public void AddUsage(Usage u) {
        this.Usages.add(u);
    }
    public void RemoveUsage(Usage u) {
        if (this.Usages.contains(u)) {
            this.Usages.remove(u);
        }
    }

    public Object listUsage(){
        int count = 1;
        for (Usage u : Usages) {
            System.out.println(count + ": " + u);
        }
        return null;
    }

    public Object listActualUsage(Facility f) {
        for(Usage u : Usages) {
            Facility fac = u.getFacility();
            if (f == fac) {
                System.out.println(u.listActualUsage());
            }
        }
        return null;
    }
}
