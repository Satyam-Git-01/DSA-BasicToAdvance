package SortingAlgorithms;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 3, 2, 4, 1 };
        System.out.println("Unsorted Array is :" + Arrays.toString(arr));
        // BubbleSort(arr);
        // SelectionSort(arr);
        InsertionSort(arr);
        System.out.println("Sorted Array is :" + Arrays.toString(arr));
    }

    // O(n2) Worst case O(n) Best Case
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        for (int pass = 0; pass < n; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    //O(n2) Always
    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minimumElement_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimumElement_index]) {
                    minimumElement_index = j;
                }
            }
            int temp = arr[minimumElement_index];
            arr[minimumElement_index] = arr[i];
            arr[i] = temp;
        }
    }
    //O(n2) worst case , O(n) best case
    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

}