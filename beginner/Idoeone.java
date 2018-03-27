/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Character");
		i=s.next();
		switch(i){
			case "a":System.out.println("The Character is Vowel");
					 break;
			case "e":System.out.println("The Character is Vowel");
					 break;
			case "i":System.out.println("The Character is Vowel");
					 break;
			case "o":System.out.println("The Character is Vowel");
					 break;
			case "u":System.out.println("The Character is Vowel");
					 break;
			default:System.out.println("The Character is Not Vowel");
					 break;
		}
	}
}