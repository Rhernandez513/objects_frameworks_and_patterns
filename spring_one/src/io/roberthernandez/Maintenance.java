package io.roberthernandez;

import java.util.ArrayList;

public class Maintenance {
    private MaintenanceRequest request;
    private Schedule schedule;
    private double cost;
    private ArrayList<String> problemReports = new ArrayList<String>();

    public int getLenghtOfProblemReport() {
        return problemReports.size();
    }

    public Maintenance(MaintenanceRequest r, Schedule s, double c, String ProblemComment) {
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
        response += "Request: " + request + "\n";
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
}
