package com.wipro.practiceprograms;
import java.util.Scanner;
public class Leet 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if((a[j-1]+a[j])==target)
				{
					System.out.println(a[j-1]);
					System.out.println(a[j]);
				}
			}
		}
		
	}

}
