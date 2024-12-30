package dataStructures;

public class DoublyLinkedList {

    class Node {
        int data;
        Node nextNode;
        Node prevNode;

        Node(int element) {
            this.data = element;
            nextNode = null;
            prevNode = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            tail = node;
            head.nextNode = null;
            tail.prevNode = null;
        } else {
            tail.nextNode = node;
            node.prevNode = tail;
            tail = node;
            node.nextNode = null;
        }
    }

    public void searchNode(int key) {
        Node curr = head;
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        while (curr != null) {
            if (curr.data == key) {
                System.out.println("Your request node for search is found " + key);
                return;
            }
            curr = curr.nextNode;
        }
        System.out.println("Your requested node for search is not found in the list");
    }

    public void displayAllNodes() {
        Node curr = head;
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }
        System.out.println("Diplaying all the nodes present in the list below:");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.nextNode;
        }
    }

    public void removeNode(int key) {
        Node currNode = head;

        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }

        while (currNode != null) {
            if (currNode.data == key) {
                if (currNode == head) {
                    head = currNode.nextNode;
                    if (head != null) {
                        head.prevNode = null;
                    }
                    System.out.println("Your requested node is removing from the head " + key);
                } else if (currNode == tail) {
                    tail = currNode.prevNode;
                    if (tail != null) {
                        tail.nextNode = null;
                    }
                    System.out.println("Your requested node is removing from the tail " + key);
                } else {
                    currNode.nextNode.prevNode = currNode.prevNode;
                    currNode.prevNode.nextNode = currNode.nextNode;
                    System.out.println("Your requested node is removed within the list " + key);
                }
                return;
            }
            currNode = currNode.nextNode;
        }
        System.out.println("OOPS! The requested node "+ key+" is not found in the list ");
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(9);
        doublyLinkedList.addNode(3);
        doublyLinkedList.addNode(6);
        doublyLinkedList.removeNode(5);
        doublyLinkedList.searchNode(9);
        doublyLinkedList.displayAllNodes();

    }
}
