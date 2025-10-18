package Assignment1;

public class Question2 {
	public static void main(String[] args) {
	int n=125,r1,r2,r3,q1,rev;
	r1= n%10;
	q1= n/10;
	r2= q1%10;
	r3= q1/10;
	
	rev=r1*100+r2*10+r1;
	if(n == rev)
	{
		System.out.printf("is palindrome");
	}
	else
	{
		System.out.printf("not palindrome");
	}
}
}
