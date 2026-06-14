 
// Count the Number of Vowels in a String.

package sbasic;

public class Vowel {
	public static void main(String args[])
	{
		String str = "I am a Software eng.";
		int count=0;
		
		for (int i = 0; i < str.length(); i++)
		{
		char s = str.charAt(i);
		if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') 
		{
			count++;
		}
		}
		System.out.println(count);
	}

}
