package main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor;

public class MaintenanceItemLight implements MaintenanceItemlizedCost {

    //set number of total number of lights need to be replaced and price of each light
    private int n;
    private double price;

    public MaintenanceItemLight(int n, double price){
        this.n=n;
        this.price=price;
    }

    public void setMaintItemLightkNumber(int n){
        this.n=n;
    }

    public void setMaintItemLightPrice(double price){
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
