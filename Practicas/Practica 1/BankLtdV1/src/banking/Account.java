package banking;
//  @author AlexaMV
public class Account 
{
   private double balance; 
   public Account(double balance) 
   {
      this.balance = balance;
   }
   public double getBalance()
   {
      return balance;
   }
   public  void deposit(double cantidad) {
      balance += cantidad;
   }
   public  void withdraw(double cantidad) {
      balance -= cantidad;
   }
}
