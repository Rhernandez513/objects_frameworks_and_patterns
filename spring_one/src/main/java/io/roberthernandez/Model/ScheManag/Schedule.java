package main.java.io.roberthernandez.Model.ScheManag;

import java.util.Date;

public interface Schedule {
    public String toString();
    public void setStartTime(Date time);
    public Date getStartTime();
    public void setEndTime(Date time);
    public Date getEndTime();
}
