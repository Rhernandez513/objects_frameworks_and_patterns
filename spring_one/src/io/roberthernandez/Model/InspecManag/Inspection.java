package io.roberthernandez.Model.InspecManag;

import io.roberthernandez.Model.ScheManag.Schedule;

public interface Inspection {
    public void setInspectionRequest(InspectionRequest ir);
    public void setSchedule(Schedule s);
    public Schedule getSchedule();
    public InspectionRequest getInspectionRequest();
    public String getInspectionResult();
    public String toString();
    public void setInspectionResult(String s);
}
