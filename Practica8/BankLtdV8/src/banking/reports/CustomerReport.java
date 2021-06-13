package banking.reports;
import banking.domain.*;
import java.text.NumberFormat;
import java.util.ListIterator;
public class CustomerReport 
{
   public void generateReport() 
   {
      NumberFormat currency_format = NumberFormat.getCurrencyInstance();
      /**
       * * Paso1: obtenga el objeto bank **
       */
      Bank bank = Bank.getBank();
      Customer customer;
      ListIterator iteList = bank.getCustomers();
      
      System.out.println("\t\t\tREPORTE DE CLIENTES");
      System.out.println("\t\t\t===================");
      
      while (iteList.hasNext()) 
      {
         customer = (Customer)iteList.next();
         System.out.println();
         
         ListIterator List = customer.getAccounts();
         
         System.out.println("Customer: " + customer.getLastName() + ", "  + customer.getFirstName());
         
         while(List.hasNext())
         {
            Account account = (Account)List.next();
            
            String account_type = "Desconocida";
            if(account instanceof SavingsAccount) 
            {
               account_type = "Savings Account";
            } else if ( account instanceof CheckingAccount ) 
            {
                account_type = "Checking Account";
            } 
            else 
            {
                account_type = "Unknown Account Type";
            }
            // Print the current balance of the account
            System.out.println("    " + account_type + ": su saldo es de "
                  + currency_format.format(account.getBalance()));
         }
      }
   }
}
