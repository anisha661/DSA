package dsa.DataStructure.Tree;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * **/
public class SymmetricTree {

    public boolean isSymmetric(NodeT root){
        if(root == null){
            return false;
        }

        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(NodeT left, NodeT right){
        if(left == null || right == null){
            return left == right;
        }

        if(left.data != right.data){
            return false;
        }
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}
