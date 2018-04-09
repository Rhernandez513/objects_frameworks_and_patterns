package test;

import io.roberthernandez.Model.FacilManag.FacilityDetailImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FacilityDetailTest {

    @Test
    void setDetailTest() {
        FacilityDetailImp facilityDetailImp = new FacilityDetailImp();
        facilityDetailImp.setDetail("Detail");
        String result = facilityDetailImp.getDetail();
        Assert.assertEquals(result, "Detail");
    }

    @Test
    void getDetailTest() {
        FacilityDetailImp facilityDetailImp = new FacilityDetailImp();
        facilityDetailImp.setDetail("Detail");
        String result = facilityDetailImp.getDetail();
        Assert.assertEquals(result, "Detail");
    }

    @Test
    void toStringTest() {
        FacilityDetailImp facilityDetailImp = new FacilityDetailImp();
        facilityDetailImp.setDetail("Detail");
        String result = facilityDetailImp.toString();
        Assert.assertEquals(result, "Detail");
    }
}