package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


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
		GregorianCalendar greg=new GregorianCalendar();
		//GregorianCalendar.DAY_OF_MONTH=10;
	 	CalDay calday = new CalDay(greg);
	 	
	 }
	 @Test
	  public void test03()  throws Throwable  {
		int day,month,year;
		GregorianCalendar greg=new GregorianCalendar();
		//GregorianCalendar.DAY_OF_MONTH=10;
	 	CalDay calday = new CalDay(greg);
	 	assertEquals(false, calday.isValid());


	 	//Appt appt = new Appt(startHour,
	 }
@Test
	  public void test04()  throws Throwable  {
		int day,month,year;
		GregorianCalendar greg=new GregorianCalendar();
		//GregorianCalendar.DAY_OF_MONTH=10;
	 	CalDay calday = new CalDay(greg);
	 	//calday.toString();


	 	//Appt appt = new Appt(startHour,
	 }
}
