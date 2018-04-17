package main.java.test;
import main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MaintenanceItemBlackboardTest {

    @Test
    void setMaintItemBlackboardNumber() {
        MaintenanceItemBlackboard maint = new MaintenanceItemBlackboard(1,20);
        maint.setMaintItemBlackboardNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void setMaintItemBlackboardPrice() {
        MaintenanceItemBlackboard maint = new MaintenanceItemBlackboard(1,20);
        maint.setMaintItemBlackboardPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice())<0.00000001,true);
    }

    @Test
    void getN() {
        MaintenanceItemBlackboard maint = new MaintenanceItemBlackboard(1,20);
        maint.setMaintItemBlackboardNumber(5);
        Assert.assertEquals(5,maint.getN());
    }

    @Test
    void getPrice() {
        MaintenanceItemBlackboard maint = new MaintenanceItemBlackboard(1,20);
        maint.setMaintItemBlackboardPrice(5.0);
        Assert.assertEquals((5.0-maint.getPrice())<0.00000001,true);
    }

    @Test
    void accept() {
    }
}