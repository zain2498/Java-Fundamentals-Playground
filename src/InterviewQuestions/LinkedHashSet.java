package InterviewQuestions;

/*
The fastest and most efficient way to remove duplicates from an ArrayList in Java is by converting it to a LinkedHashSet.
This approach filters out all repeated elements instantly while preserving the original insertion order of your items
*/

import java.util.*;

public class LinkedHashSet {

    public static void main(String[] args) {
        List<Integer> listOfInts = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2, 8, 9, 10, 2, 1));
        Set<Integer> setOfInts = new HashSet<>(listOfInts);

        listOfInts.clear();
        listOfInts.addAll(setOfInts);
        System.out.println(listOfInts);
    }
}
