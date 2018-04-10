package main.java.test;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.FacilManag.FacilityImp;
import main.java.io.roberthernandez.Model.UserManag.User;
import main.java.io.roberthernandez.Model.UserManag.UserImp;
import main.java.io.roberthernandez.Model.InspecManag.Inspection;
import main.java.io.roberthernandez.Model.InspecManag.InspectionImp;
import main.java.io.roberthernandez.Model.InspecManag.InspectionRequest;
import main.java.io.roberthernandez.Model.InspecManag.InspectionRequestImp;
import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.ScheManag.RegularScheduleImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class InspectionTest {
    private String InspectionResult;

    @Test
    void setInspectionRequestTest() {
        InspectionRequest inspectionRequest = new InspectionRequestImp();
        Inspection inspection = new InspectionImp();
        inspection.setInspectionRequest(inspectionRequest);
        InspectionRequest request = new InspectionRequestImp();
        inspection.setInspectionRequest(request);
        Assert.assertEquals(request, inspection.getInspectionRequest());
    }

    @Test
    void setScheduleTest() {
        Schedule s = new RegularScheduleImp();

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date second_time = gcal.getTime();
        s.setStartTime(first_time);
        s.setEndTime(second_time);

        Inspection inspection = new InspectionImp();
        inspection.setSchedule(s);
        Schedule schedule = inspection.getSchedule();

        Assert.assertEquals(s, schedule);
    }

    @Test
    void getScheduleTest() {

        Schedule s = new RegularScheduleImp();

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date second_time = gcal.getTime();
        s.setStartTime(first_time);
        s.setEndTime(second_time);

        Inspection inspection = new InspectionImp();
        inspection.setSchedule(s);
        Schedule schedule = inspection.getSchedule();

        Assert.assertEquals(s, schedule);
    }

    @Test
    void getInspectionRequest() {
        InspectionRequest request = new InspectionRequestImp();
        Inspection inspection = new InspectionImp();
        inspection.setInspectionRequest(request);
        InspectionRequest result = inspection.getInspectionRequest();
        Assert.assertEquals(request, result);
    }

    @Test
    void getInspectionResult() {
        String expectedResult = "Hello";
        Inspection inspection = new InspectionImp();
        inspection.setInspectionResult(expectedResult);
        String actualResult = inspection.getInspectionResult();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void toStringTest() {
        Inspection inspection = new InspectionImp();
        InspectionRequest inspectionRequest = new InspectionRequestImp();

        User user = new UserImp();
        user.setUsername("Name");
        inspectionRequest.setUser(user);

        Facility facility = new FacilityImp();
        facility.setName("Facility Name");
        inspectionRequest.setFacility(facility);

        inspection.setInspectionRequest(inspectionRequest);


        String expectedResult= "Inspection is requested by Name\n" +
                "Inspected facility is Facility Name\n" +
                "No problem is found.\n";
        String actualResult = inspection.toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void setInspectionResult() {
        String expectedResult = "Hello";
        Inspection inspection = new InspectionImp();
        inspection.setInspectionResult(expectedResult);
        String actualResult = inspection.getInspectionResult();
        Assert.assertEquals(expectedResult, actualResult);
    }
}