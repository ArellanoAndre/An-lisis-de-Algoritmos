package PruebasRun;

import static Ordenamiento.InsertionSort.insertionSort;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Arell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arreglo = {40,30,20,10,50}; // Arreglo de prueba

//        ImprimirArreglo("antes de acomodo",arreglo); 
//        bubbleSort(arreglo); // Llamada al método de ordenamiento
//        ImprimirArreglo("despues de acomodo",arreglo); 
    
          ImprimirArreglo("antes de acomodo",arreglo); 
          insertionSort(arreglo);
          ImprimirArreglo("despues de acomodo",arreglo); 

//        
        }
    
    public static void ImprimirArreglo(String s,int arreglo[]){
    System.out.println("\n\nArreglo " + s + ":");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
    }

    }
    
    }
    

