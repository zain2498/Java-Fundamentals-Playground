package dataStructures.Tree;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TreeMapExample {
    private Map<String, Integer> populatedMap = null;

    public Map<String, Integer> getPopulatedMap() {
        return populatedMap;
    }

    public void setPopulatedMap(Map<String, Integer> populatedMap) {
        this.populatedMap = populatedMap;
    }

    public void treeMap(Map<String, Integer> reqMap) throws Exception {
        populatedMap = new TreeMap<>();
        mapOperation(reqMap, populatedMap, "treeMap");
    }

    public void concurrentHashMap(Map<String, Integer> reqMap) throws Exception {
        populatedMap = new ConcurrentHashMap<>();
        mapOperation(reqMap, populatedMap, "concurrentHashMap");
    }

    public void linkedHashMap(Map<String, Integer> reqMap) throws Exception {
        populatedMap = new LinkedHashMap<>();
        mapOperation(reqMap, populatedMap, "linkedHashMap");
    }

    public void hashMap(Map<String, Integer> reqMap) throws Exception {
        populatedMap = new HashMap<>();
        mapOperation(reqMap, populatedMap, "hashMap");
    }

    public void mapOperation(Map<String, Integer> reqMap, Map<String, Integer> targetedMap, String mapType) throws Exception {
        System.out.println("Good Evening Sir, you have chosen the " + mapType + " Data-Structures");
        if (reqMap.isEmpty()) {
            System.out.println("Sorry! The Requested map is empty we cannot perform any operation on it");
            return;
        }
        reqMap.forEach(targetedMap::put);
        populatedMap = targetedMap;

        reqMap.forEach((key, value) -> {
            System.out.println("key: " + key + " values: " + value);
        });

    }

    public Map<String,Integer> processValues(Scanner scanner, TreeMapExample mapObj) {
        System.out.println("Please enter the size of our data structures");
        int size = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> userMap = new HashMap<>();
        for (int i=0; i< size; i++){
            System.out.println("Enter the name # "+(i+1)+":");
            String userKey = scanner.next();
            System.out.println("Enter the age for the person: "+userKey);
            int userValue = scanner.nextInt();
            userMap.put(userKey,userValue);
        }
        return userMap;
    }

    public void processUserChoice(Scanner scanner, TreeMapExample mapObj) throws Exception{
        boolean isExecuting = true;
        while (isExecuting) {
            System.out.println("Choose the option below");
            System.out.println("Press 1 for Tree Map");
            System.out.println("Press 2 for Linked Map");
            System.out.println("Press 3 for ConcurrentHash Map");
            System.out.println("Press 4 for Hash Map");
            System.out.println("Press 0 for Exit");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    mapObj.treeMap(mapObj.populatedMap);
                    break;
                case 2:
                    mapObj.linkedHashMap(mapObj.populatedMap);
                    break;
                case 3:
                    mapObj.concurrentHashMap(mapObj.populatedMap);
                    break;
                case 4:
                    mapObj.hashMap(mapObj.populatedMap);
                    break;
                case 0:
                    System.out.println("Thanks for using our system. GOOD BYE!!!");
                    System.out.println("See you next time :) ");
                    System.out.println("Take care sir");
                    isExecuting = false;
                    break;
                default:
                    System.out.println("Please perform the valid operation as shown on the menu");
                    break;

            }
        }
    }
}
