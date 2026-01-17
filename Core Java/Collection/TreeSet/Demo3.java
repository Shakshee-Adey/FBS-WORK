package Treeset;

import java.util.TreeSet;

public class Demo3 {

		
		public static void main(String args[])
		{
			//TreeSet t1 = new TreeSet (); //classCastException it will not convert to integer to string
			TreeSet<Integer> t1 = new TreeSet<Integer>();
			t1.add(10);
			t1.add("Firstbit");          //compiler error
			t1.add(30);
	        
	        
	        System.out.println(t1);
}
}