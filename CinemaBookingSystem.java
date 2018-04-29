/**
* Class that contains the start method.
* @version 4.18.2018
* @author Tavis Baylor, Zach Ventola, Ryan Rice, Zain Shahabuddin, Nick DiGiovanni
*/
import java.util.Scanner;
public class CinemaBookingSystem 
{
	Theater theater1 = new Theater("Broadway Theatre", "PitMan NJ",247);
	Theater theater2 = new Theater("AMC Classic", "Auburn NJ",864);
	Show show1 = new Show("1:00PM",7,8,2018,"Mulan",101);
	int theaterNum = 0;
	
	public CinemaBookingSystem() 
	{
		theater1.addShow(show1);
	}
	/*
	* Method responsible for displaying Theaters, Shows, and taking user input.
	*/
	Scanner scan = new Scanner(System.in);
	public void start()
	{
    boolean active = true;
    
    	System.out.println("\t THEATERS NEAR YOU:");
    	System.out.println("========================================");
    	theater1.printTheaterDetails();
    	theater2.printTheaterDetails();
    	System.out.println("Enter the ID of the theater you want to book:");
    	int firstScan = scan.nextInt();
    	System.out.println("Here are the shows avalable:");
    	System.out.println("========================================");
    	
    	if(firstScan==247)
    	{
    		theater1.printShows();
    		theaterNum=1;
    	}
    	if(firstScan==864)
    	{
    		theater2.printShows();
    		theaterNum=2;
    	}
    	System.out.println("Enter the ID of the show you are looking for:");
    	int secondScan = scan.nextInt();
    	System.out.println("Enter your phone number to reserve a seat:");
    	Long thirdScan = scan.nextLong();
    	
    while(active){
    	switch (theaterNum)
    	{
    	case 1:
    		if(secondScan==101)
    		{
    		System.out.println("Here are the seats avalable:");
    	    System.out.println("========================================");	
    	    theater1.printSeatDetails(1);
    		}
    		break;
    	case 2:
    		
    		break;
    	}
    	
    	System.out.println("Enter the row letter followed by the seat number you wish to reserve:");
    	String fourthScan = scan.next();
    	
    	String rowChoice = fourthScan.substring(0, 1);
    	String seatChoice = fourthScan.substring(1, fourthScan.length());
    	switch (theaterNum)
    	{
    	case 1:
    		if(secondScan==101)
    		{
    		theater1.reserveSeat(1,rowChoice,seatChoice,thirdScan);
    		}
    		break;
    	case 2:
    		
    		break;
    	}
    	
    	System.out.println("Would you like to reserve another seat?: ENTER Y/N");
    	String fifthScan = scan.next();
    	if(fifthScan.equals("Y"))
    	{
    	active = true;
    	}
    	else
    	{
    	active = false;
    	System.out.println("Goodbye");
    	}
    }
    scan.close();
	//display shows
	}
