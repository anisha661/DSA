package dsa.DataStructure.Tree;
public class NodeT {

    public int data;
    public NodeT left;
    public NodeT right;

    public NodeT(int data){
        this.data = data;
        this.left=this.right=null;
    }

    public NodeT(int data,NodeT left, NodeT right){
        this.data = data;
        this.left=left;
        this.right=right;
    }
}
