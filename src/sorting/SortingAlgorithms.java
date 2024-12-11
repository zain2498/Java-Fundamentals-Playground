package sorting;

import java.util.Scanner;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {

        if (arr.length < 0) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        System.out.println("bubble sorting....");
        printArr(arr);
    }


    private static void insertionSort(int[] arr) {
        //[1,7,3,2] --> [1 1]
        for (int i=1; i< arr.length; i++){
            int current = arr[i]; //2
            int j = i-1; //7
            while (j>=0 && current < arr[j]){ // 2 < 1
                arr[j+1] = arr[j]; // 1 3 3 7
                j--; //0
            }
            arr[j+1] = current; // a[1] = 2 --> 1 2 3 7
        }

        printArr(arr);
    }

    private static void selectionSort(int[] arr) {

        for (int i=0; i < arr.length; i++){
            int smallest = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int swap = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = swap;
        }
        System.out.println("selection sorting....");
        printArr(arr);
    }

    private static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        System.out.println("shell sorting...");
        printArr(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

            System.out.println("quick sorting...");
            printArr(arr);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter random numbers to sort");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Please select the sorting algorithm to sort the unsorted array");
        System.out.println("Press 1 for bubble sort");
        System.out.println("Press 2 for insertion sort");
        System.out.println("Press 3 for selection sort");
        System.out.println("Press 4 for shell sort");
        System.out.println("Press 5 for quick sort");
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                insertionSort(arr);
                break;
            case 3:
                selectionSort(arr);
                break;
            case 4:
                shellSort(arr);
                break;
            case 5:
                quickSort(arr, 0, arr.length-1);
                break;
        }
    }
}
