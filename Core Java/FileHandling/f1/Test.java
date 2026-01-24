package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String args[])
	{
		File f1 = new File("demo.txt");
		
		try {
			System.out.println(f1.createNewFile());
			FileWriter fw1 = new FileWriter(f1,true);
			fw1.write("Hello shakshee!!");
			fw1.close();
			System.out.println("Written succesfull");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
