package dsa.DataStructure.Array;

import java.util.HashMap;
/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * */
public class TwoSum {

    public int[] twoSums(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0;i< nums.length;i++){
            int operand = target -nums[i];
            if(map.containsKey(operand)){
                return new int[]{operand,i};
            }else{
                map.put(nums[i],i);
            }
        }
        return  new int[]{};
    }
}
