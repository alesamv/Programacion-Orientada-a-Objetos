/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.domain;

/**
 *
 * @author poo05alu27
 */
public class OverdraftException extends Exception
{
    private double deficit;
    public double getDeficit()
    {
       return deficit;
    }
    public OverdraftException(String message, double deficit)
    {
        super(message);
        this.deficit = deficit;
    }
}