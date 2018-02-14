package io.roberthernandez;

import java.util.Date;

public class Schedule {
    private Date StartTime;
    private Date EndTime;

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
