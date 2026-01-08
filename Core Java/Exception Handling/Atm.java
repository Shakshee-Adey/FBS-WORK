package p4;

public class Atm {

	    public static void main(String[] args) {

	        int balance = 5000;   // ATM me available balance

	        try {
	            // User input (command-line)
	            int withdrawAmount = Integer.parseInt(args[0]);

	           if (withdrawAmount <= 0) {
	             throw new IllegalArgumentException("Invalid amount");
	             
	           }

	           if (withdrawAmount > balance) {
	                throw new ArithmeticException("Insufficient balance");
	           }

	            balance = balance - withdrawAmount;
	            System.out.println("please take your cash: " + withdrawAmount);
	            System.out.println("Remaining balance: " + balance);
	        }
	        catch (NumberFormatException e) {
	            System.out.println("Please enter numbers only");
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Insufficient balance");
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("Enter a valid withdrawal amount");
	        }
	        catch (Exception e) {
	            System.out.println("Something went wrong");
	        }
	        finally {
	            System.out.println("Please Take your ATM card");
	        }
	    }
	}