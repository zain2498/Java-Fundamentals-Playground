//package Collections;
//
//import java.util.*;
//
//public class MapCollection {
//
//    public static void printString(){
//        Map<String, Integer> list = Map.of("A",1,"B",2,"C",3,"D",4,"E",5);
//
//        HashMap<String, Integer> hashMap = new HashMap(list); //unordered, unsorted
//        LinkedHashMap<String,Integer>  linkedHashMap= new LinkedHashMap<>(list); //order of insertion
//        TreeMap<String,Integer> treeMap = new TreeMap<>(list); //sorted order
//
//        System.out.println("hashMap "+ hashMap);
//        System.out.println("hashMap for specific ELEMENT "+ hashMap.get("C"));
//        System.out.println("linkedHashMap "+ linkedHashMap);
//        System.out.println("treeMap "+ treeMap);
//
//    }
//
//    public static void main(String args[]){
//
//        MapCollection obj = new MapCollection();
//        obj.printString();
//
//    }
//}
