package exceptionsprograms.java;

public class Try_And_Catch_Program 
{
    /* public static void main(String[] args) 
    {
		
    	try {
    		int a=1/0;
    	}
    	catch(ArithmeticException a1)
    	{
    		System.out.println("handled the exception");
	    }
    } */
    
    public static void main(String[] args) 
    {
		
    	try {
    		int a=1/1;
    		System.out.println(a);
    	}
    	catch(ArithmeticException a1)
    	{
    		System.out.println("handled the exception");
	    }
    }
}

