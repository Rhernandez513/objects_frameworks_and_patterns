package test;

import io.roberthernandez.Model.InspecManag.Inspection;
import io.roberthernandez.Model.InspecManag.InspectionImp;
import io.roberthernandez.Model.InspecManag.InspectionRequest;
import io.roberthernandez.Model.InspecManag.InspectionRequestImp;
import io.roberthernandez.Model.ScheManag.Schedule;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InspectionTest {
    private Schedule schedule;
    private InspectionRequest inspectionRequest;
    private String InspectionResult;

    @Test
    void setInspectionRequestTest() {
        Inspection inspection = new InspectionImp();
        inspection.setInspectionRequest(inspectionRequest);
        InspectionRequest request = new InspectionRequestImp();
        inspection.setInspectionRequest(request);
        Assert.assertEquals(request, inspection.getInspectionRequest());
    }

    @Test
    void setSchedule() {
    }

    @Test
    void getSchedule() {
    }

    @Test
    void getInspectionRequest() {
    }

    @Test
    void getInspectionResult() {
    }

    @Test
    void toStringTest() {
    }

    @Test
    void setInspectionResult() {
    }
}