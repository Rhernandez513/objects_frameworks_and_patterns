package main.java.io.roberthernandez.Model.InspecManag;

import java.util.List;

public class InspectionManagementImp implements InspectionManagement{
    private List<Inspection> inspections;

    public void addInspection(Inspection inspection){
        inspections.add(inspection);
    }

    public List<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(List<Inspection> inspections){
        this.inspections=inspections;
    }


    public void listInspections() {
        int counter = 1;
        for (Inspection inspection : inspections) {
            System.out.println(counter + ": " + inspection);
            counter++;
        }
    }
}
