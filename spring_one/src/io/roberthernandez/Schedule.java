package io.roberthernandez;

import java.util.Date;

public class Schedule {
    private Date StartTime;
    private Date EndTime;

    public String toString() {
        String response = "";
        response += "Start Time: " + this.StartTime.toString();
        response += "End Time: " + this.EndTime.toString();
        return response;
    }

    public void setStartTime(Date time) {
        this.StartTime = time;
    }

    public Date getStartTime() {
        return this.StartTime;
    }

    public void setEndTime(Date time) {
        this.EndTime = time;
    }

    public Date getEndTime() {
        return this.EndTime;
    }


}
