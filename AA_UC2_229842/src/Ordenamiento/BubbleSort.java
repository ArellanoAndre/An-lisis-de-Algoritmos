/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author Arell
 */
public class BubbleSort {
    
    /**
Método para ordenar un arreglo de enteros usando el algoritmo Bubble Sort.
Entrada: Un arreglo de enteros desordenados.
Salida: El mismo arreglo, pero ordenado ascendentemente.
Precondición: El arreglo debe existir y tener al menos un elemento.
Postcondición: Los elementos estarán ordenados de menor a mayor.
 * @param arr El arreglo de enteros a ordenar.
 * @pre El arreglo debe contener al menos un elemento.
 * @post El arreglo estará ordenado de forma ascendente.
 *Complejidad Temporal O(n^2) El algoritmo tiene dos bucles anidados, cada uno dependiendo del tamaño del arreglo, lo que genera una complejidad cuadrática.
 */
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // +1
        for (int i = 0; i < n - 1; i++) { // +1 (inicialización) + (n-1) (comparaciones) + (n-1) (incrementos)
            for (int j = 0; j < n - i - 1; j++) { // +1 (inicialización) + ((n-1)(n-1)/2) (comparaciones) + ((n-1)(n-1)/2) (incrementos)
                if (arr[j] > arr[j + 1]) { // ((n-1)(n-1)/2) (comparaciones)
                    int temp = arr[j]; // ((n-1)(n-1)/2) (asignaciones)
                    arr[j] = arr[j + 1]; // ((n-1)(n-1)/2) (asignaciones)
                    arr[j + 1] = temp; // ((n-1)(n-1)/2) (asignaciones)
                }
            }
        }
    }
}
