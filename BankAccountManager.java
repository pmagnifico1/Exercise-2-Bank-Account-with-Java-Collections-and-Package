import java.util.HashMap;
import java.util.Map;

/** Manages bank accounts stored by their account IDs. */
public class BankAccountManager implements Bank {
  Map<Integer, BankAccount> accounts;
  int id;

  public BankAccountManager() {
    this.accounts = new HashMap<>();
    this.id = 0;
  }

  @Override
  public void addAccount(BankAccount account) {
    // TODO Auto-generated method stub
    accounts.put(id, account);
    System.out.println("Account added successfully with ID: " + id);
    id++;
    if (accounts.size() >= 100) {
      System.out.println("Maximum accounts reached");
      accounts.remove(id - 1);
    }
  }

  @Override
  public BankAccount getAccount(int id) {
    // TODO Auto-generated method stub
    return accounts.get(id);
  }

  public void listAccounts() {
    for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
      int accountId = entry.getKey();
      BankAccount account = entry.getValue();
      System.out.printf(
          "Account ID: %d, Account Name: %s, Balance: %.2f%n",
          accountId, account.getOwnerName(), account.getBalance());
    }
  }
}
