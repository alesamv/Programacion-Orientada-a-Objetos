/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author mariana
 */
public class BusquedaArchivo {
    public String[] busqueda (String s) 
    {
        String search = s; //Dato a buscar
        File file = new File("data\\acciones.txt"); // Aqui debes de cambiar la ruta en la que este el archivo acciones.txt en tu compu
        try {
            BufferedReader in = new BufferedReader(new FileReader(file)); //Abrimos el archivo como file reader para  solo lectura
             //Objeto de tipo String >>cada linea será una cadena<<
            s = in.readLine(); //in.readLine para leer cada linea del archivo
            while( s != null ) 
            {   
                String[] palabra = s.split(",");  //split para separar la linea con un delimitador que es la coma, esto es que cada que encuentre una coma separa la palabra
                System.out.println(search);
                if(search.equals(palabra[0].toUpperCase())) //Compara la palabra[0] que es la primer palabra de cada linea en mayusculas >>toUpperCase() es igual al dato a buscar<<
                {
                    System.out.print("Si se encontro " + palabra[0]); //Sí es igual imprimimos toda la linea
                    return palabra;
                }
                else
                {
                    System.out.println("No se encontro "+ palabra[0]);         
                }
                s = in.readLine(); //seguimos leyendo en el ciclo while
                
            }
            in.close(); //Cerramos archivo
            } catch (FileNotFoundException e1) {
            System.err.println("File not found: " + file);
            } catch (IOException e2) {
            e2.printStackTrace();
            }
        return null;
    }
}