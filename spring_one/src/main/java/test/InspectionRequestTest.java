package test;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.FacilManag.FacilityImp;
import io.roberthernandez.Model.InspecManag.InspectionRequest;
import io.roberthernandez.Model.InspecManag.InspectionRequestImp;
import io.roberthernandez.Model.UserManag.User;
import io.roberthernandez.Model.UserManag.UserImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InspectionRequestTest {
    @Test
    void getUserTest() {
        User user = new UserImp();
        InspectionRequest request = new InspectionRequestImp();
        request.setUser(user);
        Assert.assertEquals(user, request.getUer());
    }
    @Test
    void getFacilityTest(){
        Facility facility = new FacilityImp();
        InspectionRequest request = new InspectionRequestImp();
        request.setFacility(facility);
        Assert.assertEquals(facility, request.getFacility());
    }
    @Test
    void setFacilityTest() {
        Facility facility = new FacilityImp();
        InspectionRequest request = new InspectionRequestImp();
        request.setFacility(facility);
        Assert.assertEquals(facility, request.getFacility());
    }
    @Test
    void setUserTest(){
        User user = new UserImp();
        InspectionRequest request = new InspectionRequestImp();
        request.setUser(user);
        Assert.assertEquals(user, request.getUer());
    }
}
