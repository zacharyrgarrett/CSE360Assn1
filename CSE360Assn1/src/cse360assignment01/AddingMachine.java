package cse360assignment01;

/**
 * @author Zachary Garrett
 * file: AddingMachine.java
 * created: 10/4/2020
 */
public class AddingMachine {
	  private int total;
	  private String history = "0";
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  //Return total
	  public int getTotal () {
	    return total;
	  }
	  
	  //Add parameter 'value' to total
	  public void add (int value) {
		  total = total + value;
		  history = history + " + " + value;
	  }
	
	  //Subtract parameter 'value' from total
	  public void subtract (int value) {
		  total = total - value;
		  history = history + " - " + value;
	  }
	
	  //Return the history of operations
	  public String toString () {
	    return history;
	  }
	
	  //Clear operation history
	  public void clear() {
		  history = "0";
	  }
}
