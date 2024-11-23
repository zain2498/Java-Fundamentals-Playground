package dataStructures;

import java.util.Stack;

public class StackProb {

        // Last in First Out (LIFO)

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Physics");
        stack.push("Maths");
        stack.push("Computer Science");
        stack.push("Data Structures");
        stack.push("Chemistry");


//        String myFavSub = stack.pop();
//        String myFavSub2 = stack.pop();

//        System.out.println("out1 "+myFavSub);
//        System.out.println("out2 "+myFavSub2);
        System.out.println("View subject "+stack.peek());
        System.out.println(stack.search("Computer Science"));
        System.out.println(stack);
    }
}
