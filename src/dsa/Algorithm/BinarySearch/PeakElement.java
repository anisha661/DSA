package dsa.Algorithm.BinarySearch;

/**
 * Given an integer array nums return the index of the peak element in the array.
 * A peak element is the one which is greater than its neighbor element .
 *
 * If there are multiple peak elements, you can return index of anyone.
 * **/
public class PeakElement {


    public int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
