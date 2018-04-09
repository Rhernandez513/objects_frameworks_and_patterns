package main.java.io.roberthernandez.Model.MaintManag;

import main.java.io.roberthernandez.Model.UserManag.User;
import main.java.io.roberthernandez.Model.FacilManag.Facility;

public interface MaintenanceRequest {
    public void setFacility(Facility input);
    public Facility getFacility();
    public void setUser(User input);
    public User getUser();
    public String toString();
}
