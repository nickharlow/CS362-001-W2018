package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 50 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing Calday...");
		 try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) 
			{
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
			 //if(!appt.getValid())continue;
			appt.setStartHour(ValuesGenerator.RandInt(random));

			 GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	 CalDay calday = new CalDay(greg1);
 	 	 	 LinkedList<Appt> appts=new LinkedList<Appt>();
			 appts.add(appt);
 	 	 	 calday.addAppt(appt);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest2()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing Calday...");
		 try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) 
			{
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
				 Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay+1 ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			 //if(!appt.getValid())continue;
			appt.setStartHour(ValuesGenerator.RandInt(random));

			 GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	 CalDay calday = new CalDay(greg1);
 	 	 	 LinkedList<Appt> appts=new LinkedList<Appt>();
			 appts.add(appt);
			 appts.add(appt2);
 	 	 	 calday.addAppt(appt);
 	 	 	 calday.addAppt(appt2);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
}

