package main.java.test;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.FacilManag.FacilityImp;
import main.java.io.roberthernandez.Model.MaintManag.MaintenanceRequest;
import main.java.io.roberthernandez.Model.MaintManag.MaintenanceRequestImp;
import main.java.io.roberthernandez.Model.UserManag.User;
import main.java.io.roberthernandez.Model.UserManag.UserImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MaintenanceRequestTest {
    private Facility facility;
    private User user;

    @Test
    void getFacilityTest() {
        Facility facility = new FacilityImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setFacility(facility);
        Assert.assertEquals(facility, request.getFacility());
    }
    @Test
    void setFacilityTest() {
        Facility facility = new FacilityImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setFacility(facility);
        Assert.assertEquals(facility, request.getFacility());
    }
    @Test
    void getUserTest() {
        User user = new UserImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setUser(user);
        Assert.assertEquals(user, request.getUser());
    }
    @Test
    void setUserTest() {
        User user = new UserImp();
        MaintenanceRequest request = new MaintenanceRequestImp();
        request.setUser(user);
        Assert.assertEquals(user, request.getUser());
    }
    @Test
    void toStringTest() {
        // Logic that toString() works on

//        String response = "";
//        response += "User that created this request: " + user + "\n";
//        response += "Facility Request created on: " + facility + "\n";
    }
}

