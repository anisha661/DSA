package dsa.DataStructure.Tree;
/**
 * Binary Search Tree Implementation
 * */
public class BinarySearchTree {

    public static NodeT root;
    public BinarySearchTree(){
        root = null;
    }

    //Insertion
    public void insert(int data){
        insertData(root,data);
    }
    public NodeT insertData(NodeT root,int data){
        if(root == null){
            root = new NodeT(data);
        }else if(data < root.data){
            root.left = insertData(root.left,data);
        }else{
            root.right=insertData(root.right,data);
        }
        return root;
    }

    //Find minimum in the tree
    public NodeT findMin(NodeT root){
        if(root.left == null)
            return root;
        return findMin(root.left);
    }

    //Deletion
    public NodeT delete(NodeT root, int value){
        if(root == null){
            return root;
        }else{
            if(value < root.data){
                root.left = delete(root.left,value);
            }else if(value > root.data){
                root.right = delete(root.right,value);
            }else{
                //Case 1: Node to be deleted is a leaf node
                if(root.left == null || root.right == null){
                    root = null;
                }
                //Case2: Node to be deleted has at most one child
                //and has only one right child
                else if(root.left == null){
                    root=root.right;
                }
                //Node has only left child
                else if(root.right == null){
                    root=root.left;
                }
                //Case 3: Node to be deleted has two children
                else{
                    NodeT min = findMin(root.right);
                    root.data = min.data;
                    root.right = delete(root.right,min.data);
                }
            }
            return root;
        }
    }

    //Search
    public NodeT Search(NodeT root, int value){
        if(root==null || root.data == value){
            return root;
        }else if(root.data<value){
            return Search(root.right, value);
        }else{
            return Search(root.left,value);
        }
    }

}
