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
public class Account 
{
    private double balance;
    
    public Account(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean deposit(double cantidad)
    {
        balance += cantidad;
        return true;
    }
    public boolean withdraw(double cantidad)
    {
        if(cantidad > balance)
        {
            return false;
        }
        else
        {
            balance -= cantidad;
            return true;
        }
        
    }
    
}

