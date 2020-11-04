class SurgeCalculator 
{
	static void surge(double number) 
		                  throws IllegalArgumentException{
		double surgeValue = 0.20;
		if (number < 0)
			throw new IllegalArgumentException("Entered number must be non-zero positive number");
		
		double discountedNum = number*surgeValue;
		System.out.println("Original Number=" +number);
		System.out.println("Discounted Value=" + (number*surgeValue));
		System.out.println("Amount after surge="+(number+number*surgeValue));
	}
}
