package io.roberthernandez.Model.UserManag;

import io.roberthernandez.Model.MaintManag.Maintenance;
import io.roberthernandez.Model.MaintManag.MaintenanceManangement;

public class UserImp implements User{
    private String Username;
    private int UserID;
    private String ContactInfo;
    private MaintenanceManangement maint;

    public void setMaintenanceManangement(MaintenanceManangement maint){
        this.maint=maint;
    }

    @Override
    public void update() {
        Maintenance newMaint = maint.getNewMaint();
        String notify = "There is new maintenance schedule:\n";
        notify = notify + newMaint;
        System.out.println(notify);
    }

    public void setUsername(String input) {
        this.Username = input;
    }
    public String getUsername() {
        return this.Username;
    }

    public void setUserID(int input) {
        this.UserID = input;
    }
    public int getUserID() {
        return this.UserID;
    }

    public void setContactInfo(String input) {
        this.ContactInfo = input;
    }
    public String getContactInfo() {
        return this.ContactInfo;
    }


    public String toString() {
        String response = getUsername();
        return response;
    }
}
