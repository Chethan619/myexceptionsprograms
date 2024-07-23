package exceptionsprograms.java;

public class ThreadProgram {

	public static void main(String[] args) throws InterruptedException, NullPointerException
	{
         System.out.println("Manish");
         Thread.sleep(10000);
         System.out.println("Student");
         throw new NullPointerException("sorry the cell is empty");
	}
       
	/* public static void main(String[] args) throws InterruptedException,  NullPointerException, IllegalArgumentException
	{
         System.out.println("Manish");
         Thread.sleep(-3000);  //passing negative value
         System.out.println("Student");
         throw new NullPointerException("sorry the cell is empty");
	} */
}
