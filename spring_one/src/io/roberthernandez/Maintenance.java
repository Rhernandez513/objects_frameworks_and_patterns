package io.roberthernandez;

public class Maintenance {
    private MaintenanceRequest request;
    private Facility facility;
    private Schedule schedule;
    private double cost;

    public MaintenanceRequest getRequest() {
        return request;
    }

    public void setRequest(MaintenanceRequest input) {
        this.request = input;
    }

    public Facility getFacility() {
        return this.facility;
    }

    public void setFacility(Facility input ) {
        this.facility = input;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule input) {
        this.schedule = input;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double input) {
        this.cost = input;
    }
}
