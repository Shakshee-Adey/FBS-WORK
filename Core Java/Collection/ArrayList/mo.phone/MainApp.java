package arrayList;

import java.util.ArrayList;
import java.util.Collections;
public class MainApp {
	
	public static void main(String args[])
	{
		
		ArrayList<MobilePhone> phone = new ArrayList<MobilePhone>();
		
		phone.add(new MobilePhone("Samsung",18000f,4));
		phone.add(new MobilePhone("Redmi",11000f,2));
		phone.add(new MobilePhone("Samsung A11",24000f,6));
		phone.add(new MobilePhone("Poco m2",9000f,9));
		phone.add(new MobilePhone("iPhone 17",78000f,1));
		phone.add(new MobilePhone("Vivo",19000f,3));
		phone.add(new MobilePhone("opo",12000f,5));
		
		System.out.println(phone);  // ye simple print krega
		
		//System.out.println("\nSorting ArrayList by Rting of mobail phone");      //ye rating pr sort krega
		//Collections.sort(phone);
		//System.out.println(phone);
		
		//System.out.println("\nSorting ArrayList by Name of mobail phone");
		//NameCompare namecomp = new NameCompare();
		//Collections.sort(phone,namecomp);  //overloaded method h 
		//System.out.println(phone);
		
		System.out.println("\nSorting ArrayList by Name of mobail phone");
		CostCompare costcomp = new CostCompare();
		Collections.sort(phone,costcomp);  //overloaded method h 
		System.out.println(phone);
		
	}

}
