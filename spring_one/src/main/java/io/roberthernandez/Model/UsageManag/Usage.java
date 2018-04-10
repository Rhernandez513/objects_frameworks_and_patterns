package main.java.io.roberthernandez.Model.UsageManag;

import main.java.io.roberthernandez.Model.FacilManag.Facility;
import main.java.io.roberthernandez.Model.ScheManag.Schedule;
import main.java.io.roberthernandez.Model.UserManag.User;

import java.util.Date;

public interface Usage {
    public Facility getFacility();
    public void setFacility(Facility f);
    public void setReservations(int n);
    public void setUser(User u);
    public void setSchedule(Schedule s);
    public int getMax_capacity();
    public Object isInUseDuringInterval(Date date);
    public Object assignFacilityToUse(Facility facility);
    public Object vacateFacility();
    public Object listActualUsage();
    public Object calcUsageRate();
    public String toString();
}
