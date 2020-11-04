import java.util.Scanner;
class TestSurgeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number whose 20% needs to be calculated");
		double number = scn.nextDouble();
		SurgeCalculator.surge(number);
	}
}
