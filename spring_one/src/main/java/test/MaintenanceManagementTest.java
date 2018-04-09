package main.java.test;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.FacilManag.FacilityImp;
import main.java.io.roberthernandez.Model.MaintManag.*;
import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.ScheManag.ScheduleImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MaintenanceManagementTest {
    @Test
    void addMaintenanceToBeManagedTest() {
        Maintenance maintenance = new MaintenanceImp();
        MaintenanceManangement manager = new MaintenanceManangementImp();
        manager.addMaintenanceToBeManaged(maintenance);
        List<MaintenanceRequest> list = (List<MaintenanceRequest>) manager.listMaintRequests();
        Assert.assertEquals(maintenance, list.get(0));
    }
    @Test
    void calcDownTimeForFacilityTest() {
        long timeDeltaAsUnix = 0;

        Schedule s = new ScheduleImp();

        //Create schedule
        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date second_time = gcal.getTime();

        s.setStartTime(first_time);
        s.setEndTime(second_time);


        long period_begin = s.getStartTime().getTime() / 1000;
        long period_end = s.getEndTime().getTime() / 1000;
        long expectedTimeDeltaAsUnix = period_end - period_begin;

        Maintenance maintenance = new MaintenanceImp();
        maintenance.setSchedule(s);

        MaintenanceRequest request = new MaintenanceRequestImp();

        Facility facility = new FacilityImp();
        request.setFacility(facility);
        maintenance.setRequest(request);

        MaintenanceManangement manager = new MaintenanceManangementImp();
        manager.addMaintenanceToBeManaged(maintenance);

        // manager can manage multiple facilities, but will only return a time Delta if the facility provided is
        // currently under management by the manager
        long actualTimeDeltaAsUnix = manager.calcDownTimeForFacility(facility);

        Assert.assertEquals(expectedTimeDeltaAsUnix, actualTimeDeltaAsUnix);

    }
    @Test
    void calcProblemRateForFacilityTest() {

        MaintenanceManangement manager = new MaintenanceManangementImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        Maintenance maintenance = new MaintenanceImp();
        maintenance.addProbelmComment("A Problem");

        int ExpectedPerformance = 5;

        Facility facility = new FacilityImp();
        request.setFacility(facility);
        maintenance.setRequest(request);

        manager.addMaintenanceToBeManaged(maintenance);
        String actualResult = manager.calcProblemRateForFacility(facility, 1);
        // 1 / 1 * 100 = 100
        String expectedResult = "100%";

        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    void calcMaintenanceCostForFacilityTest() {
        Facility facility = new FacilityImp();

        MaintenanceManangement manager = new MaintenanceManangementImp();

        Maintenance maintenance = new MaintenanceImp();
        double expectedCost = 100.00;
        maintenance.setCost(expectedCost);

        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setFacility(facility);
        maintenance.setRequest(request);

        manager.addMaintenanceToBeManaged(maintenance);

        // manager can manage multiple facilities, but will only return a value if the facility provided is
        // currently under management by the manager
        double actualCost = (double) manager.calcMaintenanceCostForFacility(facility);

        Assert.assertEquals(expectedCost, actualCost);
    }
    @Test
    void listMaintRequestsTest() {
        Facility facility = new FacilityImp();
        MaintenanceManangement manager = new MaintenanceManangementImp();
        Maintenance maintenance = new MaintenanceImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setFacility(facility);
        maintenance.setRequest(request);
        manager.addMaintenanceToBeManaged(maintenance);
        List<MaintenanceRequest> list = new ArrayList<MaintenanceRequest>();
        list.add(request);
        Assert.assertEquals(request, manager.listMaintRequests());
    }
    @Test
    void listMaintenanceTest() {
        MaintenanceManangement manager = new MaintenanceManangementImp();
        Maintenance maintenance = new MaintenanceImp();
        manager.addMaintenanceToBeManaged(maintenance);
        List<Maintenance> list = new ArrayList<Maintenance>();
        list.add(maintenance);
        Assert.assertEquals(manager.listMaintenance(), list);
    }
    // TODO: Finish this unit test
    @Test
    void listFacilityProblemsTest() {
//        Facility facility = new FacilityImp();
//        MaintenanceManangement manager = new MaintenanceManangementImp();
//        ArrayList<String> results = manager.listFacilityProblems(facility);
    }
}
