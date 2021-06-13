/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.text.NumberFormat;
/**
 *
 * @author AlexaMV
 */
public class TestBanking {
    public static void main(String[] args) {
      // crea el objeto bank, le asigna 4 clientes y los depliega.
      Bank bank = new Bank();
      bank.addCustomer("Jane", "Simms");
      bank.addCustomer("Owen", "Bryant");
      bank.addCustomer("Tim", "Soley");
      bank.addCustomer("Maria", "Soley");
      for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
         Customer customer = bank.getCustomer(i);
         System.out.println("Customer [" + i  + "] is "
               + customer.getLastName()  + ", " + customer.getFirstName());
      }
      // realiza algunas transacciones con el cliente 0.
         boolean result = true;
         double amount = 0.0;
         Customer customer = bank.getCustomer(0); 
         Account account;
         NumberFormat formato = NumberFormat.getCurrencyInstance();
         // Crea una cuenta con $500.00 de saldo.
         System.out.println("Creando  cuenta del cliente 0 con saldo de $500.00.");
         customer.setAccount(new Account(500.00));
         account = customer.getAccount();
         amount = 150.00;
         System.out.println("Intentando retiro de " + formato.format(amount));
         result = account.withdraw(amount);
         if (result) {
            System.out.println("Retiro de " + formato.format(amount) + " OK");
         } else {
            System.out.println("Retiro de " + formato.format(amount) + " inválido");
         }
         amount = 22.50;
         System.out.println("Depósito de " + formato.format(amount));
         account.deposit(amount);
         amount = 500.00;
         System.out.println("Intentando retiro de " + formato.format(amount));
         result = account.withdraw(amount);
         if (result) {
            System.out.println("Retiro de " + formato.format(amount) + " OK");
         } else {
            System.out.println("Retiro de " + formato.format(amount) + " inválido, fondos insuficientes");
         }
         // Despliega el saldo final de la cuenta.
         System.out.println("El cliente  [" + customer.getLastName()
               + ", " + customer.getFirstName()
               + "] tiene un saldo de  " + formato.format(account.getBalance()));
      }
    
}
