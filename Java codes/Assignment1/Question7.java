package Assignment1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basics=6000;
		double da,ta,hra,totalsal;
		
		if(basics<=5000)
		{
			da=basics*0.10;
			ta=basics*0.20;
			hra=basics*0.25;
			System.out.printf("da=%f ta=%f hra=%f",da , ta, hra);
		}
		else
		{
			da=basics*0.15;
			ta=basics*0.25;
			hra=basics*0.30;
			System.out.printf("da=%f ta=%f hra=%f\n",da,ta,hra);
		}
		totalsal=da+ta+hra+basics;
		System.out.printf("total salary is %f",totalsal);
	}

}
