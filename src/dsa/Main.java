package dsa;

import dsa.DataStructure.Array.DuplicatesSortedArray;
import dsa.DataStructure.Array.MaxConsecutiveOnes;

public class Main {

    public static void main(String[] args) {

        MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
        int[] nums = new int[]{1,1,1,0,0,0,1,1,0,0,1,1,1,1,0,0};
        System.out.println(m1.findMaxConsecutiveOnes(nums));

        //remove duplicates from sorted array
        DuplicatesSortedArray duplicatesSortedArray = new DuplicatesSortedArray();
        int[] nums2 = new int[]{1,2,2,3,4,4,4,5,6,6};
        System.out.println(duplicatesSortedArray.removeDuplicates(nums2));
    }
}
