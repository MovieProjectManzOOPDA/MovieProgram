import java.util.*;
/**
* Class that defines a show object
* @version 4.18.2018
* @author Tavis Baylor, Zach Ventola, Ryan Rice, Zain Shahabuddin, Nick DiGiovanni
*/
public class Show 
{
	int time;
	
	int day;
	int month;
	int year;
	
	String showName;
	int capacity ;

	//One ArrayList for each Row.
	ArrayList<Long> RowA= new ArrayList<Long>();
	ArrayList<Long> RowB= new ArrayList<Long>();
	ArrayList<Long> RowC= new ArrayList<Long>();
	ArrayList<Long> RowD= new ArrayList<Long>();
	
	
	/**
	* Constructor for Show class
	* @param time
	* @param day
	* @param month
	* @param year
	* @param showName
	* @param capacity
	*/
	public Show(int time,int day,int month,int year,int showName,int capacity) 
	{
		// TODO Auto-generated constructor stub
	}

/**
* Method that fills Row ArrayLists with seat objects.
* @param given
*/
public void fillRow(ArrayList<Long> given)
{
	int index = 0;
	while(index<10)
	{
		given.add(new Long(0));
		index++;
	}
}
/**
* Method that prints time, date, and show name to user.
*/
public void getRowSeats(ArrayList given)
{
	int index = 0;
	while(index<10)
	{
		if(given.get(index).equals(0))
		{
			
		}
	}
}
public void getInfo()
{
	
}

}
