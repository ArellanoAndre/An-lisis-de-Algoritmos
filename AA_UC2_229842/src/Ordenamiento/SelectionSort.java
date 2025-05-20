/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author Arell
 */
public class SelectionSort {
    // Método que recibe un arreglo y lo ordena usando Selection Sort
    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Suponemos que el menor es el actual

            // Buscamos el índice del menor valor en la parte no ordenada
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiamos el actual con el mínimo encontrado
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr; // Devolvemos el arreglo ya ordenado
    }

    public SelectionSort() {
    }
    
}

