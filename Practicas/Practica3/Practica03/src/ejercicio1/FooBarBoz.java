/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author AlexMV
 */
public class FooBarBoz 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 50; i ++)
        {   
            System.out.print(i);
            if((i % 3) == 0)
            {
                System.out.print(" foo");
            }
            if((i % 5) == 0)
            {
                System.out.print(" bar");
            }
            if((i % 7) == 0)
            {
                System.out.print(" boz");
            }
            System.out.println();
        }
    }
}

