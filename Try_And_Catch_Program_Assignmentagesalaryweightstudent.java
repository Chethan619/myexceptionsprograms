package exceptionsprograms.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_And_Catch_Program_Assignmentagesalaryweightstudent 
{
	public static void main(String[] args) 
    {
		Scanner s1=new Scanner(System.in);
		try {
		System.out.println("Enter the valid age");
		int age=s1.nextInt();
		System.out.println("Mentioned age is -> " +age);
		
		System.out.println("Enter the salary");
		double salary=s1.nextDouble();
		System.out.println("Mentioned salary is -> " +salary);
		
		System.out.println("Enter the weight");
		float weight=s1.nextFloat();
		System.out.println("Mentioned weight is -> " +weight);
		
		System.out.println("Are you a student true or false");
		boolean are_you_student=s1.nextBoolean();
		System.out.println("Mentioned statement is -> " +are_you_student);
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Hey please enter the valid inputs");
			System.out.println("Enter the valid age");
			Scanner s2=new Scanner(System.in);
			int age=s2.nextInt();
			System.out.println("Mentioned age is -> " +age);
			
			System.out.println("Enter the salary");
			Scanner s3=new Scanner(System.in);
			double salary=s3.nextDouble();
			System.out.println("Mentioned salary is -> " +salary);
			
			System.out.println("Enter the weight");
			Scanner s4=new Scanner(System.in);
			float weight=s4.nextFloat();
			System.out.println("Mentioned weight is -> " +weight);
			
			System.out.println("Are you a student true or false");
			Scanner s5=new Scanner(System.in);
			boolean are_you_student=s5.nextBoolean();
			System.out.println("Mentioned statement is -> " +are_you_student);
	}
    }
}

