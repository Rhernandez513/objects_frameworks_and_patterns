package main.java.test;

import main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaintenanceItemLightTest {

    @Test
    void setMaintItemLightkNumber() {
        MaintenanceItemLight maint = new MaintenanceItemLight(1,20);
        maint.setMaintItemLightkNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void setMaintItemLightPrice() {
        MaintenanceItemLight maint = new MaintenanceItemLight(1,20);
        maint.setMaintItemLightPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice()<0.000000001),true);
    }

    @Test
    void getN() {
        MaintenanceItemLight maint = new MaintenanceItemLight(1,20);
        maint.setMaintItemLightkNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void getPrice() {
        MaintenanceItemLight maint = new MaintenanceItemLight(1,20);
        maint.setMaintItemLightPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice()<0.000000001),true);
    }

    @Test
    void accept() {
    }
}