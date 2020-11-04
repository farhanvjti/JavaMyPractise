//Develop methods to perform
// addition, subtraction, multiplication and division
// You must read values from your method caller.
// With the method caller passed values you must execute your method logic.

// In add method display result
// In sub method return result
// In mul method accept only positive values and display result.
// In div method accept second value as only non-zero number and return its result.


class Calculator
{
	public void add(double firstNum, double secondNum){
		double result = 0;
		result = firstNum + secondNum;
		System.out.println(result);
	}
	public double sub (double firstNum, double secondNum){
		if (firstNum>secondNum)
			return firstNum-secondNum;

		return secondNum-firstNum;
	}
	public void mul(double firstNum, double secondNum) 
		                         throws IllegalArgumentException{
	   if (firstNum==0 || secondNum==0)
	      throw new IllegalArgumentException("Multiplication by Zero, ans=0");
	   System.out.println("Multiplication Ans =" + (firstNum*secondNum));
	}
	public double div(double firstNum, double secondNum) 
		                           throws IllegalArgumentException{
	   if (secondNum==0)
	      throw new IllegalArgumentException("Division by Zero, ans=Not Defined");
	   else
		   return firstNum/secondNum;
	}
}

