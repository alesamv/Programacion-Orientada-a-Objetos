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
public class CheckingAccount extends Account {
    public double overdraftProtection;
    
    public CheckingAccount(double balance)
    {
        super(balance);
    }
    public CheckingAccount(double balance, double protect)
    {
        super(balance);
        this.overdraftProtection = protect;
    }
    
    @Override
    public boolean withdraw(double amount)
    {
        if (balance < amount)
        {
            System.out.println("No hay fondos suficientes para cubrir el retiro");
            if((balance + overdraftProtection) < amount)
            {
                System.out.println("Aun con overdraft protection no se cubre el retiro. Su over draft protection es de: $"+ overdraftProtection);
                return false;
            }
            else
            {
                System.out.println("Se cuenta con un overdraft protection de: $"+ overdraftProtection);
                overdraftProtection = (balance + overdraftProtection) - amount;
                balance = 0.0;
                return true;
            }
        }
        else
        {
            balance -= amount;
            return true;
        }     
    }
}
