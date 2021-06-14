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
public class Buscador 
{
    static boolean haySubString(String subTexto, String texto)
    {   
      int i, j;
      boolean found = false;
      for (i = 0; (i < texto.length()) && !found; i++) 
      {
         j = 0;
         found = false;
         while (!found) 
         {
            if (j >= subTexto.length()) 
            {
               break;
            } else if ((i + j) >= texto.length()) 
            {
               break;
            } else if (subTexto.charAt(j) != texto.charAt(i + j)) 
            {
               break;
            } else 
            {
               j++;
               if (j == subTexto.length()) 
               {
                  found = true;
               }
            }
         }
      }
      return found;
    }
}
