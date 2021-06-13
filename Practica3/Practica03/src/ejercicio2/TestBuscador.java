/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author AlexaMV
 */
public class TestBuscador 
{
    public static void main(String[] args) 
    {
        Buscador search = new Buscador();
        String text = "El gato sobre el tejado";
        String subtext = "tejado";
        if (search.haySubString(subtext, text) == true)
        {
            System.out.println("El textto: "+ subtext+" Si se encuentra");
        }
        else
        {
            System.out.println("El textto: "+ subtext+" no se encuentra");
        }
        
    }
    
    
    
}
