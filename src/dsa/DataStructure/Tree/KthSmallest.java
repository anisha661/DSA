package dsa.DataStructure.Tree;

/**
 * Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest element in the tree.
 * */
public class KthSmallest {

    public int findKthSmallestFromBST(NodeT root, int k){
        int[] nums = new int[2];
        inOrder(root,nums,k);
        return nums[1];
    }

    public void inOrder(NodeT root, int[] nums, int k){
        if(root == null) return;
        inOrder(root.left, nums,k);
        if(++nums[0] == k){
            nums[1] = root.data;
            return;
        }
        inOrder(root.right, nums,k);
    }
}
