package Assignment;

public class UnderAgeException extends Exception {

	@Override
	public String toString() {
		return "age must be 17 or above";
	}
  
}
