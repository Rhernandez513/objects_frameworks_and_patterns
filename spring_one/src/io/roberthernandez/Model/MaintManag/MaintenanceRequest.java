package io.roberthernandez.Model.MaintManag;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.UserManag.User;

public interface MaintenanceRequest {
    public void setFacility(Facility input);
    public Facility getFacility();
    public void setUser(User input);
    public User getUser();
    public String toString();
}
