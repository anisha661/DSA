package dsa.DataStructure.Tree;

/**
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 *
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 * */
public class Subtree {

    public boolean isSubtree(NodeT root, NodeT subroot){
        if(root == null){
            return false;
        }else if(isSameTree(root,subroot)){
            return true;
        }else{
            return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
        }
    }

    public boolean isSameTree(NodeT root, NodeT subroot){
        if(root == null || subroot == null){
            return root == null && subroot == null;
        }else if(root.data == subroot.data){
            return isSameTree(root.left,subroot.left) && isSameTree(root.right,subroot.right);
        }else{
            return false;
        }
    }
}
