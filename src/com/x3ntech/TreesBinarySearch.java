package com.x3ntech;

public class TreesBinarySearch {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(12);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        //JSON.stringify(traverse(tree.root));

        System.out.println(tree.root);


    }
}


class BinarySearchTree {

    static class Node {

        int value;
        Node left, right;

        Node(int value){
            left = null;
            right = null;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    Node root;

    BinarySearchTree(){
        root = null;
    }

    void insert(int value) {
        Node newNode = new Node(value);
        if(root == null)
            root = newNode;
        else {
            Node currentNode = root;
            while (true) {
                if(value < currentNode.value) {
                    //left
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    currentNode = currentNode.left;

                } else {
                    if(currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    void lookup(int value){
        //Code here
    }
    // remove
}


