package main.java.io.roberthernandez.Model.MaintManag.MaintenanceItemVisitor;

public interface Visitor {
    public void visit(MaintenanceItemDesk mid);
    public void visit(MaintenanceItemBlackboard mib);
    public void visit(MaintenanceItemLight mil);
}
