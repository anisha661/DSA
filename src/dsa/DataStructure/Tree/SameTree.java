package dsa.DataStructure.Tree;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * */
public class SameTree {

    public boolean isSameTree(NodeT tree1, NodeT tree2){
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 == null) return false;
        if(tree1.data != tree2.data) return false;
        return isSameTree(tree1.left, tree2.right);
    }
}
