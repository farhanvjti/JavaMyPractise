class TestBankSM_NSM {
  public static void main(String[] args) {

	BankAccount_SM_NSM b1 = new BankAccount_SM_NSM();
	BankAccount_SM_NSM b2 = new BankAccount_SM_NSM();
	System.out.println("\n--------Pass Book Printing Customer 1---------");
	b1.display();

    System.out.println("\n--------Pass Book Printing Customer 2---------");
	b2.display();

	
    BankAccount_SM_NSM.setBankDetails
                            ("ICICI","FORT","ICIC0000192");
   System.out.println("\n--------Pass Book Printing Customer 1---------");
	b1.display();

    System.out.println("\n--------Pass Book Printing Customer 2---------");
	b2.display();

    b1.setAccountDetails(50100023,"HK",26000.850);
    b2.setAccountDetails(50200525,"BK",50000.850);
	System.out.println("\n--------Pass Book Printing Customer 1---------");
	b1.display();

    System.out.println("\n--------Pass Book Printing Customer 2---------");
	b2.display();

    System.out.println("Getting Bank Details");
	BankAccount_SM_NSM.getBankName();
	BankAccount_SM_NSM.getBranchName();
	BankAccount_SM_NSM.getIfsc();
   
    System.out.println("Customer HK wants to perform Deposit functionality");
	System.out.printf("\nDepoist Amount= %.2f",1000.10);
    System.out.printf("\nBal. = %.2f",b1.checkBalance());
    b1.deposit(1000.10);
    System.out.printf("\nBal. = %.2f",b1.checkBalance());
    b1.withdrawl(10);
    System.out.printf("\nBal. = %.2f",b1.checkBalance());

    System.out.println("\n--------Pass Book Printing Customer 1---------");
	b1.display();

    System.out.println("\n--------Pass Book Printing Customer 2---------");
	b2.display();
    
  }
}