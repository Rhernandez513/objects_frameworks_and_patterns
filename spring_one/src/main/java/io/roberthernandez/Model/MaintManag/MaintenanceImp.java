package main.java.io.roberthernandez.Model.MaintManag;

import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.UserManag.User;

import java.util.ArrayList;

public class MaintenanceImp implements Maintenance{
    private MaintenanceRequest request;
    private Schedule schedule;
    private double cost;
    private ArrayList<String> problemReports = new ArrayList<String>();
    private ArrayList<User> users = new ArrayList<User>();



    public int getLenghtOfProblemReport() {
        return problemReports.size();
    }


    public void setMaintenance(MaintenanceRequest r, Schedule s, double c, String ProblemComment){
        this.setCost(c);
        this.setRequest(r);
        this.setSchedule(s);
        this.problemReports.add(ProblemComment);

    }


    public void addProbelmComment(String ProblemComment) {
        this.problemReports.add(ProblemComment);
    }

    public String toString() {
        String response = "";
        response += "Request: " + request;
        response += "Scheduled for: " + schedule + "\n";
        response += "Cost: " + cost + "\n";
        return response;
    }

    public MaintenanceRequest getRequest() {
        return request;
    }

    public void setRequest(MaintenanceRequest input) {
        this.request = input;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule input) {
        this.schedule = input;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double input) {
        this.cost = input;
    }

    public ArrayList<String> maintProblemReports(){
        return problemReports;
    }
}
