package io.roberthernandez;

import java.util.ArrayList;

public class Inspection {
    private Schedule schedule;
    private InspectionRequest inspectionRequest;
    private String InspectionResult;

    public String toString() {
        return this.InspectionResult;
    }

    public void setInspectionResult(String s) {
        this.InspectionResult = s;
    }
}
