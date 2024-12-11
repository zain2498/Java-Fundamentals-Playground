package sorting;


public class selectionSort {

    public static void printArray(int arr[]){
        for (int i =0 ; i< arr.length; i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void main(String args[]){

        int arr[] = {7,2,8,3,1,4,5};
        System.out.println("unsorted array length "+ arr.length);
        for (int i=0; i < arr.length; i ++){
            int smallest = i;

            for (int j = i+1 ; j < arr.length; j++){

                if(arr[smallest] > arr[j]){

                    smallest = j;

                }
            }

            //swapping
            int temp = arr[smallest]; //2
            arr[smallest] = arr[i]; //2
            arr[i] = temp; //2
        }
        printArray(arr);

    }
}