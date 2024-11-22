package dataStructures;

import com.sun.source.tree.BreakTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

    static class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;

            if(nodes[index] == -1){
                return  null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.leftChild = buildTree(nodes);
            newNode.rightChild = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.leftChild);
        System.out.print(root.data+" ");
        inOrderTraversal(root.rightChild);
    }

    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.data+" ");
    }

    public static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root == null){
            return;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.leftChild != null){
                    q.add(currNode.leftChild);
                }
                if(currNode.rightChild != null){
                    q.add(currNode.rightChild);
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
//        preOrderTraversal(root);
//        inOrderTraversal(root);
        levelOrderTraversal(root);
    }
}


