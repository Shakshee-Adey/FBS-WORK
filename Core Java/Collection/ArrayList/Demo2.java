package arrayList;

import java.util.ArrayList;

public class Demo2 {
      
	
	public static void main(String args[])
	{
		ArrayList a1 = new ArrayList();
		a1.add("java");                   //add function 
		a1.add("python");
		a1.add("c++");
       
        System.out.println(a1) ;
        
        System.out.println(a1.contains("java"));   //contains function  //true
        System.out.println(a1.contains("sql"));  //false
        
        
        String newname ="oops";
        if(a1.contains(newname))
        {
        	System.out.println("newname exits");
        }
        else
        {
        	System.out.println("new user Added");
        }
        
        System.out.println(a1);
}
}