/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Alexandra
 */
public abstract class Animal 
{
    protected int legs;
    
    public Animal(int legs)
    {
        this.legs = legs;
    }
    abstract void eat();
    
    public void walk(int legs)
    {
        System.out.println("El animal camina con "+legs+"patas");
    }
}
