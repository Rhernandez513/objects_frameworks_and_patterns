package io.roberthernandez.Model.MaintManag;

import io.roberthernandez.Model.FacilManag.Facility;

import java.util.ArrayList;

public interface MaintenanceManangement {
    public void addMaintenanceToBeManaged(Maintenance maintenance);
    public long calcDownTimeForFacility(Facility facility);
    public String calcProblemRateForFacility(Facility f, int ExpectedPerformance);
    public Object calcMaintenanceCostForFacility(Facility facility);
    public Object listMaintRequests();
    public Object listMaintenance();
    public ArrayList<String> listFacilityProblems(Facility f);

}


