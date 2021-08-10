package dsa.DataStructure.Tree;

public class MergeTree {

    public NodeT mergeTwoTree(NodeT T1, NodeT T2){
        if(T1 == null){
            return T2;
        }
        if(T2 == null){
            return T1;
        }
        T1.data+=T2.data;
        T1.left = mergeTwoTree(T1.left,T2.left);
        T1.right = mergeTwoTree(T1.right,T2.right);
        return  T1;
    }
}
