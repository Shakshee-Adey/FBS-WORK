package abstruct;

abstract class Payment {
	
	int paymentId;
	double amount;
	String payerName;
	String status;
	
	public Payment(int paymentId, double amount, String payerName, String status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = status;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void printSummary(){
		System.out.println("Payment Id   : " + paymentId);
	    System.out.println("Payer Name   : " + payerName);
	    System.out.println("Amount       : " + amount);
	    System.out.println("Status       : " + status);
	}
	
	final void process()
	{
		// Step 1: validation
	    if (!validate()) {
	        status = "FAILED";
	        System.out.println("Payment validation failed");
	        return;
	    }

	    // Step 2: deduct amount
	    deductAmount();

	    // Step 3: send notification
	    sendNotification();

	    // Step 4: success
	    status = "SUCCESS";
	}

	abstract void sendNotification();
    abstract void deductAmount();
	abstract boolean validate();
}
class CardPayment extends Payment {

    String cardNumber;
    String cvv;

    
    public CardPayment(int paymentId, double amount, String payerName, String status, String cardNumber, String cvv) {
		super(paymentId, amount, payerName, status);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
    
    

	public CardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
   



	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public String getCvv() {
		return cvv;
	}



	public void setCvv(String cvv) {
		this.cvv = cvv;
	}



	boolean validate()
    {
        if (cardNumber.length() == 16 && cvv.length() == 3 && getAmount() > 0) 
        {
            return true;
        }
        return false;
    }

    void deductAmount()
    {
        System.out.println("Amount deducted using Card");
    }

    void sendNotification() 
    {
        System.out.println("Card payment notification sent");
    }
}
class UPIPayment extends Payment {

    // Extra attribute
    private String upiId;



    public UPIPayment(int paymentId, double amount, String payerName, String status, String upiId) {
		super(paymentId, amount, payerName, status);
		this.upiId = upiId;
	}

    
	public String getUpiId() {
		return upiId;
	}


	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}


	// Validation rules
    @Override
    boolean validate() {

        if (upiId == null) {
            return false;
        }

        if (!upiId.contains("@")) {
            return false;
        }

        if (getAmount() < 1 || getAmount() > 100000) {
            return false;
        }

        return true;
    }

    // Deduct amount (just print)
    @Override
    void deductAmount() {
        System.out.println("Amount " + getAmount() + " deducted using UPI");
    }

    // Send notification (just print)
    @Override
    void sendNotification() {
        System.out.println("UPI payment notification sent to user");
    }
}
class TestPayment {
		    public static void main(String[] args) {

		      
		        Payment p1 = new CardPayment(101,2500,"Ravi","SUCCESS", "1234567812345678", "123");

		        Payment p2 = new UPIPayment(102,1500,"Anita","pending","anita@upi");

		        Payment p3 = new CardPayment(103,-500,"Suresh","failed", "1234567812345678","456");

		        // Call process and print summary
		        p1.process();
		        p1.printSummary();
		        System.out.println("------------------");

		        p2.process();
		        p2.printSummary();
		        System.out.println("------------------");

		        p3.process();
		        p3.printSummary();
		    }
		}
