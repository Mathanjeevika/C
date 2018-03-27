/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		n=s.nextInt();
		if(n>0){
			int res=(n*(n+1)/2);
			System.out.println("The Sum Of "+n+"Natural Number is"+res);
		}
		else{
			System.out.println("The Given Is Not a Natural Number");
		}
	}
}