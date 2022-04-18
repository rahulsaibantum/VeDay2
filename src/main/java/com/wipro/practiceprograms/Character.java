package com.wipro.practiceprograms;
import java.util.Scanner;
public class Character 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s=='A' ||s=='E'||s=='I'||s=='O'||s=='U' )
		{
			System.out.println("Vowel UpperCase");
		}
		else if(s=='a' || s=='e'||s=='i'||s=='o'||s=='u')
		{
			System.out.println("Vowel lowercase");
		}
		else
		{
			System.out.println("constant");
		}
	}

}
