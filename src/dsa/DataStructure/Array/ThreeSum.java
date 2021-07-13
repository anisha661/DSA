package dsa.DataStructure.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 * */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> resultArr = new LinkedList<>();

        for(int i=0;i<nums.length -1;i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int left = i+1;
                int right = nums.length -1;
                int sum = 0-nums[i];
                while(left<right){
                    if(nums[left]+nums[right] == sum){
                        resultArr.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left] == nums[i]) left++;
                        while(left<right && nums[i]==nums[right]) right--;
                        left++;
                        right--;
                    }else if(nums[left] +nums[right] > sum){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return resultArr;
    }
}
