package main.java.test;

import main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MaintenanceItemDeskTest {

    @Test
    void setMaintItemDeskNumber() {
        MaintenanceItemDesk maint = new MaintenanceItemDesk(1,20);
        maint.setMaintItemDeskNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void setMaintItemDeskPrice() {
        MaintenanceItemDesk maint = new MaintenanceItemDesk(1,20);
        maint.setMaintItemDeskPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice())<0.00000001,true);
    }

    @Test
    void getN() {
        MaintenanceItemDesk maint = new MaintenanceItemDesk(1,20);
        maint.setMaintItemDeskNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void getPrice() {
        MaintenanceItemDesk maint = new MaintenanceItemDesk(1,20);
        maint.setMaintItemDeskPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice())<0.00000001,true);
    }

    @Test
    void accept() {
    }
}