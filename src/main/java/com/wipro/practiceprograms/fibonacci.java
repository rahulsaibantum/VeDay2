package com.wipro.practiceprograms;
import java.util.Scanner;
public class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		int l=1;
		int temp;
		for(int i=1;i<=n;i++)
		{
			System.out.print(f+" ");
			temp=f;
			f=l;
			l=f+temp;
		}
	}
}