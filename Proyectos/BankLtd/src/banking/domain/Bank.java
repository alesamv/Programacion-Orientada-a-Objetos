package banking.domain;

import java.util.ArrayList;
import java.util.ListIterator;
public class Bank {
   private static Bank bank;
   private ArrayList<Customer> customers;
   private Bank() {
      customers = new ArrayList<>();
   }
   static {
      bank = new Bank();
   }
   public static Bank getBank() {
      return bank;
   }
   public void addCustomer(String firstName, String lastName) {
      customers.add(new Customer(firstName, lastName));
   }
   public Customer getCustomer(int index) {
      return customers.get(index);
   }
   public int getNumOfCustomers() {
      return customers.size();
   }
   public ListIterator getCustomers() {
      return  customers.listIterator();
   }
}
