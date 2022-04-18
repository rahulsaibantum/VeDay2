package com.wipro.practiceprograms;
import java.util.Scanner;
public class zipf1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int last=1;
		int temp;
		for(int i=1;i<=n;i++)
		{
			System.out.println(first);
			temp=first;
			first=last;
			last=first+temp;//1
			
		}
		
	}
}


// 0 1 1 2 3 5 8 