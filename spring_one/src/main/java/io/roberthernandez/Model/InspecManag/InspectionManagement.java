package main.java.io.roberthernandez.Model.InspecManag;

import java.util.List;

public interface InspectionManagement {
    public void addInspection(Inspection inspection);
    public List<Inspection> getInspections();
    public void listInspections();
    public void setInspections(List<Inspection> inspections);
}
