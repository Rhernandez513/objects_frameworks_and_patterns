package io.roberthernandez.Model.FacilManag;

public class FacilityDetailImp implements FacilityDetail{
    private String detail;

    public FacilityDetailImp() {
    }


    public void setDetail(String s) {
        this.detail = s;
    }

    public String getDetail() {
        return this.detail;
    }

    public String toString() {
        return this.detail;
    }
}
