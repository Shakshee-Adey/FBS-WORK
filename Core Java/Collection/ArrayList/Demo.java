package arrayList;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String args[])
	{
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
        a1.add(40);
        
        System.out.println(a1);  //output = 10,20,30,40
        
        //System.out.println(a1.get(3));    //output= 40
        
       // System.out.println(a1.get(4));     // output=IndexOutOfBoundsException
	}

}
