package test;

import io.roberthernandez.Model.ScheManag.Schedule;
import io.roberthernandez.Model.ScheManag.ScheduleImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class ScheduleTest {


    @Test
    public void setStartTimeTest() {
        Date t1 = new Date();
        Schedule schedule=new ScheduleImp();
        schedule.setStartTime(t1);
        Assert.assertEquals(t1, schedule.getStartTime());
    }

    @Test
    public void getStartTimeTest() {
        Date t1 = new Date();
        Schedule schedule=new ScheduleImp();
        schedule.setStartTime(t1);
        Assert.assertEquals(t1, schedule.getStartTime());
    }

    @Test
    public void setEndTimeTest() {
        Date t1 = new Date();
        Schedule schedule=new ScheduleImp();
        schedule.setEndTime(t1);
        Assert.assertEquals(t1, schedule.getEndTime());
    }

    @Test
    public void getEndTimeTest() {
        Date t1 = new Date();
        Schedule schedule=new ScheduleImp();
        schedule.setEndTime(t1);
        Assert.assertEquals(t1, schedule.getEndTime());

    }

    @Test
    public void toStringTest(){
        Date t1 = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.add(Calendar.SECOND, 20);
        Date t2 = gcal.getTime();
        Schedule schedule=new ScheduleImp();
        schedule.setStartTime(t1);
        schedule.setEndTime(t2);

        String expectedResult = "Start Time: " + t1.toString()+ "\t\t\t" + "End Time: " + t2.toString();
        Assert.assertEquals(expectedResult, schedule.toString());
     }
}