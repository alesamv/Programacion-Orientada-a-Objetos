/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author AlexaMV
 */
public class TestArrays 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1,2,3,5,7,11,13,17};
        int[] array2;
        printArray(array1);
        array2 = array1;
        System.out.println("Modificando array 2...");
        cambiaArray(array2);
        printArray(array2);
        System.out.println("Array1 despues de modificar array2: ");
        printArray(array1);
        
        int[][] matrix = new int [5][];
        llenarArray(matrix);
        
        for(int x = 0; x < matrix.length; x++)
        {
            System.out.print("Matriz["+ x +"] es "+"<");
            printMatrix(matrix[x]);
        }
    }
    
    public static void printArray(int[ ] array) 
    {
        System.out.print('<');
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if ((i + 1) < array.length) {
                        System.out.print(", ");

                }
        }
        System.out.println('>');
    }
    
    public static void cambiaArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if( (i % 2) == 0)
            {
                array[i] = i;
            }
        }
    }
    
    public static void llenarArray(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            matrix[i] = new int [i];
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (i*j);
            }
        }
    }
    
    public static void printMatrix(int[] matrix) 
    {
        //System.out.print("Matriz["++"]"+"<");
        for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i]);
                if ((i + 1) < matrix.length) {
                        System.out.print(", ");
                }
        }
        System.out.println('>');
    }
}

