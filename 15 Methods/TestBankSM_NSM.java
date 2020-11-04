class TestBankSM_NSM {
  public static void main(String[] args) {
    
    BankAccount_SM_NSM.setBankDetails
                            ("ICICI","FORT","ICIC0000192");

	BankAccount_SM_NSM b1 = new BankAccount_SM_NSM();
    b1.setAccountDetails(50100023,"HK",26000.850);

	BankAccount_SM_NSM.getBankName();
	BankAccount_SM_NSM.getBranchName();
	BankAccount_SM_NSM.getIfsc();
   
    System.out.printf("\nBal. = %.2f",b1.checkBalance());
    b1.deposit(1000.10);
    System.out.printf("\nBal. = %.2f",b1.checkBalance());

    b1.withdrawl(10);
    System.out.printf("\nBal. = %.2f",b1.checkBalance());

    System.out.println("\n--------Pass Book Printing---------");
	b1.display();
    
  }
}