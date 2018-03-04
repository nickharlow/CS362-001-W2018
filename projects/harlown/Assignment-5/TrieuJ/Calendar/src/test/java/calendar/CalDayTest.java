package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		int day,month,year;
		GregorianCalendar greg=new GregorianCalendar();
		//GregorianCalendar.DAY_OF_MONTH=10;
	 	CalDay calday = new CalDay(greg);
	 	//Appt appt = new Appt(startHour,
	 }

	 @Test
	  public void test02()  throws Throwable  {
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
		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
	 	CalDay calday = new CalDay(greg1);
	 	assertEquals(d1,calday.getDay());
	 	assertEquals(yr1,calday.getYear());
	 	assertEquals(month1,calday.getMonth());
	 	assertTrue(calday.isValid());
	 	assertNotNull(calday.iterator());
	 	LinkedList<Appt> appts=new LinkedList<Appt>();
		//appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		assertEquals(appts,calday.getAppts());
		assertEquals(0,calday.getSizeAppts());
		assertEquals(2,calday.getMonth());
		assertEquals(2018,calday.getYear());
		assertTrue(calday.isValid());
		//assertEquals("--+- 13/13/2018 ---\t",calday.toString());




	 	
	 	
	 }
	 @Test
	  public void test03()  throws Throwable  {
		int day,month,year;
		GregorianCalendar greg=new GregorianCalendar();
		//GregorianCalendar.DAY_OF_MONTH=10;
	 	CalDay calday = new CalDay(greg);
	 	assertEquals(true, calday.isValid());

	 	//Appt appt = new Appt(startHour,
	 }
@Test
	  public void test04()  throws Throwable  {
		int startHour=-1;
		 int startMinute=80;
		 int startDay=-15;
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
		 int d1=-1;
		 int d2=-2;
		 int month1=-12;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
	 	CalDay calday = new CalDay(greg1);
	 	assertEquals(30,calday.getDay());
	 	assertEquals(2016,calday.getYear());
	 	assertEquals(11,calday.getMonth());
	 	assertTrue(calday.isValid());
	 	assertNotNull(calday.iterator());
	 	LinkedList<Appt> appts=new LinkedList<Appt>();
	 	//appts=null;
	 	//LinkedList<Appt> appts2=new LinkedList<Appt>();
	 	//appts2=("");
		//.appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		//assertEquals(appts,calday.getAppts());
		assertEquals(0,calday.getSizeAppts());
		assertEquals(11,calday.getMonth());
		assertEquals(2016,calday.getYear());
		assertTrue(calday.isValid());
		//assertEquals("--+- 30/30/2016 ---\t",calday.toString());
	 }


@Test
	  public void test05()  throws Throwable  {
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
		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
	 	CalDay calday = new CalDay(greg1);
	 	calday.addAppt(appt);
	 	assertEquals(d1,calday.getDay());
	 	assertEquals(yr1,calday.getYear());
	 	assertEquals(month1,calday.getMonth());
	 	assertTrue(calday.isValid());
	 	assertNotNull(calday.iterator());
	 	LinkedList<Appt> appts=new LinkedList<Appt>();
		//.appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		assertNotNull(calday.getAppts());
		assertEquals(1,calday.getSizeAppts());
		assertEquals(2,calday.getMonth());
		assertEquals(2018,calday.getYear());
		assertTrue(calday.isValid());
		assertNotNull(calday.toString());




	 	
	 	
	 }
	 @Test
	  public void test06()  throws Throwable  {
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
		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 	GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 	GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
	 	CalDay calday = new CalDay(greg1);
	 	calday.addAppt(appt);
	 	calday.addAppt(appt2);
	 	//calday.addAppt(appt);

	 	assertEquals(d1,calday.getDay());
	 	assertEquals(yr1,calday.getYear());
	 	assertEquals(month1,calday.getMonth());
	 	assertTrue(calday.isValid());
	 	assertNotNull(calday.iterator());
	 	LinkedList<Appt> appts=new LinkedList<Appt>();
		//.appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		assertNotNull(calday.getAppts());
		assertEquals(2,calday.getSizeAppts());
		assertEquals(2,calday.getMonth());
		assertEquals(2018,calday.getYear());
		assertTrue(calday.isValid());
		assertNotNull(calday.toString());




	 	
	 	
	 }
	  @Test
	  public void test07()  throws Throwable  {
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
		 Appt appt2 = new Appt(startHour+1,
		          startMinute+1 ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear+1,
		          title,
		         description);
		 Appt appt4 = new Appt(startHour+2,
		          startMinute+2 ,
		          startDay+2 ,
		          startMonth+2 ,
		          startYear+2,
		          title,
		         description);
		 int d1=13;
		 int d2=2;
		 int month1=2;
		 int month2=7;
		 int yr1=2018;
		 int yr2=2019;
		 GregorianCalendar greg1=new GregorianCalendar(yr1,month1,d1);
		 GregorianCalendar greg2=new GregorianCalendar(yr2,month2,d2);
	 	CalDay calday = new CalDay(greg1);
	 	calday.addAppt(appt2);
	 	calday.addAppt(appt);
	 	calday.addAppt(appt4);
	 	//Appt appt3 = null;
	 	//calday.addAppt(appt);

	 // 	assertEquals(d1,calday.getDay());
	 // 	assertEquals(yr1,calday.getYear());
	 // 	assertEquals(month1,calday.getMonth());
	 // 	assertTrue(calday.isValid());
	 // 	assertNotNull(calday.iterator());
	 // 	LinkedList<Appt> appts=new LinkedList<Appt>();
		// //.appts.add(new Appt(2,2,2,2,2018,"do you know da way","bruddah"));
		// assertNotNull(calday.getAppts());
		// assertEquals(2,calday.getSizeAppts());
		// assertEquals(2,calday.getMonth());
		// assertEquals(2018,calday.getYear());
		// assertTrue(calday.isValid());
		// assertNotNull(calday.toString());




	 	
	 	
	 }
}