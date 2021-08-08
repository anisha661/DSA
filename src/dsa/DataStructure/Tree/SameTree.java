package dsa.DataStructure.Tree;

public class SameTree {

    public boolean isSameTree(NodeT tree1, NodeT tree2){
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 == null) return false;
        if(tree1.data != tree2.data) return false;
        return isSameTree(tree1.left, tree2.right);
    }
}
