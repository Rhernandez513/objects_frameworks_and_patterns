package io.roberthernandez;

import java.util.ArrayList;

public class InspectionManagement {
    private ArrayList<Inspection> inspectionArrayList = new ArrayList<Inspection>();

    public void addInspection(Inspection i){
        inspectionArrayList.add(i);
    }

    public ArrayList<Inspection> getInspectionArrayList() {
        return inspectionArrayList;
    }

    public Object listInspections() {
        int counter = 1;
        for (Inspection inspection : inspectionArrayList) {
            System.out.println(counter + ": " + inspection);
            counter++;
        }
        return null;
    }
}
