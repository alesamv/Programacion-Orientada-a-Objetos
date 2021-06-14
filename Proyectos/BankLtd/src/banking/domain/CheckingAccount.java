package banking.domain;
public class CheckingAccount extends Account {
   private double overdraftProtection;
   public CheckingAccount(double balance) {
      super(balance);
   }
   public CheckingAccount(double balance, double protect) {
      super(balance);
      this.overdraftProtection = protect;
   }
   @Override
   public void withdraw(double amount) throws OverdraftException {
      if (balance < amount) {
         System.out.println("Fondos insuficientes para pagar $ " + amount + ". El saldo es $ " + balance + ".  Checando protección de sobregiro...");
         if (overdraftProtection == 0) {
            throw new OverdraftException("Fondos Insuficientes (No tiene protección) $", amount - balance);
         } else if ((balance + overdraftProtection) < amount) {
            throw new OverdraftException("Fondos insuficientes aun con protección de sobregiro $", amount - (balance + overdraftProtection));
         } else {
            overdraftProtection = (balance + overdraftProtection) - amount;
            balance = 0.0;
            System.out.println("Se cubrió con overdraft, saldo = $" + balance + " , protección de sobregiro = $" + overdraftProtection);
         }
      } else {
         balance -= amount;
      }
   }
}
