package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 50 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			appt2.setStartHour(ValuesGenerator.RandInt(random));
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts.add(appt);
			appts.add(appt2);
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth+1,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);

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
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			appt2.setStartHour(ValuesGenerator.RandInt(random));
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts.add(appt);
			appts.add(appt2);
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear+1,startMonth+1,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg2,greg1);
		 	get_app_range.deleteAppt(appts,appt);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
@Test
	  public void radnomtest3()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			appt2.setStartHour(ValuesGenerator.RandInt(random));
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts.add(appt);
			appts.add(appt2);
			appts.add(appt2);
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);

 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest4()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
			appt2.setStartHour(ValuesGenerator.getRandomIntBetween(random, -12, 40));
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts.add(appt2);
			//calll deletel;khjnasdfl;jkasdfl;jkadfsljkadsflj
			//appts.add(null)
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	get_app_range.deleteAppt(appts,appt);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest5()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appt2=null;
			appts.add(appt2);
			//calll deletel;khjnasdfl;jkasdfl;jkadfsljkadsflj
			//appts.add(null)
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
		 	get_app_range.deleteAppt(appts,appt2);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest6()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts=null;
			//calll deletel;khjnasdfl;jkasdfl;jkadfsljkadsflj
			//appts.add(null)
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	//get_app_range.getApptRange(appts,greg1,greg2);
		 	get_app_range.deleteAppt(appts,appt);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest7()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
			startMonth=ValuesGenerator.getRandomIntBetween(random, 2, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			//Appt appt3 = new Appt();
			appt2=null;
			//calll deletel;khjnasdfl;jkasdfl;jkadfsljkadsflj
			//appts.add(null)
			GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(startYear,startMonth,startDay+1);
			TimeTable get_app_range= new TimeTable();
		 	//get_app_range.getApptRange(appts,greg1,greg2);
		 	get_app_range.deleteAppt(appts,appt2);
 	 	 	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}
	@Test
	  public void radnomtest8()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing asfdljkafsdljkadfsjl;kadfsklj;adfslkjafdskljfsadljkafsdlj;kafsdjl;k...");
/////////////////////////////////////////////////////////////////////
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
				 int startYear=2001;
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
			////appt.setStartHour(ValuesGenerator.RandInt(random));
			////startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
			Appt appt2 = new Appt(startHour,
				          startMinute ,
				          startDay+1,
				          startMonth ,
				          startYear ,
				          title,
				         description);

			Appt appt3 = new Appt(startHour,
				          startMinute ,
				          startDay+1,
				          startMonth+1,
				          startYear ,
				          title,
				         description);
			//appt2.setStartHour(ValuesGenerator.RandInt(random));
 	 	    LinkedList<Appt> appts=new LinkedList<Appt>();
			appts.add(appt);
			appts.add(appt2);
			appts.add(appt3);

			GregorianCalendar greg1=new GregorianCalendar(2000,1,1);
 	 	 	GregorianCalendar greg2=new GregorianCalendar(2100,2,2);
			TimeTable get_app_range= new TimeTable();
		 	get_app_range.getApptRange(appts,greg1,greg2);
 	 	 	elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 	 	 	 if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}catch(NullPointerException e){

	} 
		 
	 		
	System.out.println("Done testing...");


	
			}		
}
