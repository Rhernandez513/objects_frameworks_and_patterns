package main.java.io.roberthernandez.Model.ScheManag;

import java.util.Date;

public class ScheduleImp implements Schedule {
    private Date StartTime;
    private Date EndTime;

    public String toString() {
        String response = "";
        response += "Start Time: " + this.StartTime.toString()+ "\t\t\t";
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
