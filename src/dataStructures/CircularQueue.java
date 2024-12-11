package dataStructures;

public class CircularQueue {

    private int count;
    private int frontOfQueue;
    private int rareOfQueue;
    private int[] arrOfQueue;

    public CircularQueue(int size) {
        arrOfQueue = new int[size];
        count=0;
        frontOfQueue = -1;
        rareOfQueue = -1;
    }

    public void enQueue(int value) {

        if (isFullQueue()){
            System.out.println("Queue is full, You cannot add more elements to it");
            return;
        }

        rareOfQueue = (rareOfQueue + 1) % arrOfQueue.length;
        arrOfQueue[rareOfQueue] = value;

        if(frontOfQueue ==-1){
            frontOfQueue = rareOfQueue;
        }
        count ++;
    }

    public int deQueue() {
        int element = -1;

        if (isEmptyQueue()) {
            System.out.println("Queue is empty, there is no item to be dequeue");
            return -1;
        }

        element = arrOfQueue[frontOfQueue];
        arrOfQueue[frontOfQueue] = 0;

        frontOfQueue = (frontOfQueue + 1) % arrOfQueue.length;
        count--;

        if(count==0){
            frontOfQueue = -1;
            rareOfQueue = -1;
        }

        return element;
    }

    public void displayQueueElements() {
        if(isEmptyQueue()){
            System.out.println("Queue is empty, there is nothing to be display ");
            return;
        }

        System.out.print("[ ");
       for (int i = 0; i < count; i++){
           int index = (frontOfQueue + i)%arrOfQueue.length;
           System.out.print(arrOfQueue[index]+" ");
       }
        System.out.println("]");
    }

    public boolean isFullQueue() {
        return count == arrOfQueue.length;
    }

    public boolean isEmptyQueue() {
        return count == 0;
    }

    public void peekQueueElement() {
        if(isEmptyQueue()){
            System.out.println("Queue is empty, there is nothing to be peeked ");
        }else {
            System.out.println("peek element " + arrOfQueue[frontOfQueue]);
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(7);

        circularQueue.enQueue(100);
        circularQueue.enQueue(200);
        circularQueue.enQueue(300);
        circularQueue.enQueue(400);
        circularQueue.enQueue(500);
        circularQueue.enQueue(600);
        circularQueue.enQueue(700);

        circularQueue.displayQueueElements();

        circularQueue.enQueue(800);

        circularQueue.peekQueueElement();

        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.displayQueueElements();

        circularQueue.enQueue(800);
        circularQueue.enQueue(900);
        circularQueue.displayQueueElements();

        circularQueue.enQueue(1000);
    }
}
