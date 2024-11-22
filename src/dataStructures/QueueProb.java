package dataStructures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProb {


    // First in First Out (FIFO)

    public static void main(String[] args) {

        Queue<String> queue2 = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("Zain");
        queue.offer("hamza");
        queue.offer("hassan");
        queue.offer("Imaad");
        queue.offer("Daniyal");
        queue.offer("Osama");

        System.out.println("Sequence: "+queue);
        System.out.println("Out: "+queue.poll());
        System.out.println("Out2: "+queue.poll());
        System.out.println("View Head: "+queue.peek());

        System.out.println("Line "+queue);
    }
}
