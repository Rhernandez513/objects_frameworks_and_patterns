package io.roberthernandez;

import java.util.ArrayList;

public class MaintenanceManangement {

    private ArrayList<Maintenance> maint = new ArrayList<Maintenance>();

    public void addMaintenanceToBeManaged(Maintenance maintenance) {
        this.maint.add(maintenance);
    }

    public long calcDownTimeForFacility(Facility facility) {
       long timeDeltaAsUnix = 0 ;

       for (Maintenance maintenance : maint) {
           Facility f_one = maintenance.getRequest().getFacility();
           if (facility == f_one) {
               Schedule s = maintenance.getSchedule();
               long period_begin = s.getStartTime().getTime() / 1000;
               long period_end = s.getEndTime().getTime() / 1000;
               timeDeltaAsUnix += period_end - period_begin;
           }
       }
       return timeDeltaAsUnix;
    }

    public String calcProblemRateForFacility(Facility f, int ExpectedPerformance) {
        if (ExpectedPerformance == 0) {
           System.out.println("Perfect Performance expected, impossible.");
        }
        double length = 0.0;
        for (Maintenance main: maint) {
            if (main.getRequest().getFacility() == f) {
                length += main.getLenghtOfProblemReport();
            }
        }
        double percentage = (length / ExpectedPerformance) * 100.00;
        return (Double.toString(percentage)+"%");
    }

    public Object calcMaintenanceCostForFacility(Facility facility) {

        double cost = 0;

        for (Maintenance main : maint) {
            if (main.getRequest().getFacility() == facility) {
                //System.out.println("True, can calculate maintenance costs");
                cost += main.getCost();
            }
        }
        return cost;
    }

    public Object listMaintRequests() {
        for (Maintenance main: maint) {
            System.out.println(main.getRequest());
        }
        return null;
    }

    public Object listMaintenance() {
        for (Maintenance main : maint) {
            System.out.println(main);
        }
        return null;
    }

    public ArrayList<String> listFacilityProblems(Facility f){
        ArrayList<String> problems = new ArrayList<String>();
        for (Maintenance main : maint){
            if(main.getRequest().getFacility()==f){
                for (String s : main.maintProblemReports()){
                    problems.add(s);
                    System.out.println("Problem: " + s);
                }
            }
        }

        return problems;
    }


}
