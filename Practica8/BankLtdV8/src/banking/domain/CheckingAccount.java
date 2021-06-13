package banking.domain;

import banking.domain.Account;

public class CheckingAccount extends Account 
{
   private double overdraftProtection;
   public CheckingAccount(double balance) 
   {
      super(balance);
   }
   public CheckingAccount(double balance, double protect) 
   {
      super(balance);
      this.overdraftProtection = protect;
   }
   @Override
   public void withdraw(double amount) throws OverdraftException
   {
      if (balance < amount) {
         System.out.println("No hay fondos suficientes para cubrir  $" + amount + ". El saldo es  $" + balance);
         if ((balance + overdraftProtection) > amount) 
         {
             System.out.println("Pero hay overdraft protection por $"+ overdraftProtection);
             overdraftProtection = (balance + overdraftProtection) - amount;
             balance = 0.0;
         } 
         else 
         {
            throw new OverdraftException("No es posiible hacer el retiro", amount);
         }
      } 
      else 
      {
        balance -= amount;
      }
   }
}