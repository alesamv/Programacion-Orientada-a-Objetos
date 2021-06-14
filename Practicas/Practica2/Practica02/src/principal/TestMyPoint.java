/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author AlexaMV
 */
public class TestMyPoint 
{
    public static void main(String[] args) {
        MyPoint start;
        MyPoint end;
        
        start = new MyPoint();
        end = new MyPoint();
        
        start.x = 10;
        start.y = 10;
        end.x = 20;
        end.y = 30;
        
        System.out.println("El valor de start son = "+ start);
        System.out.println("El valor de end son = "+ end);
        
        MyPoint stray;
        stray = end;
        
        System.out.println("Asignando end a stray");
        System.out.println("El valor de stray son = "+ stray);
        System.out.println("El valor de end son = "+ end);
        
        stray.x = 54;
        stray.y = 31;
        
        System.out.println("Cambiando valores de stray");
        System.out.println("El valor de stray son = "+ stray);
        System.out.println("El valor de end son = "+ end);
        System.out.println("El valor de start son = "+ start);
    }
}
