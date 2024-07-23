package exceptionsprograms.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_And_Catch_ProgramJune12finally 
{
	public static void main(String[] args) 
    {
		Scanner s1=new Scanner(System.in);
		try {
		System.out.println("Enter the valid age");
		int age=s1.nextInt();
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Hey the age must be a valid numeric value, please enter again");
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the valid age");
			int age=s2.nextInt();
		}
		finally
		{
		System.out.println("No matter what i will be always there");
		System.out.println("Please enter your name");
		Scanner s3=new Scanner(System.in);
		String name=s3.next();
		}
	}
}
