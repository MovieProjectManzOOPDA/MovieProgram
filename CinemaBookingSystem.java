/**
* Class that contains the start method.
* @version 4.18.2018
* @author Tavis Baylor, Zach Ventola, Ryan Rice, Zain Shahabuddin, Nick DiGiovanni
*/
import java.util.Scanner;
public class CinemaBookingSystem 
{
	Theater theater1 = new Theater("theater1");
	Theater theater2 = new Theater("theater2");
	Show show1 = new Show(100,7,8,2018,"Mulan");
	
	public CinemaBookingSystem() 
	{
		theater1.addShow(show1);
	}
	/*
	* Method responsible for displaying Theaters, Shows, and taking user input.
	*/
	public void start()
	{
	Scanner scan = new Scanner(System.in);
    boolean active = true;
    while(active){
    	theater1.printTheaterDetails();
    	theater2.printTheaterDetails();
    	System.out.println("What theatre are you looking for?");
    	String theater = scan.next();
    	System.out.println("What show are you looking for?");
    	String show = scan.next();
    }

	//display shows
	}
}
