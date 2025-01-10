package AppliedProgramming;

import java.util.Scanner;

public class BSearch {

    public static int bSearch(int[] arr, int item){
        int n = arr.length;
        int b=0;
        int e = n;

        while (b<=e){
            int mid = (b + e) / 2;
            if(item == arr[mid]){
                System.out.println("we have found the given item "+ item);
                return item;
            }else {
                if (item > arr[mid]){
                    b = mid +1;
                }else {
                    e = mid -1;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {24, 36, 39, 47, 78, 87, 92, 112, 156};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a variable you want to find");
        int item = scanner.nextInt();
        bSearch(arr,item);
    }
}
