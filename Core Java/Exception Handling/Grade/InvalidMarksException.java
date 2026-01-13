package p4;

import java.util.Arrays;

public class InvalidMarksException extends Exception {

	@Override
	public String toString() {
		return "Invalid Marks! Marks must be between 0 to 100";
	}
	
	

}
