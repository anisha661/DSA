package dsa.DataStructure.Array;

/**
 * Given a binary array,find the maximum number of consecutive 1s in the array if you can flip at most one 0
 * */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] arr){
        int max = 0;
        int start = 0;
        int zeroCounter = 0;
        int k = 1; //k here is the max no of 0 you can flip
        for(int end = 0; end< arr.length;end++){
             if(arr[end] == 0){
                 zeroCounter++;
             }
             while(zeroCounter > k){
                 if(arr[start] == 0){
                     zeroCounter--;
                 }
                 start++;
             }
             max = Math.max(max, end-start+1);
         }
        return max;

    }
}

