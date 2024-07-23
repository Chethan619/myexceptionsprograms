package exceptionsprograms.java;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Try_And_Catch_ProgramJune12 
{
    public static void main(String[] args) 
    {
		int rollno[]=new int[4];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		try{
			rollno[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Exceeded the size");
		}
		catch(NullPointerException a1)
		{
			System.out.println("handled the exception NPE");
		}
		catch(InputMismatchException a1)
		{
			System.out.println("handled the exception IME");
		}
		catch(IllegalFormatException a1)
		{
			System.out.println("handled the exception IFE");
		}
	}
}
