package com.wipro.practiceprograms;
import java.util.Scanner;
public class array3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=1;j<(n+1);j++)
		{
				System.out.println(a[n-j]);
		}
	}
}
