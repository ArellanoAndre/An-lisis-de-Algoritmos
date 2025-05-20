/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author Arell
 */
public class QuickSorter {

    public QuickSorter() {
    }
    
    
    // Método QuickSort en un solo método recursivo
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high]; // Elegimos el último elemento como pivote
            int i = low - 1;

            // Partición del arreglo
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Intercambiamos arr[i] y arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Colocamos el pivote en su posición correcta
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int pi = i + 1; // Índice del pivote

            // Llamadas recursivas para ordenar las sublistas
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr; // Retornamos el arreglo ordenado
    }

}


