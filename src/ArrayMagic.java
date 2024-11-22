public class ArrayMagic {

    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        boolean isGreater = false;
        if(array.length == 0){
            return isGreater;
        }

        for(int value : array){
            if(value > number){
                return !isGreater;
            }
        }
        return isGreater;
    }

    public static void main(String args[]){
        ArrayMagic obj = new ArrayMagic();
        int[] arr = {1,2,3,4,5};
        int number = 3;
        boolean flag = obj.doesHaveElementGreaterThan(arr, number);
        System.out.println(flag);
    }

}
