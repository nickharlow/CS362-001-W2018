package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		
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
	// assertions 
		 assertTrue(appt.getValid());
		 assertEquals(2, appt.getStartHour());
		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals(title, appt.getTitle());
		 assertEquals(description, appt.getDescription());         		
		 assertNotNull(appt.toString());
		 assertEquals(0,appt.compareTo(appt));	 
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
		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
	// assertions 
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());   
		 assertEquals(0,appt.compareTo(appt));	 

		 int[] recur={2,3,4};
		 appt.setRecurrence(recur, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
		 
		 assertEquals( 1000 , appt.getRecurNumber());
		 assertEquals(1, appt.getRecurBy());
		 assertEquals(recur, appt.getRecurDays());
		 assertTrue(appt.isRecurring());
		 assertEquals(2, appt.getRecurIncrement());
		 appt.setRecurrence( null, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
		 //assertEquals(0, appt.getRecurDays());
		      		
	 	
	 }
	 @Test
	  public void test03()  throws Throwable  {
		
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
		 appt.setStartHour(12);
		 appt.setStartMinute(13);
		 appt.setStartDay(14);
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());   

		 int hr = 1;//create vals
		 int min = 4;
		 int dy = 12;
		 int month = 11;
		 int yr = 2091;
		 String blah ="are you da queen";
		 appt.setStartHour(hr);//set vals
		 appt.setStartMinute(min);
		 appt.setStartDay(dy);
		 appt.setStartMonth(month);
		 appt.setStartYear(yr);
		 appt.setTitle(blah);
		 appt.setDescription(blah);		 
		 assertEquals(hr,appt.getStartHour());//check vals
		 assertEquals(min, appt.getStartMinute());
		 assertEquals(dy, appt.getStartDay());
		 assertEquals(month, appt.getStartMonth());
		 assertEquals(yr, appt.getStartYear());
		 assertEquals(blah, appt.getTitle());
		 assertEquals(blah, appt.getDescription());
  		 assertEquals(0,appt.compareTo(appt));	 
    		
	 	
	 }
	  
	@Test
	  public void test04()  throws Throwable  {
		
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
		int[] data = {2,3};
		appt.setRecurrence(data,startMonth,startMinute,startDay);
		assertEquals(15, appt.getRecurNumber());
		assertEquals(01, appt.getRecurBy());
		assertEquals(30,appt.getRecurIncrement());
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
		int[] data = null;
		// appt.setRecurrence(data,startMonth,startMinute,startDay);
		// assertEquals(15, appt.getRecurNumber());
		// assertEquals(01, appt.getRecurBy());
		// assertEquals(30,appt.getRecurIncrement());
		appt.setTitle(null);//reset val to null

		appt.setDescription(null);
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());
		 
		 assertTrue(appt.getValid());
		  appt.setStartHour(12);
		  assertTrue(appt.getValid());
		  appt.setStartMinute(12);
		 assertTrue(appt.getValid());
		 appt.setStartDay(444);
		  assertFalse(appt.getValid());
		  //appt.setStartMonth(-1);
		  //assertTrue(appt.getValid());
		 appt.setStartYear(44444);
		  assertFalse(appt.getValid()); 
		}
	@Test
	  public void test06()  throws Throwable  {
		
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt.setStartHour(12);
		 appt.setStartMinute(13);
		 appt.setStartDay(14);
		 appt.setStartYear(2222);
		 appt.setStartMonth(2);
		appt.setTitle(title);
		assertEquals(13,appt.getStartMinute());
		assertEquals(12,appt.getStartHour());
		assertEquals(14,appt.getStartDay());
		assertEquals(2,appt.getStartMonth());
		assertEquals(2222,appt.getStartYear());


		//assertNull(appt.getStartMinute());
	}

	@Test
	  public void test07()  throws Throwable  {
		
		 int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		int startMonth=1;
		 int startYear=1;
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
		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
	// assertions 
		 assertEquals(startHour,appt.getStartHour());
		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());   

		 int[] recur={2,3,4};
		 appt.setRecurrence(recur, 4, 5, 6);
		 
		 assertEquals(recur,appt.getRecurDays());
		 assertEquals( 6 , appt.getRecurNumber());
		 assertEquals(4, appt.getRecurBy());
		 assertTrue(appt.isRecurring());
		 assertEquals(5, appt.getRecurIncrement());
		 //appt.setRecurrence( null, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
		 //assertEquals(0, appt.getRecurDays());
		      		
	 	
	 }
	 @Test
	  public void test08()  throws Throwable  {
		
		int i=0;
		for (i=1; i<10000;i++) {
		 int startHour=(i%60);
		 int startMinute=(i%60);
		 int startDay=(i%28)+1;
		 int startMonth=(i%12)+1;
		 int startYear=i;
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
	// assertions 
		 //assertTrue(appt.getValid());
		 appt.setStartHour(startHour);
		 assertEquals(startHour, appt.getStartHour());
		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals(title, appt.getTitle());
		 assertEquals(description, appt.getDescription());         		
	 }
	}
	 @Test
	  public void test09()  throws Throwable  {
		
		 int startHour=-2;
		 int startMinute=-3;
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
	// assertions 
		 assertFalse(appt.getValid());

		 assertEquals(startMinute, appt.getStartMinute());
		 assertEquals(startDay, appt.getStartDay());
		 assertEquals(startMonth, appt.getStartMonth());
		 assertEquals(startYear, appt.getStartYear());
		 assertEquals(title, appt.getTitle());
		 assertEquals(description, appt.getDescription());         		
		 assertEquals(null,appt.toString());

	 }
}
//getRecurBy, recur increment, recur num