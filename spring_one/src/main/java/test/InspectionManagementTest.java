package test;

import io.roberthernandez.Model.InspecManag.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InspectionManagementTest {

    @Test
    void addInspectionTest() {
        Inspection inspection = new InspectionImp();
        InspectionManagement management = new InspectionManagementImp();
        management.addInspection(inspection);
        List<Inspection> list = management.getInspections();
        Assert.assertEquals(inspection,list.get(0));
    }

    @Test
    void getInspectionsTest() {
        Inspection inspection = new InspectionImp();
        InspectionManagement management = new InspectionManagementImp();
        management.addInspection(inspection);
        List<Inspection> list = management.getInspections();
        Assert.assertEquals(inspection,list.get(0));
    }

    @Test
    void setInspectionsTest() {
        Inspection inspection = new InspectionImp();
        Inspection inspection_two = new InspectionImp();
        InspectionManagement management = new InspectionManagementImp();

        management.addInspection(inspection);
        management.addInspection(inspection_two);

        List<Inspection> list = management.getInspections();

        // Static list
        List<Inspection> list_two = new ArrayList<Inspection>();
        list_two.add(inspection);
        list_two.add(inspection_two);

        Assert.assertEquals(list, list_two);
    }

    @Test
    void listInspectionsTest() {
        Inspection inspection = new InspectionImp();
        Inspection inspection_two = new InspectionImp();
        InspectionManagement management = new InspectionManagementImp();

        management.addInspection(inspection);
        management.addInspection(inspection_two);

        // Next step is to print out the result, add it to a static string, then compare dynamically
        // in the test what we see from interactive use
//        management.listInspections();
    }
}