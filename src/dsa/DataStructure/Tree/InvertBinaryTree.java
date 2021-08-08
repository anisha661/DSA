package dsa.DataStructure.Tree;

import dsa.DataStructure.LinkedList.Node;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 * */
public class InvertBinaryTree {

    public NodeT invertBinaryTree(NodeT root){
        if(root == null) return root;

        NodeT leftNode = invertBinaryTree(root.left);
        NodeT rightNode = invertBinaryTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
}
