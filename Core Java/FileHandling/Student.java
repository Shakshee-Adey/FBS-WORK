package f2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable  {
	
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
class Test
{
	public static void main(String args[])
	{
		try {
			FileOutputStream fos = new FileOutputStream("MyData.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			
			oos.writeObject(new Student(101,"shakshee"));
			
			System.out.println("Written successfull");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}
class ReadDemo {

	public static void main1(String[]args)
	{
		try {
		FileInputStream fis = new FileInputStream("MyData.txt");
		DataInputStream dis = new DataInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(dis);
		
		Student e1 =(Student)ois.readObject() ;
		
		System.out.println(e1);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
