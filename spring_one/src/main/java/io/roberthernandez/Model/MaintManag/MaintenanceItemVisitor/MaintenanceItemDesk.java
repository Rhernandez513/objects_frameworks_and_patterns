package main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor;

public class MaintenanceItemDesk implements MaintenanceItemlizedCost {
    //set number of total number of desk need to be replaced and price of each desk
    private int n;
    private double price;

    public MaintenanceItemDesk(int n, double price){
        this.n=n;
        this.price=price;
    }

    public void setMaintItemDeskNumber(int n){
        this.n=n;
    }

    public void setMaintItemDeskPrice(double price){
        this.price=price;
    }

    public int getN(){
        return n;
    }

    public double getPrice(){
        return price;
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
