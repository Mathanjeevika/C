/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class oddeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		long i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		i=s.nextInt();
		if(i>0 && i<100000)
		{
			if((i%2)==0){
				System.out.println("The Number Is Even Number");
			}
			else{
				System.out.println("The Number Is Odd Number");
			}
		}
		else{
			if(i<0){
				System.out.println("The Number Is Negative Number");
			}
			else{
				System.out.println("The Number Is greater Than 10000");
			}
		}
	}
}