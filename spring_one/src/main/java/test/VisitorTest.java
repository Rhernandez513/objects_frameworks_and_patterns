package main.java.test;

import main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VisitorTest {

    MaintenanceItemlizedCost mil1=new MaintenanceItemLight(2,15.0);
    MaintenanceItemlizedCost mid1=new MaintenanceItemDesk(8,5.0);



    @Test
    void visit() {
        MaintenanceItemBlackboard mib1=new MaintenanceItemBlackboard(2,50);
        MaintenanceTotalFee visitor= new MaintenanceTotalFee();
        mib1.accept(visitor);
        double fee = mib1.getN()*mib1.getPrice()+20;
        Assert.assertEquals(true, (fee-visitor.getTotalFee()<0.000000001));

    }

    @Test
    void visit2() {
        MaintenanceItemDesk mid1 = new MaintenanceItemDesk(8,5.0);
        MaintenanceTotalFee visitor= new MaintenanceTotalFee();
        mid1.accept(visitor);
        double fee = mid1.getN()*mid1.getPrice()+mid1.getN()*1.0;
        Assert.assertEquals(true, (fee-visitor.getTotalFee()<0.000000001));

    }


    @Test
    void visit3() {
        MaintenanceItemLight mil1 = new MaintenanceItemLight(8,5.0);
        MaintenanceTotalFee visitor= new MaintenanceTotalFee();
        mil1.accept(visitor);
        double fee = mil1.getN()*mil1.getPrice()+5.0;
        Assert.assertEquals(true, (fee-visitor.getTotalFee()<0.000000001));
    }


    @Test
    void visit4() {
        MaintenanceItemBlackboard mib1=new MaintenanceItemBlackboard(4,50);
        MaintenanceTotalFee visitor= new MaintenanceTotalFee();
        mib1.accept(visitor);
        double fee = mib1.getN()*mib1.getPrice()+50;
        Assert.assertEquals(true, (fee-visitor.getTotalFee()<0.000000001));

    }

}