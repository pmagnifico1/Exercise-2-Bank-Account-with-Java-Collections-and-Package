
/** Runs a basic demonstration of bank account operations. */
public class Main {
  /** Runs the account and transaction history demonstration. */
  public static void main(String[] args) {
    BankAccount acc1 = new SavingsAccount("Test0");
    acc1.deposit(1000.125);
    // acc1.deposit(0);
    // acc1.deposit(-500);
    acc1.withdraw(500);
    // acc1.withdraw(1500);
    // acc1.withdraw(-100);
    // acc1.freezeAccount();
    // acc1.deposit(11500);
    // acc1.withdraw(500);
    // acc1.unfreezeAccount();
    acc1.withdraw(100);

    System.out.println("Transaction history:");
    System.out.println(acc1.getTransactionHistory());
    BankAccountManager accM1 = new BankAccountManager();
    accM1.addAccount(acc1);
    accM1.addAccount(new SavingsAccount("Test1"));
    accM1.listAccounts();
  }
}
