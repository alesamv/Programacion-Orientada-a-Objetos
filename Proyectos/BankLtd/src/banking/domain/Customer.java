package banking.domain;

import java.util.ArrayList;
import java.util.ListIterator;
public class Customer {
   private String firstName;
   private String lastName;
   protected ArrayList<Account> accounts;
   public Customer(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
      accounts = new ArrayList<>();
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public Account getAccount(int n) {
      return accounts.get(n);
   }
   public void addAccount(Account account) {
      accounts.add(account);
   }
   public int getNumOfAccounts() { 
      return accounts.size();
   }
   public ListIterator getAccounts() {
      return accounts.listIterator();
   }
}
