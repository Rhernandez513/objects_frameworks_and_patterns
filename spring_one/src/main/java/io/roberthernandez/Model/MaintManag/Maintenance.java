package main.java.io.roberthernandez.Model.MaintManag;

import main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor.MaintenanceItemlizedCost;
import main.java.io.roberthernandez.Model.ScheManag.Schedule;

import java.util.ArrayList;

public interface Maintenance {
    public int getMaintID();
    public void setMaintID(int id);
    public int getLenghtOfProblemReport();
    public void setMaintenance(int id, MaintenanceRequest r, Schedule s, double c, String ProblemComment);
    public void addProbelmComment(String ProblemComment);
    public String toString();
    public MaintenanceRequest getRequest();
    public void setRequest(MaintenanceRequest input);
    public Schedule getSchedule();
    public void setSchedule(Schedule input);
    public double getCost();
    public void setCost(double input);
    public ArrayList<String> maintProblemReports();
    public void setCostByItems(ArrayList<MaintenanceItemlizedCost> items);


}
