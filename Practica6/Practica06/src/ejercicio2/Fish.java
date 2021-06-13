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
public class Fish extends Animal implements Pet
{   
    public String name;
    public Fish()
    {
        super(0);
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public void eat()
    {
        System.out.println("Come hojuelas");
    }
    
    @Override
    public void play();
    {
        System.out.println("No juega");
    }
    
    @Override
    public void walk()
    {
        System.out.println("No camina por que no tiene patas");
    }
    
    
}
