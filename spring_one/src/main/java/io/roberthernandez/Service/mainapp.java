package main.java.io.roberthernandez.Service;
import main.java.io.roberthernandez.Model.FacilManag.*;
import main.java.io.roberthernandez.Model.InspecManag.*;
import main.java.io.roberthernandez.Model.MaintManag.*;
import main.java.io.roberthernandez.Model.ScheManag.*;
import main.java.io.roberthernandez.Model.UsageManag.*;
import main.java.io.roberthernandez.Model.UserManag.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class mainapp {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("C:\\Users\\Jun\\Desktop\\COMP473\\Project1\\objects_frameworks_and_patterns\\spring_one\\src\\main\\java\\META-INF\\app-context.xml");
//        System.out.println("***************** Application Context instantiated! ******************");
//
//        System.out.println("\n\nTest:");
//        User user1 = (User) context.getBean("user");
//
//        user1.setContactInfo("rhernandez3@luc.edu");
//        user1.setUserID(1);
//        user1.setUsername("Robert");
//
//        System.out.println(user1.toString());
//
//        System.out.println("End of Test.\n\n");
//
//
//        testListFacilities();
//        testGetFacilityInformation();
//        testRequestAvalibleCapacity();
//        testAddNewFacility();
//        testAddFacilityDetail();
//        testRemoveFacility();
//
//        testIsInUseDuringInterval();
//        testAssignFacilityToUse();
//        testVacateFacility();
//        testListActualUsage();
//        testcalFacilityUsageRate();
//        testListInspection();
//
//        testMakeMaintRequest();
//        testScheduleMaintenance();
//        testcalMaintenanceCostForFacility();
//        testcalProblemRateForFacility();
//        testcalDownTimeForFacility();
//        testListMaintRequest();
//        testListMaintenance();
//        testListFacilityProblems();

        System.out.println("Test Observer Pattern:");
        System.out.println("Both Robert and Jun are added in observer list. They will receive message if new maintenance is added to maintenance management list");
        System.out.println();System.out.println();
        User user_one = new UserImp();
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        User user_two = new UserImp();
        user_two.setUsername("Jun");
        user_two.setUserID(2);
        user_two.setContactInfo("jwei4@luc.edu");

        Facility facility_one = new FacilityImp();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=new MaintenanceRequestImp();
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        ScheduleImp s=new ScheduleImp();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=new MaintenanceImp();
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=new MaintenanceRequestImp();
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=new ScheduleImp();
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=new MaintenanceImp();
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=new MaintenanceManangementImp();

        user_one.setMaintenanceManangement(mm);
        user_two.setMaintenanceManangement(mm);
        mm.addUser(user_one);
        mm.addUser(user_two);

        mm.addMaintenanceToBeManaged(maint);

        System.out.println();
        System.out.println("Jun is removed from observer list. Only Robert will receive new maintenance message.");
        System.out.println();System.out.println();

        mm.removeUser(user_two);
        mm.addMaintenanceToBeManaged(maint2);

    }

    public  static void testListInspection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test list all Inspections:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        User user_two = (User)context.getBean("user");
        user_two.setUserID(2);
        user_two.setUsername("Jun");
        user_two.setContactInfo("jwei4@luc.edu");

        Facility facility_one = new FacilityImp();
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        Facility facility_two = new FacilityImp();
        facility_two.setCapacity(50);
        facility_two.setName("Loyola Cuneo");

        InspectionRequest ir1=(InspectionRequest)context.getBean("inspectionRequest");
        ir1.setFacility(facility_one);
        ir1.setUser(user_one);

        InspectionRequest ir2=(InspectionRequest)context.getBean("inspectionRequest");
        ir1.setFacility(facility_two);
        ir1.setUser(user_two);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();

        Schedule s=(Schedule)context.getBean("schedule");
        s.setStartTime(first_time);
        s.setEndTime(third_time);

        Inspection ins1=(Inspection)context.getBean("inspection");
        ins1.setInspectionRequest(ir1);
        ins1.setSchedule(s);


        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        Inspection ins2=(Inspection)context.getBean("inspection");
        ins2.setInspectionRequest(ir2);
        ins2.setSchedule(s2);

        InspectionManagement im=(InspectionManagement)context.getBean("inspectionManagement");
        im.addInspection(ins1);
        im.addInspection(ins2);

        im.listInspections();

    }


    public static void testListFacilityProblems(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test list all problems of facility:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";

        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);


        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.println("List of problems of " + facility_one + ":");
        mm.listFacilityProblems(facility_one);


    }


    public static void testListMaintenance(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test list all maintenance:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        ScheduleImp s=new ScheduleImp();

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print(mm.listMaintenance());
        System.out.println();
        System.out.println();

    }


    public static void testListMaintRequest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test list of all maintenance requests:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print(mm.listMaintRequests());
        System.out.println();
        System.out.println();

    }


    public static void testcalDownTimeForFacility(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test calculation of total maintenance time for facility:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The total down time of maintenances for " + facility_one + " is: ");
        System.out.print(mm.calcDownTimeForFacility(facility_one));
        System.out.println(" second.");
        System.out.println();;

    }

    public  static void  testcalProblemRateForFacility(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test calculation of problem rate for facility:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The problem rate of " + facility_one + " is: ");
        System.out.println(mm.calcProblemRateForFacility(facility_one,10));
        System.out.println();
    }


    public static void testcalMaintenanceCostForFacility(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test calculation of maintenance cost for facility:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();

        gcal.add(Calendar.SECOND, 20);
        Date second_time=gcal.getTime();
        gcal.add(Calendar.SECOND,20);
        Date fourth_time=gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";
        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        MaintenanceRequest mr2=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr2.setUser(user_one);
        mr2.setFacility(facility_one);

        Schedule s2=(Schedule)context.getBean("schedule");
        s2.setStartTime(second_time);
        s2.setEndTime(fourth_time);

        double c2=50.00;
        String problem2="Fix floor";

        Maintenance maint2=(Maintenance)context.getBean("maintenance");
        maint2.setMaintenance(mr2,s2,c2,problem2);

        MaintenanceManangement mm=(MaintenanceManangement)context.getBean("maintenanceManagement");
        mm.addMaintenanceToBeManaged(maint);
        mm.addMaintenanceToBeManaged(maint2);

        System.out.print("The total cost of maintenances for " + facility_one + " is: ");
        System.out.println(mm.calcMaintenanceCostForFacility(facility_one));

        System.out.println();
    }


    public static void testScheduleMaintenance(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test schedule maintenance:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        double c = 20.00;

        String problem = "Fix desks.";

        Maintenance maint=(Maintenance)context.getBean("maintenance");
        maint.setMaintenance(mr,s,c,problem);

        System.out.println(maint);



    }


    public static void testMakeMaintRequest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test make maintenance request:");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");


        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");

        MaintenanceRequest mr=(MaintenanceRequest)context.getBean("maintenanceRequest");
        mr.setFacility(facility_one);
        mr.setUser(user_one);

        System.out.println(mr);


    }


    public static void testcalFacilityUsageRate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test calculation of facility usage rate");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(100);
        facility_one.setName("Loyola Damen");



        Usage use=(Usage)context.getBean("usage");
        use.setUser(user_one);

        use.setFacility(facility_one);
        use.setReservations(5);



        System.out.print("In this usage, actual usage is: ");
        System.out.println(use.listActualUsage());
        System.out.print("Facility capacity is: ");
        System.out.println(use.getMax_capacity());
        System.out.print("The usage rate is: ");
        System.out.println(use.calcUsageRate());

        System.out.println();


    }

    public static void testListActualUsage() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test List Actual Usage: ");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Usage use=(Usage)context.getBean("usage");
        use.setUser(user_one);

        use.setFacility(facility_one);

        use.assignFacilityToUse(use.getFacility());

        UsageManagement management = (UsageManagement)context.getBean("usageManagement");
        management.AddUsage(use);
        System.out.print("Acutal Usage: ");
        management.listActualUsage(use.getFacility());

        System.out.println();
    }

    public static void testVacateFacility() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Vacate Facility: ");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");

        Usage use=(Usage)context.getBean("usage");
        use.setUser(user_one);

        use.setFacility(facility_one);

        System.out.print("Before vacate: ");
        use.assignFacilityToUse(use.getFacility());

        System.out.print("After vacate: ");
        use.vacateFacility();
        // facilities in use will be null now

        System.out.println();
    }

    public static void testAssignFacilityToUse() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Assign Facility To Use: ");

        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");



        Usage use=(Usage)context.getBean("usage");
        use.setUser(user_one);
        use.setFacility(facility_one);

        use.assignFacilityToUse(use.getFacility());

        System.out.println();

    }


    public static void testIsInUseDuringInterval() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        User user_one = (User) context.getBean("user");
        user_one.setUsername("Robert");
        user_one.setUserID(1);
        user_one.setContactInfo("rhernandez3@luc.edu");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setCapacity(50);
        facility_one.setName("Loyola Damen");

        Date first_time = new Date();
        Calendar gcal = new GregorianCalendar();
        gcal.setTime(first_time);
        gcal.add(Calendar.SECOND, 1);
        Date second_time = gcal.getTime();
        gcal.add(Calendar.SECOND, 4);
        Date third_time = gcal.getTime();
        gcal.add(Calendar.SECOND, 4);
        Date fourth_time = gcal.getTime();


        Schedule s=(Schedule)context.getBean("schedule");

        s.setStartTime(first_time);
        s.setEndTime(third_time);

        Usage use=(Usage)context.getBean("usage");
        use.setUser(user_one);
        use.setSchedule(s);
        use.setFacility(facility_one);

        System.out.print("Test Use interval(between interval): ");
        System.out.println(use.isInUseDuringInterval(second_time));
        System.out.print("Test Use interval(outside interval): ");
        System.out.println(use.isInUseDuringInterval(fourth_time));

        System.out.println();
    }

    public static void testRemoveFacility() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.print("Test Remove Facility: ");
        FacilityManagement management = (FacilityManagement)context.getBean("facilityManagement");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        Facility facility_two = (Facility)context.getBean("facility");
        facility_two.setName("Loyola Cuneo");
        facility_two.setCapacity(30);

        management.addFacility(facility_one);
        management.addFacility(facility_two);
        System.out.println("Before removing facility");
        management.listFacilities();

        management.removeFacility(facility_one);

        System.out.println("After removing one facility");
        management.listFacilities();

        management.removeFacility(facility_two);
        System.out.println("After removing second facility(blank)");
        management.listFacilities();

        System.out.println();
    }

    public static void testAddFacilityDetail() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Add Facility Detail");
        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        List<FacilityDetail> details = facility_one.getFacilityDetails();

        System.out.println("Before adding facility detail:");

        if (details.size()==0){
            System.out.println("There is no detail of this facility");
        }

        else {

            for (FacilityDetail det : details) {
                System.out.println("Facility Detail: ");
                System.out.println(det);
            }
        }

        System.out.println("After adding facility detail:");
        String detailString = "Located on Lake Shore Campus";
        FacilityDetail detail = (FacilityDetail)context.getBean("facilityDetail");
        detail.setDetail(detailString);

        facility_one.addFacilityDetail(detail);
        details = facility_one.getFacilityDetails();

        if (details.size()==0){
            System.out.println("There is no detail of this facility");
        }

        else {

            for (FacilityDetail det : details) {
                System.out.println("Facility Detail: ");
                System.out.println(det);
            }
        }

        System.out.println();

    }

    public static void testAddNewFacility() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Add New Facility: ");
        FacilityManagement management = (FacilityManagement)context.getBean("facilityManagement");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        Facility facility_two = (Facility)context.getBean("facility");
        facility_two.setName("Loyola Cuneo");
        facility_two.setCapacity(30);

        System.out.println("Add first facility and print:");
        management.addFacility(facility_one);
        management.listFacilities();


        System.out.println("Add second facility and print:");
        management.addFacility(facility_two);
        management.listFacilities();

        System.out.println();

    }

    public static void testRequestAvalibleCapacity() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Request Availible Capacity: ");
        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        facility_one.requestAvailableCapacity();
        System.out.println();
    }

    public static void testGetFacilityInformation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test Get Facility Information: ");
        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        System.out.println(facility_one.getFacilityInformation());
        System.out.println();
    }

    public static void testListFacilities() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("Test List Facilities: ");
        FacilityManagement management = (FacilityManagement)context.getBean("facilityManagement");

        Facility facility_one = (Facility)context.getBean("facility");
        facility_one.setName("Loyola Damen");
        facility_one.setCapacity(50);

        Facility facility_two = (Facility)context.getBean("facility");
        facility_two.setName("Loyola Cuneo");
        facility_two.setCapacity(30);

        management.addFacility(facility_one);
        management.addFacility(facility_two);

        management.listFacilities();

        System.out.println();
    }

    public static Schedule createSchedule() {
        Date first_time = new Date();

        Schedule schedule = new ScheduleImp();

        schedule.setStartTime(first_time);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Date second_time = new Date();

        schedule.setEndTime(second_time);

        return schedule;
    }
}

