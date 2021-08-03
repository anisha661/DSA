package dsa.DataStructure.Tree;

public class HeightOfBinaryTree {

    public int findHeight(NodeT root){
        if(root == null)
            return -1;
        return Math.max(findHeight(root.left),findHeight(root.right)) + 1;
    }
}
