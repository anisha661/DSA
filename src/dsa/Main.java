package dsa;

import dsa.DataStructure.Array.MaxConsecutiveOnes;

public class Main {

    public static void main(String[] args) {

        MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
        int[] nums = new int[]{1,1,1,0,0,0,1,1,0,0,1,1,1,1,0,0};
        System.out.println(m1.findMaxConsecutiveOnes(nums));
    }
}
