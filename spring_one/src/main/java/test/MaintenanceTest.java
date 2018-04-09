package test;

import io.roberthernandez.Model.MaintManag.Maintenance;
import io.roberthernandez.Model.MaintManag.MaintenanceImp;
import io.roberthernandez.Model.MaintManag.MaintenanceRequest;
import io.roberthernandez.Model.MaintManag.MaintenanceRequestImp;
import io.roberthernandez.Model.ScheManag.Schedule;
import io.roberthernandez.Model.ScheManag.ScheduleImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MaintenanceTest {
    @Test
    void getLenghtOfProblemReportTest() {
        Maintenance maintenance = new MaintenanceImp();
        maintenance.addProbelmComment("A Comment");
        int len = maintenance.getLenghtOfProblemReport();
        Assert.assertEquals(1,len);

    }
    @Test
    void setMaintenanceTest() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setMaintenance(r, s, cost, ProblemComment);
        Assert.assertEquals(cost, maintenance.getCost());
        Assert.assertEquals(r, maintenance.getRequest());
        Assert.assertEquals(s, maintenance.getSchedule());
    }
    @Test
    void addProbelmCommentTest(String ProblemComment) {
        Maintenance maintenance = new MaintenanceImp();
        maintenance.addProbelmComment("A Comment");
        int len = maintenance.getLenghtOfProblemReport();
        Assert.assertEquals(1,len);
    }
    @Test
    void toStringTest() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setMaintenance(r, s, cost, ProblemComment);

        // Next step is to print out the result, add it to a static string, then compare dynamically
        // in the test what we see from interactive use
        System.out.println(maintenance.toString());
        String result = "Expected";
        Assert.assertEquals(result, maintenance.toString());
    }
    @Test
    void getRequestTest() {
        Maintenance maintenance = new MaintenanceImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        maintenance.setRequest(request);
        Assert.assertEquals(request, maintenance.getRequest());
    }
    @Test
    void setRequestTest() {
        Maintenance maintenance = new MaintenanceImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        maintenance.setRequest(request);
        Assert.assertEquals(request, maintenance.getRequest());
    }
    @Test
    void getScheduleTest() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setMaintenance(r, s, cost, ProblemComment);

        Assert.assertEquals(s, maintenance.getSchedule());
    }
    @Test
    void setSchedule() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setSchedule(s);
        Assert.assertEquals(s, maintenance.getSchedule());

    }
    @Test
    void getCost() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setSchedule(s);
        Assert.assertEquals(cost, maintenance.getCost());
    }
    @Test
    void setCost() {
        MaintenanceRequest r = new MaintenanceRequestImp();
        Schedule s = new ScheduleImp();
        String ProblemComment = "ProblemComment";
        double cost = 0.00;
        Maintenance maintenance = new MaintenanceImp();
        maintenance.setSchedule(s);
        Assert.assertEquals(cost, maintenance.getCost());
    }
    @Test
    void maintProblemReports() {
        String report = "report";
        Maintenance maintenance = new MaintenanceImp();
        maintenance.addProbelmComment(report);

        List<String> staticReports = new ArrayList<String>();
        staticReports.add(report);
        staticReports.add(report);

        List<String> reports = maintenance.maintProblemReports();

        Assert.assertEquals(reports, staticReports);
    }
}
