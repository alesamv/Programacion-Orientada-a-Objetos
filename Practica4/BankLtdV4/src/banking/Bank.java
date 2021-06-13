/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author AlexaMV
 */
public class Bank {
    private Customer[] customers;
    private int numOfCustomers;
    
    public Bank()
    {   
        customers = new Customer [5];
    }
    
    public void addCustomer(String firstName, String lastName)
    { 
        customers [numOfCustomers] = new Customer(firstName,lastName);
        numOfCustomers++;
    }
    
     public int getNumberOfCustomers()
     {
         return numOfCustomers;
     }
     
     public Customer getCustomer(int index)
     {
         return customers[index];
     }
}


