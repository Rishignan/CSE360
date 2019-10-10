
/**
 * Name : Rishi Avvaru
 * ASU id: 1213167408
 * Class: CSE360
 * project : 2
 * Description: This class  has methods which does addition , subtraction operations and it keeps the track of operations done so far.
 * 
 * 
 * */
package cse360assign2;

public class AddingMachine {

	private int total;

	// Storing string value
	private String stringValue = "0";

	public AddingMachine() {

		// value =0
		total = 0;
	}

	// this function return total
	public int getTotal() {

		return total;
	}

	// adds value total. and also adds string
	public void add(int value) {

		// va;ue = va;lue -1 ;

		total = total + value;

		stringValue = stringValue + "+" + value;
	}

	// This method subtracts value to total and also adding value to string.
	public void subtract(int value) {

		total = total - value;

		stringValue = stringValue + "-" + value;
	}

	// returns string
	public String toString() {

		return stringValue;
	}

	// clears the string
	public void clear() {

		stringValue = "0";

	}
}