package EnumRepo;

import java.util.Arrays;

enum Season{
    WINTER(4),SUMMER(3),FALL(1),SPRING(2);

    private int value;
    private Season(int val){
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}

public class SeasonRunner {

    public static void main(String[] args) {
            Season season = Season.FALL;
        System.out.println("season "+season);
            Season season1 = Season.valueOf("WINTER");
            System.out.println("season1 "+season1);

        System.out.println(Season.SUMMER.ordinal());

        System.out.println(Arrays.toString(Season.values()));
    }


}
