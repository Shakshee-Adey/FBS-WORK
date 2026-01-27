package sbasic;

public class First1 {
    
	public static void main(String args[])
	{
		int length = 0;
        String str = "Adey";
		
        while (true) 
        {
		    try {
		        str.charAt(length);
		        length++;
		    } catch (StringIndexOutOfBoundsException e) {
		        break;
		    }
		}
         System.out.println("Length of string: " + length);

	}
}
