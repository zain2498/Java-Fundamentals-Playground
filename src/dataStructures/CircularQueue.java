package dataStructures;

public class CircularQueue {

    private int count;
    private int frontOfQueue;
    private int rareOfQueue;
    private int[] arrOfQueue;

    public CircularQueue(int size) {
        arrOfQueue = new int[size];
        frontOfQueue = -1;
        rareOfQueue = -1;
        count = 0;
    }

    public void enQueue(int ele){
        if (isFullQueue()){
            System.out.println("Queue is full");
            return;
        }
        rareOfQueue = (rareOfQueue + 1)%arrOfQueue.length;
        arrOfQueue[rareOfQueue] = ele;
        if (frontOfQueue==-1){
            frontOfQueue = rareOfQueue;
        }
        count++;
    }
    public int deQueue(){
        int element = -1;
        if (isEmptyQueue()){
            System.out.println("Queue is empty");
            return -1;
        }
        element = arrOfQueue[frontOfQueue];
        arrOfQueue[frontOfQueue]=0;
        frontOfQueue = (frontOfQueue+1)%arrOfQueue.length;
        if (count==0){
            frontOfQueue=-1;
            rareOfQueue=-1;
        }
        count--;
        System.out.println("deque element "+element);
        return element;
    }
    public void displayQueueElements(){
        if (isEmptyQueue()){
            System.out.println("Queue is empty");
        }
        System.out.print("[ ");
        for (int i =0; i < count; i++){
            int index = (frontOfQueue + i)%arrOfQueue.length;
            System.out.print(arrOfQueue[index]+" ");
        }
        System.out.print("]\n");
    }
    public void peekQueueElement(){
        if (isEmptyQueue()){
            System.out.println("Queue is empty");
        }else {
            System.out.println("peeking an element "+ arrOfQueue[frontOfQueue]);
        }
    }

    public boolean isFullQueue() {
        return count == arrOfQueue.length;
    }

    public boolean isEmptyQueue() {
        return count == 0;
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
