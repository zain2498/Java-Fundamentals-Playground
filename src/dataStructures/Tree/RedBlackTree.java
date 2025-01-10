package dataStructures.Tree;

public class RedBlackTree {

    class Node{
        int data;
        Node left;
        Node right;
        Node parent;
        boolean isRed;

        public void Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
            this.parent = null;
            isRed=true; //for every insertion the color should be red
        }
    }
    private Node root;

    public void RedBlackTree(){
        root = null;
    }

    private void rotateLeftChild(Node node){
        Node rightChild = node.right;
        node.right = rightChild.left;

        if(rightChild.left != null){
            rightChild.left.parent = node;
        }
        rightChild.parent = node.parent;
        if(node.parent == null){
            root = rightChild;
        } else if (node == node.parent.left) {
            node.parent.left = rightChild;
        }else {
            node.parent.right = rightChild;
        }
        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rotateRightChild(Node node){
        Node leftChild = node.left;
        node.left = leftChild.right;

        if(leftChild.right != null){
            leftChild.right.parent = node;
        }
        leftChild.parent = node.parent;
        if (node.parent == null){
            root = leftChild;
        }else if (node.parent.right == node){
            node.parent.right = leftChild;
        }else {
            node.parent.right = leftChild;
        }
        leftChild.right = node;
        node.parent = leftChild;
    }

    private void fixInsert(Node node){
        while (node.parent !=null && node.parent.isRed){
            Node grandParent = node.parent.parent;
            if(grandParent.left == node.parent){
                Node uncle = grandParent.right;
                if (uncle != null && uncle.isRed){
                    grandParent.isRed = true;
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node = grandParent;
                }else {
                    if (node == node.parent.right){

                    }
                }
            }
        }
    }
}
