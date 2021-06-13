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
public class Cat extends Animal implements Pet
{
    public String name;
    public Cat(String name)
    {
        super(4);
        this.name = name;
    }
    public Cat()
    {
        this(null);
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void eat()
    {
        System.out.println("Come atún");
    }
    @Override
    public void play()
    {
        System.out.println("Juega mucho");
    }
    
    
}
