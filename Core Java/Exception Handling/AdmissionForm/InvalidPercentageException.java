package Assignment;

public class InvalidPercentageException extends Exception {

	@Override
	public String toString() {
		return "percentage between 0 to 100";
	}
        
}
