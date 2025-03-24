/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author Arell
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Obtiene el tamaño del arreglo

        // Recorremos el arreglo desde la segunda posición (índice 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Elemento actual que queremos insertar en su posición correcta
            int j = i - 1; // Índice del elemento anterior en la parte ordenada

            // Desplazamos los elementos mayores que "key" una posición hacia la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Mueve el elemento a la derecha
                j--; // Decrementamos el índice para seguir comparando hacia la izquierda
            }

            // Insertamos "key" en la posición correcta
            arr[j + 1] = key;
        }
    }
}
