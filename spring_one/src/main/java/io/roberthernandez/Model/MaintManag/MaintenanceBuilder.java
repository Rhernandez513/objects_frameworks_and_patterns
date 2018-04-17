package main.java.io.roberthernandez.Model.MaintManag;

import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.UserManag.User;

import java.util.ArrayList;

public class MaintenanceBuilder {

    private int maintID;
    private MaintenanceRequest request;
    private Schedule schedule;
    private double cost;
    private ArrayList<String> problemReports = new ArrayList<String>();
    private ArrayList<User> users = new ArrayList<User>();

    public static class Builder {
        private int maintID;
        private MaintenanceRequest request;
        private Schedule schedule;
        private double cost;
        private ArrayList<String> problemReports = new ArrayList<String>();
        private ArrayList<User> users = new ArrayList<User>();

        public Builder(int id){
            this.maintID = id;
        }

        public Builder withMaintenanceRequest(MaintenanceRequest mr){
            this.request=mr;
            return this;
        }

        public Builder withSchedule(Schedule s){
            this.schedule=s;
            return this;
        }

        public Builder withCost(double c){
            this.cost=c;
            return this;
        }

        public Builder withProblem(String... strings){
            ArrayList<String> list = new ArrayList<>();
            for (String s : strings)
            {
                list.add(s);
            }
            this.problemReports=list;
            return  this;
        }

        public MaintenanceBuilder build(){
            MaintenanceBuilder maintenanceBuilder=new MaintenanceBuilder();
            maintenanceBuilder.maintID=this.maintID;
            maintenanceBuilder.request=this.request;
            maintenanceBuilder.schedule=this.schedule;
            maintenanceBuilder.cost=this.cost;
            maintenanceBuilder.problemReports=this.problemReports;
            return maintenanceBuilder;
        }
    }

    private MaintenanceBuilder(){}

    public String toString() {
        String response = "";
        response += "The maintenance ID is " + maintID + "\n";
        response += "Request:\n" + request;
        response += "Scheduled for: " + schedule + "\n";
        response += "Cost: " + cost + "\n";
        return response;
    }

}
