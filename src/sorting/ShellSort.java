package sorting;

public class ShellSort {

    public static void sort(int[] arr){
        int n = arr.length;
        int pivot = n/2;
        for (int gap=pivot; gap>0; gap/=2){
            for (int i=gap; i < n; i ++){
                int temp = arr[i];
                int j;
                for (j=i; j>=gap && arr[j-gap] > temp; j = j - gap){
                    arr[j] = arr[j-gap];
                }
                arr[j]=temp;
            }
        }

        System.out.println("shell sorting...");
        printArr(arr);
    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,2,9,4,1,3,7,5,8};
        sort(arr);
    }
}
