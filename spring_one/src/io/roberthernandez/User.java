package io.roberthernandez;

public class User {
    private String Username;
    private int UserID;
    private String ContactInfo;

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


    public String toString() { }
}
