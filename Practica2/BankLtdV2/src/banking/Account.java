package banking;
//  @author AlexaMV
public class Account {
   private double balance;
   public Account(double initBalance) 
   {
      balance = initBalance;
   }
   public double getBalance() 
   {
      return balance;
   }
   public void deposit(double cantidad) 
   {
      balance = balance + cantidad;
   }
   public void withdraw(double cantidad) 
   {
      balance = balance - cantidad;
   }
}
