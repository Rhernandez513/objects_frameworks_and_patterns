package io.roberthernandez.Model.InspecManag;

import io.roberthernandez.Model.FacilManag.Facility;
import io.roberthernandez.Model.UserManag.User;

public class InspectionRequestImp implements InspectionRequest{
   private Facility facility;
   private User user;

   public void setFacility(Facility facility) {
      this.facility = facility;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public User getUer(){
      return user;
   }

   public Facility getFacility() {
      return facility;
   }
}
