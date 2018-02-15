package io.roberthernandez;

public class MaintenanceRequest {
    private Facility facility;
    private User user;

    public void setFacility(Facility input) {
        this.facility = input;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setUser(User input) {
        this.user = input;
    }

    public User getUser() {
        return user;
    }

    public String toString() {
        String response = "";
        response += "User that created this request: " + user + "\n";
        response += "Facility Request created on: " + facility + "\n";
        return response;
    }
}
