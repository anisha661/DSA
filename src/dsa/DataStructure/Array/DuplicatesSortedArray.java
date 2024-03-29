package dsa.DataStructure.Array;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
 * element appears only once. The relative order of the elements should be kept the same.
 * */
public class DuplicatesSortedArray {

    public int removeDuplicates(int[] nums){
        if(nums.length == 0)
            return 0;
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
