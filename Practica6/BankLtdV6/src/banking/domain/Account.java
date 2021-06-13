package banking.domain;
//  @author adanz
public class Account {
   protected double balance;
   public Account(double balance) {
      this.balance = balance;
   }
   public double getBalance() {
      return balance;
   }
   public boolean deposit(double amount) {
      balance = balance + amount;
      return true;
   }
   public boolean withdraw(double amount) {
      if (amount > balance) {
         return false;
      } else {
         balance = balance - amount;
         return true;
      }
   }
}
