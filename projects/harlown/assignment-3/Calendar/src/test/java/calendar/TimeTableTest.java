package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
//import Appt.Appt;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 appts.add(appt4);

		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 		 appts.add(appt);

		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 		 appts.add(appt2);

		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	int[] array={0,1};
		 	appt.setRecurrence(array,2,3,4);
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	assertNotNull(get_app_range.getApptRange(appts,greg1,greg2));
		 	assertEquals(appts,get_app_range.deleteAppt(appts,appt));
	 }
	 // @Test
	 //  public void test02()  throws Throwable  {
		// 	LinkedList<Appt> appts=new LinkedList<Appt>();
		//  	appts.add(new Appt(3,4,5,6,7,"sasdfup","basdfruh"));
		//  	GregorianCalendar greg1=new GregorianCalendar();
		//  	GregorianCalendar greg2=new GregorianCalendar();
		//  	TimeTable get_app_range= new TimeTable();
		//  	get_app_range.getApptRange(appts,greg1,greg2);	 
	 // }

	 @Test
	  public void test03()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appts.add(new Appt(startHour,startMinute,startDay,startMonth,startYear,title,description));
		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
	 }
	  @Test
	  public void test04()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour1=21;
		 int startMinute1=30;
		 int startDay1=15;
		 int startMonth1=01;
		 int startYear1=2018;
		 String title1="Birthday Party";
		 String description1="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 // Appt appt1 = new Appt(startHour1,
		 //          startMinute1 ,
		 //          startDay1 ,
		 //          startMonth1 ,
		 //          startYear1 ,
		 //          title1,
		 //         description1);
		 // int startHour2=12;
		 // int startMinute2=23;
		 // int startDay2=12;
		 // int startMonth2=2;
		 // int startYear2=2019;
		 // String title2="Birthday ;hkjasfd";
		 // String description2="This is asxdf birthday party.";
		 // //Construct a new Appointment object with the initial data	 
		 // Appt appt2 = new Appt(startHour2,
		 //          startMinute2 ,
		 //          startDay2 ,
		 //          startMonth2 ,
		 //          startYear2 ,
		 //          title2,
		 //         description2);
		 //appts.add(new Appt(startHour1,startMinute1,startDay1,startMonth1,startYear1,title1,description1));
		 //appts.add(new Appt(startHour2,startMinute2,startDay2,startMonth2,startYear2,title2,description2));
		 int d1=13;
		 int d2=13;
		 int month1=2;
		 int month2=2;
		 int yr1=2017;
		 int yr2=2022;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,d1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,d2,d2);
		 	
		 	LinkedList<CalDay> calday2=new LinkedList<CalDay>();
		 	calday2.add(new CalDay(greg1));
		 	TimeTable get_app_range= new TimeTable();
		 	//get_app_range.getApptRange(appts,greg1,greg2);
		 	//assertEquals(calday2,get_app_range.getApptRange(appts,greg1,greg2));

		 		//////////////assertEquals(calday2,get_app_range.getApptRange(appts,greg1,greg2));
		 	//get_app_range.deleteAppt(appts,appt1);
		 	//assertNull(get_app_range.deleteAppt(appts,appt2));
		  	int [] array ={1,0};
			//assertNotNull(get_app_range.permute(appts,array));

	 }
	@Test
	  public void test05()  throws Throwable  {
		 LinkedList<Appt> appts=new LinkedList<Appt>();
		 TimeTable timetable= new TimeTable();
		 int startHour=2;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int j =startMinute+startHour+startDay+startMonth+startYear;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertNull(timetable.deleteAppt(appts,appt));
		 assertTrue(appt.getValid());
		 appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 appts.add(new Appt(3,3,3,4,2019,"do you qweknow da way","brqweuddah"));
		 //assertEquals(appts,timetable.deleteAppt(appts,appt));
		 assertNull(timetable.deleteAppt(appts,appt));
}
@Test
	  public void test06()  throws Throwable  {
		 LinkedList<Appt> appts=new LinkedList<Appt>();
		 TimeTable timetable= new TimeTable();
		 int startHour=2;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int j =startMinute+startHour+startDay+startMonth+startYear;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appts=null;
		 assertNull(timetable.deleteAppt(appts,appt));
		 assertTrue(appt.getValid());
		// appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 //appts.add(new Appt(3,3,3,4,2019,"do you qweknow da way","brqweuddah"));
		 //assertEquals(appts,timetable.deleteAppt(appts,appt));
		 assertNull(timetable.deleteAppt(appts,appt));
}
@Test
	  public void test07()  throws Throwable  {
		 LinkedList<Appt> appts=new LinkedList<Appt>();
		 TimeTable timetable= new TimeTable();
		 int startHour=2;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int j =startMinute+startHour+startDay+startMonth+startYear;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt=null;
		 assertNull(timetable.deleteAppt(appts,appt));
		 //assertTrue(appt.getValid());
		 appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 appts.add(new Appt(3,3,3,4,2019,"do you qweknow da way","brqweuddah"));
		 //assertEquals(appts,timetable.deleteAppt(appts,appt));
		 //assertNull(timetable.deleteAppt(appts,appt));
}
@Test
	  public void test08()  throws Throwable  {
		 LinkedList<Appt> appts=new LinkedList<Appt>();
		 TimeTable timetable= new TimeTable();
		 appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 appts.add(new Appt(3,3,3,4,2019,"do you qweknow da way","brqweuddah"));
		 LinkedList<Appt> appts2=new LinkedList<Appt>();
		 appts2.add(new Appt(3,3,3,4,2019,"do you qweknow da way","brqweuddah"));	
		 appts2.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 //assertNull(timetable.deleteAppt(appts,appt));
		 int [] array ={1,0};
		 //assertNull(timetable.permute(appts,array));
		 //assertTrue(appt.getValid());
		 //assertEquals(appts,timetable.deleteAppt(appts,appt));
		 //assertNull(timetable.deleteAppt(appts,appt));
}
 @Test
	  public void test09()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 appts.add(appt4);

		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 		 appts.add(appt);

		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 		 appts.add(appt2);

		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	int[] array={0,1};
		 	appt.setRecurrence(array,2,3,4);
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	assertNotNull(get_app_range.getApptRange(appts,greg1,greg2));
		 	assertEquals(appts,get_app_range.deleteAppt(appts,appt));
		 	assertEquals(appts,get_app_range.permute(appts,array));
	 }
	 @Test
	  public void test10()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 appts.add(appt4);

		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 		 appts.add(appt);

		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 		 appts.add(appt2);

		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	int[] array={0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 	appt.setRecurrence(array,1,1,40);
		 	assertEquals(40,appt.getRecurNumber());
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	assertNotNull(get_app_range.getApptRange(appts,greg1,greg2));
		 	//assertNull(get_app_range.deleteAppt(appts,appt2));
		 	//assertNull(get_app_range.permute(appts,array));
}
@Test
	  public void test11()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 appts.add(appt4);

		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 		 appts.add(appt);

		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 		 appts.add(appt2);

		 int d1=13;
		 int d2=14;
		 int month1=2;
		 int month2=2;
		 int yr1=2018;
		 int yr2=2018;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	int[] array={0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 	appt.setRecurrence(array,1,1,40);
		 	assertEquals(40,appt.getRecurNumber());
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	assertNotNull(get_app_range.getApptRange(appts,greg1,greg2));
		 	//assertNull(get_app_range.deleteAppt(appts,appt2));
		 	//assertNull(get_app_range.permute(appts,array));
}
@Test
	  public void test12()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	//appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 appts.add(appt4);

		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 		 appts.add(appt);

		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 		 appts.add(appt2);

		 int d1=13;
		 int d2=14;
		 int month1=2;
		 int month2=2;
		 int yr1=2018;
		 int yr2=2018;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	int[] array={0,1,2,3,4,5,6,7,8,9,10};
		 	appt.setRecurrence(array,12,12,40);
		 	assertEquals(40,appt.getRecurNumber());
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	assertNotNull(get_app_range.getApptRange(appts,greg1,greg2));
		 	//assertNull(get_app_range.deleteAppt(appts,appt2));
		 	//assertNull(get_app_range.permute(appts,array));
}
}