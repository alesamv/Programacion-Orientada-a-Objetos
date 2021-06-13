package banking;
//  @author adanz
public class Customer {
   private String firstName;
   private String lastName;
   private Account account;
   protected Account[] accounts;
   protected int numOfAccounts;
   
   public Customer(String firstName, String lastName) 
   {
      this.firstName = firstName;
      this.lastName = lastName;
      accounts = new Account[5];
   }
   public String getFirstName() 
   {
      return firstName;
   }
   public String getLastName() 
   {
      return lastName;
   }
   public void addAccount(Account account)
   {
      accounts[numOfAccounts] = account;
      numOfAccounts++;
   }
   public int getNumOfAccounts()
   {
       return numOfAccounts;
   }
   public Account getAccount(int n) 
   {
      return accounts[n];
   }
}
