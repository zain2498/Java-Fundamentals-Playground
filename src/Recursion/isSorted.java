package Recursion;

//if array is sorted return true or else return false
public class isSorted {

    public static boolean isSorted(int arr[], int index){

        if(index == arr.length-1){
            return true;
        }

        if(arr[index] >= arr[index+1]){
            return false;
        }

        return isSorted(arr,index+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isSorted(arr,0));
    }

}

//Time complexity is O(n) becx we are traversing the array of length...
