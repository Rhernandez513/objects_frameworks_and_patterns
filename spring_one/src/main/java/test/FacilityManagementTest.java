package test;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.FacilManag.FacilityImp;
import io.roberthernandez.Model.FacilManag.FacilityManagement;
import io.roberthernandez.Model.FacilManag.FacilityManagementImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FacilityManagementTest {

    @Test
    void setFacilityListTest() {
        Facility facility_one = new FacilityImp();
        Facility facility_two = new FacilityImp();
        List<Facility> list = new ArrayList<Facility>();
        list.add(facility_one);
        list.add(facility_two);
        FacilityManagement management = new FacilityManagementImp();
        management.setFacilityList(list);
        List<Facility> result = management.getFacilityArrayList();
        Assert.assertEquals(list, result);
    }

    @Test
    void getFacilityArrayListTest() {
        Facility facility_one = new FacilityImp();
        Facility facility_two = new FacilityImp();
        List<Facility> list = new ArrayList<Facility>();
        list.add(facility_one);
        list.add(facility_two);
        FacilityManagement management = new FacilityManagementImp();
        management.setFacilityList(list);
        List<Facility> result = management.getFacilityArrayList();
        Assert.assertEquals(list, result);
    }

    @Test
    void addFacilityTest() {
//        Facility facility = new FacilityImp();
//        FacilityManagement management = new FacilityManagementImp();
//        management.addFacility(facility);
//        List<Facility> list = management.getFacilityArrayList();
//        Assert.assertEquals(facility, list.get(0));
    }

    @Test
    void removeFacilityTest(){
//        Facility facility = new FacilityImp();
//        FacilityManagement management = new FacilityManagementImp();
//        management.addFacility(facility);
//        management.removeFacility(facility);
//        List<Facility> list = management.getFacilityArrayList();
//        int length = 0;
//        Assert.assertEquals(length, list.size());
    }

    @Test
    void listFacilitiesTest() {
//        Facility facility = new FacilityImp();
//        FacilityManagement management = new FacilityManagementImp();
//        management.addFacility(facility);
//        management.listFacilities();
    }

    @Test
    void setFacilitiesTest() {
        Facility facility_one = new FacilityImp();
        Facility facility_two = new FacilityImp();
        List<Facility> list = new ArrayList<Facility>();
        list.add(facility_one);
        list.add(facility_two);
        FacilityManagement management = new FacilityManagementImp();
        management.setFacilityList(list);
        List<Facility> list_under_test = management.getFacilityArrayList();
        Assert.assertEquals(list, list_under_test);
    }
}