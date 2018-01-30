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
	  public void test02()  throws Throwable  {
			LinkedList<Appt> appts=new LinkedList<Appt>();
		 	appts.add(new Appt(3,4,5,6,7,"sasdfup","basdfruh"));
		 	GregorianCalendar greg1=new GregorianCalendar();
		 	GregorianCalendar greg2=new GregorianCalendar();
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);	 
	 }

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
		 	get_app_range.getApptRange(appts,greg2,greg1);
	 }
	  @Test
	  public void test04()  throws Throwable  {
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		 	appts.add(new Appt(3,3,3,4,2019,"you are not da queen","i spit on you"));
		 	
	     int startHour1=21;
		 int startMinute1=30;
		 int startDay1=15;
		 int startMonth1=01;
		 int startYear1=2018;
		 String title1="Birthday Party";
		 String description1="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour1,
		          startMinute1 ,
		          startDay1 ,
		          startMonth1 ,
		          startYear1 ,
		          title1,
		         description1);
		 int startHour2=12;
		 int startMinute2=23;
		 int startDay2=12;
		 int startMonth2=2;
		 int startYear2=2019;
		 String title2="Birthday ;hkjasfd";
		 String description2="This is asxdf birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
		 appts.add(new Appt(startHour1,startMinute1,startDay1,startMonth1,startYear1,title1,description1));
		 appts.add(new Appt(startHour2,startMinute2,startDay2,startMonth2,startYear2,title2,description2));
		 int d1=13;
		 int d2=14;
		 int month1=2;
		 int month2=2;
		 int yr1=2018;
		 int yr2=2018;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
		 	
		 	TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg2,greg1);
		 	get_app_range.deleteAppt(appts,appt1);
		 	assertNull(get_app_range.deleteAppt(appts,appt1));
		 	int [] array ={1,0};
			assertEquals(appts, get_app_range.permute(appts, array ));

	 }
	
}
