class TestBankAc {
  public static void main(String[] args) {
    BankAccount HK = new BankAccount(100000);
    HK.currentBalance();
    HK.deposit(500);
    HK.currentBalance();
    HK.withdraw(200);
    HK.currentBalance();
  }
}