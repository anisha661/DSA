package dsa.DataStructure.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array of integers where 1<a[i]<n(n=size of array) some elements appear twice and some appear once
 *
 * Find all numbers inclusive of [1,n] that do not appear in the array
 * */
public class DisappearedNumbers {

    public List<Integer> findMissingNumbers(int[] nums){
        List<Integer> missingNums = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<>();
        for(int n : nums){
            numbers.add(n);
        }

        for(int i =0;i<=nums.length;i++){
            if(!numbers.contains(i)){
                missingNums.add(i);
            }
        }
        return missingNums;
    }
}
