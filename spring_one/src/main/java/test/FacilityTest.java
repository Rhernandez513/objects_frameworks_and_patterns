package main.java.test;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.FacilManag.FacilityImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FacilityTest {
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
//        FacilityDetail detail = new FacilityDetailImp();
//        detail.setDetail("Some Detail about a facility");
//        Facility facility = new FacilityImp();
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
        System.out.println(information);

    }
    @Test
    public void addFacilityDetailTest(){
//        FacilityDetail detail = new FacilityDetailImp();
//        detail.setDetail("Some Detail about a facility");
//        Facility facility = new FacilityImp();
//        facility.addFacilityDetail(detail);
//        List<FacilityDetail> details = facility.getFacilityDetails();
//        Assert.assertEquals(detail, details.get(0));
    }
    @Test
    public void requestAvailableCapacityTest() {
        Facility facility = new FacilityImp();
        int capacity = 5;
        facility.setCapacity(capacity);
        int result = facility.getCapacity();
        Assert.assertEquals(capacity, result);
    }
}
