package newFun;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
	
	public static void main(String args[])
	{
		ArrayList<Emp> e1 = new ArrayList<Emp>();
		e1.add(new Emp(111,"Shakshii",20000));
		e1.add(new Emp(182,"Virat",10000));
		e1.add(new Emp(102,"pravhi",5000));
		e1.add(new Emp(57,"Rajul",25000));
		
		System.out.println("after" +e1);
		MyNameComparator ms = new MyNameComparator();
		Collections.sort(e1,ms);
		System.out.println("befor" + e1);
		
		
		MySalaryComparator s = new MySalaryComparator();
		Collections.sort(e1,s);

		
		
		IdComparator id = new IdComparator();
		Collections.sort(e1,id);
		
	}

}
