package main.java.io.roberthernandez.Model.ScheManag;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MinimalTimeScheduleImp implements Schedule {

    private Date StartTime;
    private Date EndTime;

    public String toString() {
        String response = "";
        response += "Start Time: " + this.StartTime.toString()+ "\t\t\t";
        response += "End Time: " + this.EndTime.toString();
        return response;
    }


    public void setStartTime(Date t){
        StartTime=t;
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(StartTime);
        gcal.add(Calendar.MINUTE, 15);
        EndTime = gcal.getTime();
    }

    public void setEndTime(Date t){
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(StartTime);
        gcal.add(Calendar.MINUTE, 15);
        EndTime = gcal.getTime();
    }

    public Date getStartTime() {
        return this.StartTime;
    }

    public Date getEndTime() {
        return this.EndTime;
    }


}
