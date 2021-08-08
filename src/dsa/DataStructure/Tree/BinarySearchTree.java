package dsa.DataStructure.Tree;

public class BinarySearchTree {

    public static NodeT root;
    public BinarySearchTree(){
        root = null;
    }

    public NodeT insert(NodeT root, int data){
        if(root == null){
            root = new NodeT(data);
        }else if(data < root.data){
            root.left = insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

}
