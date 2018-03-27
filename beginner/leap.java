/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Year");
		n1=s.nextInt();
		if((n1%4)==0){
			System.out.println("The Year Is Leap Year");
		}
		else{
			System.out.println("The Year Is Not a Leap Year");
		}
	}
}