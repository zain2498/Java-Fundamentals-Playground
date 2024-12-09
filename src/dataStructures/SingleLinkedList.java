package dataStructures;

public class SingleLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void searchNode(int key){

        if(head == null){
            System.out.println("there is no node present in the list");
            return;
        }
        Node curr = head;
        while (curr!=null){
            if (curr.data == key){
                System.out.println("Node "+ curr.data+" is found ");
                return;
            }
            curr = curr.next;
        }
    }

    public void removeNode(int key){

        if(head == null){
            System.out.println("there is no node present in the list");
            return;
        }

        if(head.data == key){
            head = head.next;
            System.out.println("Node is removed from the head");
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr!=null && curr.data!=key){
            prev = curr;
            curr = curr.next;
        }

        if (curr == null){
            System.out.println("there is no such key: "+key+" present in the node to be removed");
            return;
        }

        if (tail ==curr){
            System.out.println("Node is removed from the tail.");
            tail = prev;
            return;
        }
        System.out.println("this node is "+key+" removed");
    }
    public void displayNode() {
        Node curr = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("elements of the node");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(4);
        singleLinkedList.addNode(7);
        singleLinkedList.addNode(5);
        singleLinkedList.addNode(10);
        singleLinkedList.searchNode(5);
        singleLinkedList.removeNode(10);
        //singleLinkedList.displayNode();
    }
}
