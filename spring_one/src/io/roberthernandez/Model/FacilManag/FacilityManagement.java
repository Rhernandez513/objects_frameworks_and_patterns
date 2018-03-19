package io.roberthernandez.Model.FacilManag;

import java.util.List;

public interface FacilityManagement {
    public void setFacilityList(List<Facility> list);
    public List<Facility> getFacilityArrayList();
    public void addFacility(Facility f);
    public void removeFacility(Facility f);
    public void listFacilities();


}
