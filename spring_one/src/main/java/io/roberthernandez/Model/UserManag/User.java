package io.roberthernandez.Model.UserManag;

import io.roberthernandez.Model.MaintManag.MaintenanceManangement;

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
