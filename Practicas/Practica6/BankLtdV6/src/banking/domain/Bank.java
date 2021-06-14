package banking.domain;

public class Bank 
{
   private static Bank bank;
   private Customer[] customers;
   private int numberOfCustomers;
   static 
   {
        bank = new Bank();
   }
   public static Bank getBank()
   {
       return bank;
   }
   private Bank() 
   {
      customers = new Customer[10];
   }
   public void addCustomer(String firstName, String lastName) {
      customers[numberOfCustomers] = new Customer(firstName, lastName);
      numberOfCustomers++;
   }
   public int getNumOfCustomers() {
      return numberOfCustomers;
   }
   public Customer getCustomer(int index) {
      return customers[index];
   }
}
