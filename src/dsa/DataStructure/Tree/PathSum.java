package dsa.DataStructure.Tree;

/**
 * Given the root of a binary tree and an integer target, return true if the tree has a root-to-leaf
 * path such that adding up all the values along the path equals targetSum.
 * */
public class PathSum {

    public boolean hasPathSum(NodeT root, int target){
        if(root == null){
            return false;
        }else if(root.left ==null && root.right == null && target - root.data == 0){
            return true;
        }else{
            return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target- root.data);
        }
    }
}
