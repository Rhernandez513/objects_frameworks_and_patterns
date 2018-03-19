package io.roberthernandez.Model.InspecManag;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.UserManag.User;

public interface InspectionRequest {
    public User getUer();
    public Facility getFacility();
    public void setFacility(Facility facility);
    public void setUser(User uer);
}
