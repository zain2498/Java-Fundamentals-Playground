package StudentInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name = "";
    private ArrayList<Integer> marks = new ArrayList<Integer>();


    public Student(String name, int... marks){ //int... means we can dynamically accept the length of an arraylist which is
                                                //we are using the variable arguement here....
        this.name = name;
        for (int mark : marks){ //enhanced form of for loop but this is not applicable
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks(){
        return this.marks.size();
    }

    public int getTotalSumOfMarks(){
        int sum = 0;

        for(int mark : marks){
            sum+=mark;
        }

        return sum;
    }

    public int getMaximumMark(){
        return Collections.max(marks);
    }

    public int getMinimumMark(){
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
    }

    public void addNewMarks(int mark){
        marks.add(mark);
    }

    public void removeMarksAtIndex(int index){
        marks.remove(index);
    }

    public String toString(){
        return name +" " + marks;
    }
}
