package dataStructures;

public class SingleLinkedList {
   class Node{
       int data;
       Node nextNodeRef;
       public Node(int data){
           this.data = data;
           this.nextNodeRef = null;
       }
   }
    public Node head;
    public Node tail;
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            tail = newNode;
        }else {
            tail.nextNodeRef = newNode;
            tail = newNode;
        }
    }

    public void searchNode(int key){
        Node curr = head;
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        while (curr!=null){
            if (curr.data==key){
                System.out.println("key is found "+ key);
            }
                curr=curr.nextNodeRef;
        }
    }

    public void displayNode(){
        Node curr= head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Displaying the list below:");
        while (curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.nextNodeRef;
        }
    }

    public void removeNode(int key){
        Node curr = head;
        Node prev = null;

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (head.data == key){
            head = head.nextNodeRef;
            System.out.println("Node is removed from head, Node: "+key);
            return;
        }

        while (curr!=null && curr.data!=key){
            prev = curr;
            curr = curr.nextNodeRef;
        }

        if (curr == null){
            System.out.println("your requested node to remove is not found in the list");
            return;
        }

        if (tail == curr){
            tail = prev;
            tail.nextNodeRef = null;
            System.out.println("Your requested node is removed from the tail: "+key);
            return;
        }
        prev.nextNodeRef=curr.nextNodeRef;
        System.out.println("Node is removed from the list "+ key);

    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addNode(4);
        singleLinkedList.addNode(7);
        singleLinkedList.addNode(5);
        singleLinkedList.addNode(10);
        singleLinkedList.searchNode(5);
        singleLinkedList.removeNode(5);
        singleLinkedList.displayNode();
    }
}
