package dsa.Algorithm.BinarySearch;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 * */
public class SearchFirstAndLast {

    public int[] findLastAndFirstPosition(int[] nums, int target){
         int[] result = new int[2];
         result[0] = startIndex(nums,target);
         result[1] = lastIndex(nums,target);
         return result;
    }

    public int startIndex(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid-1;
            }else{
                left = mid + 1;
            }
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

    public int lastIndex(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] <= target){
                left = mid+1;
            }else{
                right = mid-1;
            }
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }
}
