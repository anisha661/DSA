package dsa.DataStructure.Tree;

public class DepthFirstTraversal {


    public void preOrder(NodeT root){
        if(root == null) return;
        System.out.println(root.data + ",");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(NodeT root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data + ",");
        inOrder(root.right);
    }

    public void postOrder(NodeT root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + ",");
    }
}
