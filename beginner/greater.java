/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n1,n2,n3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number 1");
		n1=s.nextInt();
		System.out.println("Enter The Number 2");
		n2=s.nextInt();
		System.out.println("Enter The Number 3");
		n3=s.nextInt();
		if(n1>n2 && n1>n3){
			System.out.println("The Value"+n1+"is greater Value");
		}
		else if(n2>n1 && n2>n3){
			System.out.println("The Value"+n2+"is greater Value");
		}
		else{
			System.out.println("The Value"+n3+"is greater Value");
		}
	}
}