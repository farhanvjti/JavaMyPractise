//To calculate even odd and to avoid exception thrown by scnanner class
import java.util.Scanner;
class TestEvenOdd 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		 int num;
		System.out.println("Enter Positive number to calculate even or odd");
		  if (scn.hasNextInt()) {
            num = scn.nextInt() ; 
			System.out.println("Entered Number is:"+EvenOdd.findEvenOrOdd(num));
            } else {
            System.out.println("Sorry, couldn't understand you!");
           }		
	}
}
