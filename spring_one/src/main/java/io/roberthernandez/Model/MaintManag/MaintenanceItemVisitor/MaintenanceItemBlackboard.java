package main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor;

public class MaintenanceItemBlackboard implements MaintenanceItemlizedCost {
    //set number of total number of blackboard need to be replaced and price of each blackboard
    private int n;
    private double price;

    public MaintenanceItemBlackboard(int n, double price){
        this.n=n;
        this.price=price;
    }

    public void setMaintItemBlackboardNumber(int n){
        this.n=n;
    }

    public void setMaintItemBlackboardPrice(double price){
        this.price=price;
    }

    public int getN(){
        return n;
    }

    public double getPrice(){
        return price;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
