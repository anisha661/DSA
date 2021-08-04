package dsa.DataStructure.Tree;

public class CheckForBST {

    public boolean isBST(NodeT root){
        return helper(root, null, null);
    }

    public boolean helper(NodeT root, Integer min, Integer max){
        if(root == null) {
            return true;
        }
        else if(min !=null && root.data < min || max!=null && root.data > max ){
            return false;
        }else{
            return helper(root.left, min, root.data) && helper(root.right, root.data,max);
        }
    }
}
