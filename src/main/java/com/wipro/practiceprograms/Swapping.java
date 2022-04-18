package com.wipro.practiceprograms;
import java.util.Scanner;
public class Swapping 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("After swapping=");
		System.out.println(n1);
		System.out.println(n2);
	}
}