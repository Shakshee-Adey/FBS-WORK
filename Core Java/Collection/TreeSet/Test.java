package Treeset;

import java.util.TreeSet;

public class Test {

	
	public static void main(String args[])
	{
		TreeSet t1 = new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(30);
        t1.add(40);
        
        System.out.println(t1);   //10,20,30,40
        
        
        t1.remove(30);   //10,20,40
        
        System.out.println(t1);
     
}
}