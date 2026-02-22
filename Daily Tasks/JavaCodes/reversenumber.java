package javareversnumber;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=123456;
		int reverse=0;
		int temp;
		
		while(number!=0)
		{
			temp = number % 10;        // get last digit
            reverse = reverse * 10 + temp;
            number = number / 10; 
		}
		System.out.println("reverse number is : "+reverse);

	}

}
