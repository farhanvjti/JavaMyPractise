class TestCalculator{

	public static void main(String[] args){
    Calculator c = new Calculator();
	double a = 20;
	double b = 0;
	c.add(a,b);
	double sub_ans = c.sub(a,b);
	c.mul(a,b);
	double division_ans = c.div(a,b);

    System.out.println("Subtraction Ans =" + sub_ans);
    System.out.println("Divsion Ans =" + division_ans);
	}
}