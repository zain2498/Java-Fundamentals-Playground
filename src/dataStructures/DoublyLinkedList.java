package dataStructures;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = null;
        }
    }

    public void searchForNode(int key) {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curr != null) {
            if (curr.data == key) {
                System.out.println("\nnode " + key + " is found");
            }
            curr = curr.next;
        }
    }

    public void removeNode(int key) {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (curr != null) {
            if (curr.data == key) {
                if (curr == head) {
                    System.out.println("Node is removed from head");
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (curr == tail) {
                    tail = tail.prev;
                    System.out.println("Node is removed from tail");
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    head.next.prev = curr.next;
                    tail.prev.next = curr.prev;
                    System.out.println("Node is removed " + key + " from the list");
                }
            }
            curr = curr.next;
        }

    }

    public void displayAllNodes() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes are given below");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(6);
        doublyLinkedList.displayAllNodes();
        doublyLinkedList.removeNode(6);
    }
}
