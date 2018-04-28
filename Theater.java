/**
* Class that defines a theater object
* @version 4.18.2018
* @author
*/
public class Theater 
{
 
  private String theaterName;
  private ArrayList<Show> shows;
	
	/**
	* Constructor for theater class
	* @param theaterName
	*/
	public Theater(String theaterName) 
	{
           this.theaterName = theaterName;
	}
	
	/**
	* Accessor method that gets theater name
	* @return theaterName
	*/
	public String getTheaterName(){
		return theaterName;
	}
	
	/**
	* Method that adds a show to shows array
	* @param show
	*/
	public void addShow(Show show){
		shows.add(show);
	}
	
	/**
	* Print method that prints theater name and all the shows and show times at said instance
	*/
	public void printTheaterDetails(){
		for(Show show: shows){
		  System.out.println(show.getInfo());
		}
	}

}
