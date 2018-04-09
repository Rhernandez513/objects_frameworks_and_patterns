package io.roberthernandez.Model.MaintManag;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.ScheManag.Schedule;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceManangementImp implements MaintenanceManangement {

    private List<Maintenance> maint;

    public void setMaint(List<Maintenance> maint){
        this.maint=maint;
    }

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
        List<MaintenanceRequest> mrList=new ArrayList<MaintenanceRequest>();
        for (Maintenance main: maint) {
            mrList.add(main.getRequest());
        }
        return mrList;
    }

    public Object listMaintenance() {

        return maint;
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
