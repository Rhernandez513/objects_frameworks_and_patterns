package io.roberthernandez.Model.UsageManag;

import io.roberthernandez.Model.FacilManag.Facility;

public interface UsageManagement {
    public void AddUsage(Usage u);
    public void RemoveUsage(Usage u);
    public Object listUsage();
    public Object listActualUsage(Facility f);

}
