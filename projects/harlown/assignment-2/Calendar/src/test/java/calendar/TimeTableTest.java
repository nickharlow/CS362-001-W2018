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
		 	appts.add(new Appt(2,2,2,2,2,"do you know da way","bruddah"));
		 	GregorianCalendar greg1=new GregorianCalendar();
		 	GregorianCalendar greg2=new GregorianCalendar();
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
//add more unit tests as you needed
}
