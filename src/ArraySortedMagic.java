import java.util.Arrays;

public class ArraySortedMagic {

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */

    private boolean isSort = false;
    public boolean isSorted(int[] array) {

        if(array.length <=1){
            isSort = true;
        }
        for (int i =0; i < array.length -1 ; i++){
             if (array[i] > array[i+1]) {
                isSort = true;
            }
        }

        return isSort;
    }

    public static void main(String[] args) {
        ArraySortedMagic arraySortedMagic = new ArraySortedMagic();
        int[] arr = {1,2,3,4};
        boolean flag =arraySortedMagic.isSorted(arr);
        System.out.println("The array sorted is "+flag);

    }

}