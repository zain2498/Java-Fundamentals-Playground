package hackerRank;

import static java.lang.Integer.parseInt;

public class Dimension {
    private int feet;
    private int inches;
    public int[] intArr = new int[2];

    public Dimension(int inches) {
        this.inches = inches;

        // 1 f = 12 inch
        computeTotalFeet(inches);

    }

    public int computeTotalFeet(int inches){

        double totalFeets = (double) inches / 12;
        System.out.println("totalFeets : "+ totalFeets);

        String[] arr = String.valueOf(totalFeets).split("\\.");
        intArr[0] = (int) Double.parseDouble(arr[0]); //whole
        intArr[1] = (int) Double.parseDouble(arr[1]);  // decimal

        setFeet(intArr[0]);
        setInches((int) Math.floor(intArr[1]));

        if(inches <1){
            inches = -1;
            feet = -1;
            return feet;
        }

        return feet;

    }

    public void setInches(int inches){
        this.inches = inches;
    }

    public void setFeet(int feet){
        this.feet = feet;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public static void main (String[] args) {

        int inches = 25;
        Dimension dimension = new Dimension(inches);

        System.out.println("feets : "+dimension.getFeet());
        System.out.println("inches : "+dimension.getInches());
    }

}