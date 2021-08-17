package dsa.DataStructure.Array;

/**
 * Given a sorted integer array nums and an integer target return the index position where target can be inserted if it doesn't already exist in the array
 * */
public class InsertPosition {

    public int searchInsertPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        while(left <=right){
            int mid = left +(right - left)/2;
            if(target < nums[mid]){
                right = mid -1;
            }else if (target > nums[mid]){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return left;
    }
}
