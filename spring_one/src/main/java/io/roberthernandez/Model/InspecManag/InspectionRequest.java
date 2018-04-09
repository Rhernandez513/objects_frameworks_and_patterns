package main.java.io.roberthernandez.Model.InspecManag;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.UserManag.User;

public interface InspectionRequest {
    public User getUer();
    public Facility getFacility();
    public void setFacility(Facility facility);
    public void setUser(User uer);
}
