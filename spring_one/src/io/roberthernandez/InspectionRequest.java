package io.roberthernandez;

public class InspectionRequest {
   private Facility facility;
   private User user;

   public InspectionRequest(Facility f, User u){
      this.facility=f;
      this.user=u;
   }

   public User getUer(){
      return user;
   }

   public Facility getFacility() {
      return facility;
   }
}
