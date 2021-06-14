package banking.domain;
//  @author AlexaMV

import banking.domain.Account;
import java.util.ArrayList;
import java.util.ListIterator;

public class Customer 
{
   private String firstName;
   private String lastName;
   public ArrayList <Account> accounts;
   
   public Customer(String firstName, String lastName) 
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.accounts = new ArrayList<>();
   }
   
   public String getFirstName() 
   {
      return firstName;
   }
   
   public String getLastName() 
   {
      return lastName;
   }
   
   public Account getAccount(int n) 
   {
      return accounts.get(n);
   }
   
   public void addAccount(Account account) 
   {
      accounts.add(account);
   }
   
   public int getNumOfAccounts() 
   { 
      return accounts.size();
   }
   
   public ListIterator getAccounts()
   {
       ListIterator iteList = accounts.listIterator();
       return iteList;
   }
}
