class BankAccount 
{
	private double balance;

    BankAccount(double balance){
        this.balance = balance;
    } 
	public void deposit(double amt) throws IllegalArgumentException{
	      if (amt<0)
		  {
               throw new IllegalArgumentException("Negative number is not allowed");
		  }
		  balance = balance + amt;
	}
    public double withdraw (double amt) throws IllegalArgumentException{
	    if (amt<0)
               throw new IllegalArgumentException("Negative number is not allowed");
		  if (amt > balance)
		       throw new IllegalArgumentException("Insufficient funds");
          balance = balance - amt;
		  return amt;
	}
  	public void currentBalance(){
	      System.out.println("Current Available Balance = " + balance);
	}
}