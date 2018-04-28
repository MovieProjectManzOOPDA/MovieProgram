
/**
 * Class that defines a customer object
 * @version 4.18.2018
 * @author Ryan Rice
 */
public class Customer {
	
	private String name;
	private long phoneNumber;

		/**
		 * Constructor for customer class
		 * @param name
		 * @param phoneNumber
		 */
		public Customer(String name, long phoneNumber){
			
		}
		/**
		 * Constructor for customer class
		 */
		public Customer() {
			
		}
		
		/**
		 * Accessor method that gets name
		 * @return name
		 */
		public String getName(){
			return name;	
		}
		
		/**
		 * Mutator method that sets name
		 * @param name
		 */
		public void setName(String name){
			this.name = name;
		}
		
		/**
		 * Mutator method that sets phone number
		 * @param phoneNumber
		 */
		public void setNumber(long phoneNumber){
			this.phoneNumber = phoneNumber;
		}
		
		/**
		 * Accessor method that gets phone number
		 * @return phoneNumber
		 */
		public long getNumber() {
			return phoneNumber;	
		}
}
