package banking.reports;
import banking.domain.*;
import java.text.NumberFormat;
import java.util.ListIterator;
public class CustomerReport {
   public void generateReport() {
      NumberFormat currency_format = NumberFormat.getCurrencyInstance();
      Bank bank = Bank.getBank();
      Customer customer;
      ListIterator bankIte = bank.getCustomers();
      System.out.println("\t\t\tREPORTE DE CLIENTES");
      System.out.println("\t\t\t===================");
      while (bankIte.hasNext()) {
         customer = (Customer) bankIte.next();
         System.out.println();
         System.out.println("Cliente: " + customer.getLastName() + ", " + customer.getFirstName());
         Account account;
         ListIterator custIte = customer.getAccounts();
         while (custIte.hasNext()) {
            account = (Account) custIte.next();
            String account_type = "Desconocida";
            if (account instanceof SavingsAccount) {
               account_type = "Savings Account";
            } else if (account instanceof CheckingAccount) {
               account_type = "Checking Account";
            } else {
               account_type = "Unknown Account Type";
            }
            // Print the current balance of the account
            System.out.println("    " + account_type + ": su saldo es de "
                  + currency_format.format(account.getBalance()));
         }
      }
   }
}
