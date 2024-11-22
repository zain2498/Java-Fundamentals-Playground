package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class gradingPolicy {

    //imperitive programming
//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        List<Integer> finalGrades = new ArrayList<>();
//
//        for (int grade : grades) {
//
//            int diffTwo = (grade + 2) % 5;
//            int diffOne = (grade + 1) % 5;
//
//            if (diffOne == 0 && diffTwo != 0 && grade >= 38 ) {
//                grade += 1;
//            } else if (diffTwo == 0 && diffOne != 0 && grade >= 38) {
//                grade += 2;
//            } else {
//                System.out.println("your grading score will not be round up");
//            }
//
//                finalGrades.add(grade);
//        }
//
//        return finalGrades;
//    }

    //functionProgramming
//    public static List<Integer> gradingStudents(List<Integer> grades){
//      return   grades.stream()
//                .map(grade -> {
//                        int diffByOne = (grade +1) %5;
//                        int diffByTwo = (grade +2) %5;
//                        if(diffByOne ==0 && diffByTwo !=0 && grade >=38){
//                           return grade += 1;
//                        }else if(diffByTwo ==0 && diffByOne!=0 && grade >=38){
//                           return grade +=2;
//                        }else {
//                            return grade;
//                        }
//
//                }).collect(Collectors.toList());
//    }

    //more optimized approach through functional programming
    public static List<Integer> gradingStudents(List<Integer> grades) {
        System.out.println("Hafcha this is how the grading policy of the student is calculated :D");
        return grades.stream()
                .map(
                        grade -> (
                                (grade >= 38) ? (
                                        (grade + 2) % 5 == 0 ? grade + 2 : (grade + 1) % 5 == 0 ? grade + 1 : grade
                                )
                                        : grade)).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));

        System.out.println(grades);

    }
}
