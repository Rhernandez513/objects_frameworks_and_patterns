package io.roberthernandez.Model.FacilManag;

import java.util.List;

public interface Facility {
    public String toString();
    public void setName(String name);
    public String getName();
    public void setCapacity(int capacity);
    public int getCapacity();
    public List<FacilityDetail> getFacilityDetails();
    public String getFacilityInformation();
    public void addFacilityDetail(FacilityDetail f);
    public int requestAvailableCapacity();

}
