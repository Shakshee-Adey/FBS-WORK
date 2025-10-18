package Assignment1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2004;
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.printf("year is leap");
		}
		else
		{
			System.out.printf("not leap year");
		}  
	}

}
