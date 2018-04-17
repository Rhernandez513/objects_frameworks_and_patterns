package main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor;

public class MaintenanceTotalFee implements Visitor {
    double totalFee;

    //Assume that total fee include item fee and labor fee. And labor fee will be different for different items.
    public void visit(MaintenanceItemBlackboard mib){
        double itemfee=0;
        itemfee = mib.getPrice()*mib.getN();

        double laborfee=0;
        if(mib.getN()<4){
            laborfee=20;
        }
        else{
            laborfee=50;
        }

        totalFee += itemfee + laborfee;
     }

    public void visit(MaintenanceItemDesk mid){
        double itemfee=0;
        itemfee = mid.getPrice()*mid.getN();

        double laborfee=0;
        if(mid.getN()<11){
            laborfee=mid.getN()*1.0;
        }
        else{
            laborfee=10;
        }

        totalFee += itemfee + laborfee;
    }


    public void visit(MaintenanceItemLight mil){
        double itemfee=0;
        itemfee = mil.getPrice()*mil.getN();

        double laborfee=5;
        totalFee += itemfee + laborfee;
    }

    public double getTotalFee(){
        return totalFee;
    }

}
