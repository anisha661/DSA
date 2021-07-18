package dsa.DataStructure.Array;

import java.util.HashSet;
import java.util.Set;
/**
 * Given an array arr of integers,
 * check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * */
public class NAndItsDouble {

    public boolean checkIfExist(int[] arr){
        if(arr.length == 0 || arr == null)
            return false;

        Set<Integer> nums = new HashSet<>();
        for(Integer num:arr){
            if(nums.contains(num * 2) || num%2==0 && nums.contains(num/2)){
                return true;
            }
            nums.add(num);
        }
        return false;
    }
}
