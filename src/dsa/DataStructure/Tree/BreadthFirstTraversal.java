package dsa.DataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Level order/Breadth First Traversal of Binary Tree
 * */
public class BreadthFirstTraversal {

    public void breadthFirstTraversal(NodeT root){
        if(root == null) return ;
        Queue<NodeT> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            NodeT current = queue.poll();
            System.out.println("Traversed node is" + current.data);
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
}
