/* package whatever; // don"t place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,K;
		int Sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number(Array Size)");
		N=s.nextInt();
		System.out.println("Enter The Number(sum of values)");
		K=s.nextInt();
		int a[]=new int[N];
		System.out.println("Enter The "+N+"Values");
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<N;i++){
			System.out.print(" "+a[i]);
		}
		for(int j=0;j<K;j++){
			Sum=Sum+a[j];
		}
		System.out.println("The Sum Of  "+K+"Values In Array Is"+Sum);
	}
}