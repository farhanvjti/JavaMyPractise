class BankAccount_SM_NSM 
{
	 static String bank;
     static String branch;
     static String ifsc;

     long   accNum;
     String accHolder;
     double accBalance;

	 static void setBankDetails(
                               String bankName,
                               String branchName,
                               String ifscCode){
      bank = bankName;
      branch = branchName;
      ifsc = ifscCode;
    }

    void setAccountDetails(long   accNum,
                           String accHolder, 
                           double balance){
      this.accNum     =  accNum;
      this.accHolder  =  accHolder;
      accBalance =  balance;
    }
	
	double checkBalance(){
      return accBalance;
    }

	void deposit(double payin){
      accBalance = accBalance + payin;
    }

	double withdrawl(double payout){
      accBalance = accBalance - payout;
      return accBalance;
    }

	static void getBankName(){
	  System.out.println(bank);
	}
	static void getBranchName(){
	  System.out.println(branch);
	}
    static void getIfsc(){
	  System.out.println(ifsc);
	}
    void display(){
	  System.out.println("Bank Name\t"         +bank);
	  System.out.println("Branch Name\t"      +branch);
	  System.out.println("IFSC code\t"          +ifsc);
      System.out.println("Customer Name\t"  +accHolder);
	  System.out.println("Account Number\t"  +accNum);
	  System.out.printf("Account Balance\t%.2f\n",accBalance);
	}

}
