package io.roberthernandez.Model.MaintManag;

import io.roberthernandez.Model.ScheManag.Schedule;

import java.util.ArrayList;

public interface Maintenance {
    public int getLenghtOfProblemReport();
    public void setMaintenance(MaintenanceRequest r, Schedule s, double c, String ProblemComment);
    public void addProbelmComment(String ProblemComment);
    public String toString();
    public MaintenanceRequest getRequest();
    public void setRequest(MaintenanceRequest input);
    public Schedule getSchedule();
    public void setSchedule(Schedule input);
    public double getCost();
    public void setCost(double input);
    public ArrayList<String> maintProblemReports();


}
