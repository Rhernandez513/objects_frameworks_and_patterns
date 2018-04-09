package test;
import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.FacilManag.FacilityDetail;
import io.roberthernandez.Model.FacilManag.FacilityDetailImp;
import io.roberthernandez.Model.FacilManag.FacilityImp;
import org.junit.Assert;
import org.junit.Test;


public class FacilityImpTest {
    @Test
    public void toStringTest() {
        Facility facility = new FacilityImp();
        facility.setName("Hello");
        String expectedResult = "Hello";
        String actualResult = facility.toString();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void setNameTest() {
        Facility facility = new FacilityImp();
        facility.setName("Hello");
        String expectedResult = "Hello";
        String actualResult = facility.getName();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getNameTest() {
        Facility facility = new FacilityImp();
        facility.setName("Hello");
        String expectedResult = "Hello";
        String actualResult = facility.getName();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void setCapacityTest() {
        int capacity = 5;
        Facility facility = new FacilityImp();
        facility.setCapacity(capacity);
        int actualResult = facility.getCapacity();
        int expectedResult = capacity;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCapacityTest() {
        int capacity = 5;
        Facility facility = new FacilityImp();
        facility.setCapacity(capacity);
        int actualResult = facility.getCapacity();
        int expectedResult = capacity;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFacilityDetailsTest() {
        FacilityDetail detail = new FacilityDetailImp();
        detail.setDetail("Some Detail about a facility");
        Facility facility = new FacilityImp();
//        facility.addFacilityDetail(detail);
//        List<FacilityDetail> details = facility.getFacilityDetails();
//        Assert.assertEquals(detail, details.get(0));
    }
    @Test
    public void getFacilityInformationTest() {
        Facility facility = new FacilityImp();
        facility.setName("Hello");
        facility.setCapacity(5);
        String information = facility.getFacilityInformation();
        String info = "Name: Hello\n" +  "Capacity: 5";
        Assert.assertEquals(information, info);
    }
    @Test
    public void addFacilityDetail() {
        FacilityDetail detail = new FacilityDetailImp();
        detail.setDetail("Some Detail about a facility");
        Facility facility = new FacilityImp();
//        facility.addFacilityDetail(detail);
//        List<FacilityDetail> details = facility.getFacilityDetails();
//        Assert.assertEquals(detail, details.get(0));
    }
    @Test
    public void requestAvailableCapacityTest() {
        Facility facility = new FacilityImp();
        facility.setCapacity(5);
        int result = facility.requestAvailableCapacity();
        Assert.assertEquals(5, result);
    }
}
