package Assignment;

public class InsufficientFeesException extends Exception {

	@Override
	public String toString() {
		return "atleast 30 fees paid";
	}

}
