
public class BiArray {

    private int[] array1;
    private int[] array2;

   private boolean flag = false;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        if(sum1 == sum2){
            flag = true;
        }

        return flag;
    }

    private int calculateSum(int[] array) {
        int sumOfElements = 0;
        for(int value:array){
            sumOfElements+=value;
        }

        return sumOfElements;
    }

    public static void main (String[] args){
        int[] arr1 = {-1, -1, -1};
        int[] arr2 = {-2, 1};
        BiArray biArrObj = new BiArray(arr1, arr2);
        boolean flag = biArrObj.areSumsEqual();
        System.out.println("The sum of two arrays are "+flag);

    }

}