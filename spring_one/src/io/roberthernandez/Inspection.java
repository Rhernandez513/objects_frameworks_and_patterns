package io.roberthernandez;

import java.util.ArrayList;

public class Inspection {
    private Schedule schedule;
    private InspectionRequest inspectionRequest;
    private String InspectionResult;

    public Inspection(InspectionRequest ir,Schedule s){
        this.inspectionRequest=ir;
        this.schedule=s;
    }

    public String toString() {
        String response;
        response = "Inspection is requested by " + inspectionRequest.getUer()+ "\n";
        response = response + "Inspected facility is " + inspectionRequest.getFacility()+ "\n";
        if(InspectionResult==null){
            response=response+"No problem is found." +"\n";
        }
        else{
            response=response + InspectionResult+"\n";
        }

        return response;
    }

    public void setInspectionResult(String s) {
        this.InspectionResult = s;
    }
}
