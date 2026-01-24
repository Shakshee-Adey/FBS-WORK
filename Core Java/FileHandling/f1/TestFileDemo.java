package file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestFileDemo {
      
	public static void main(String[]args)
	{
		try {
		FileOutputStream fos = new FileOutputStream("MyData.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(dos);
		
		oos.writeObject(new Employee(101,"shakshee",50000));
		
		System.out.println("Written successfull");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
