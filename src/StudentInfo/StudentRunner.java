package StudentInfo;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class StudentRunner {

    public static void main(String args[]){

        Student student = new Student("Raja", 97, 98, 100);


        //Total sum of marks
        int sum = student.getTotalSumOfMarks();
        System.out.println("Total sum of marks are : "+sum);

        //Number of marks
        int number = student.getNumberOfMarks();
        System.out.println("Number of marks are : "+number);

        //Maximum mark
        int max = student.getMaximumMark();
        System.out.println("Maximum number of mark is :  "+max);

        //Minimum mark
        int min = student.getMinimumMark();
        System.out.println("Minimum number of mark is : "+ min);

        //Average marks
        BigDecimal avgMarks = student.getAverageMarks();
        System.out.println("Average number of marks are : "+avgMarks);

        //content of the student
        System.out.println("Student data is : "+student);

        student.addNewMarks(23);
        System.out.println("Student data after adding a new mark : "+student);

        student.removeMarksAtIndex(1);
        System.out.println("Student data after removing mark at specific index are : "+student);
    }
}
