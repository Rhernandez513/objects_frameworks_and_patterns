package main.java.io.roberthernandez.Model.UserManag;

import main.java.io.roberthernandez.Model.MaintManag.*;

public interface User {
    public void setUsername(String input);
    public String getUsername();
    public void setUserID(int input);
    public int getUserID();
    public void setContactInfo(String input);
    public String getContactInfo();
    public String toString();
    public void update();
    public void setMaintenanceManangement(MaintenanceManangement maint);
}
