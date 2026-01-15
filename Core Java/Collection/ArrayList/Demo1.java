package arrayList;

import java.util.ArrayList;

public class Demo1 {
         
	public static void main(String args[])
	{
		ArrayList a1 = new ArrayList();
		a1.add(10);                   //add function 
		a1.add(20);
		a1.add(30);
        a1.add(40);
       
        System.out.println(a1) ;
        
        
        //remove function 
        
        a1.remove(Integer.valueOf(20));     //remove by object
        System.out.println(a1) ;
     
        // a1.remove(2);       //remove by index
        // System.out.println(a1) ;
        
        
        // contains function
        
        if(a1.contains(a1.contains(30)))
        {
        	System.out.println("Found");
        }
        else
        {
        	System.out.println("Not Found");
        }
   }
}
