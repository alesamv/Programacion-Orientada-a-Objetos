package banking.domain;

import java.util.ArrayList;
import java.util.ListIterator;

public class Bank 
{
   private static Bank bank;
   ArrayList <Customer> customers; 
   
   static 
   {
        bank = new Bank();
   }
   
   private Bank() 
   {
      customers = new ArrayList<>();
   }
   public static Bank getBank()
   {
       return bank;
   }
   public void addCustomer(String firstName, String lastName) 
   {
      Customer customer = new Customer(firstName, lastName);
      customers.add(customer);
   }
   
   public Customer getCustomer(int index) 
   {
      return customers.get(index);
   }
   
   public int getNumOfCustomers() 
   {
      return customers.size();
   }
   
   public ListIterator getCustomers()
   {
       ListIterator iteList = customers.listIterator();
       return iteList;
   }
}
