package main.java.io.roberthernandez.Model.InspecManag;

import main.java.io.roberthernandez.Model.ScheManag.Schedule;

public class InspectionImp implements Inspection {
    private Schedule schedule;
    private InspectionRequest inspectionRequest;
    private String InspectionResult;

    public void setInspectionRequest(InspectionRequest ir){
        this.inspectionRequest =ir;
    }

    public void setSchedule(Schedule s){
        this.schedule=s;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public InspectionRequest getInspectionRequest() {
        return inspectionRequest;
    }

    public String getInspectionResult(){
        return this.InspectionResult;
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
