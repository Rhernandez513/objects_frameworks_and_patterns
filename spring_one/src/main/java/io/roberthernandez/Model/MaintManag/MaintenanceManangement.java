package main.java.io.roberthernandez.Model.MaintManag;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.UserManag.User;

import java.util.ArrayList;

public interface MaintenanceManangement {
    public void addMaintenanceToBeManaged(Maintenance maintenance);
    public long calcDownTimeForFacility(Facility facility);
    public String calcProblemRateForFacility(Facility f, int ExpectedPerformance);
    public Object calcMaintenanceCostForFacility(Facility facility);
    public Object listMaintRequests();
    public Object listMaintenance();
    public ArrayList<String> listFacilityProblems(Facility f);

    public void addUser(User user);
    public void removeUser(User user);
    public void notifyUser();
    public Maintenance getNewMaint();

}


