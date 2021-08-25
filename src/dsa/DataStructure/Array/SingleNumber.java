package dsa.DataStructure.Array;

import java.util.HashSet;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * */
public class SingleNumber {

    public int singleNUmber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }

        for(int i : set){
            return i;
        }

        return -1;
    }
}
