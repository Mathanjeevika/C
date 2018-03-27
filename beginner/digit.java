/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		n=s.nextInt();
		int temp=n;
		while(temp!=0){
			temp=temp/10;
			++i;
		}
		System.out.println("The No of Digit Is"+i);
	}
}