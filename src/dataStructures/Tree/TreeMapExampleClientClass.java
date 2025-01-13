package dataStructures.Tree;

import java.util.Map;
import java.util.Scanner;

public class TreeMapExampleClientClass {
    public static void main(String[] args) throws Exception {
        Scanner scanner = null;
        TreeMapExample mapObj = null;
        try {
            scanner = new Scanner(System.in);
            mapObj = new TreeMapExample();
            System.out.println("Welcome to our Tree Data Structures");
            Map<String, Integer> userMap = mapObj.processValues(scanner, mapObj);
            mapObj.setPopulatedMap(userMap);
            mapObj.processUserChoice(scanner, mapObj);
        } catch (Exception e) {
            throw e;
        } finally {
            scanner.close();
        }
    }
}
