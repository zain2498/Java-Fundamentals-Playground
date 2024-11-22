//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class AnonymousClassRunner {
//
//    public static void main(String[] args) {
//
//        List<String> animals = new ArrayList<>(List.of("Ant","Cat","Ball","Elephant"));
//
//        //anonymous class is the one which does not have any name but it is hidden inside the code.
//        Comparator lengthComparator = new Comparator<String>() {
//            public int compare(String str1, String str2) {
//                return Integer.compare(str1.length(),str2.length());
//            }
//        };
//
//        Collections.sort(animals,lengthComparator);
//        System.out.println(animals);
//
//        //second way to define anonymous class is ::
////        Collections.sort(animals, new Comparator<String>() {
////            @Override
////            public int compare(String str1, String str2) {
////                return Integer.compare(str1.length(),str2.length());
////            }
////        });
//
//    }
//}
