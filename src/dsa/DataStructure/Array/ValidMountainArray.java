package dsa.DataStructure.Array;
/**
 *
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * arr is a mountain array if and only if:
 *  arr.length >= 3
*   There exists some i with 0 < i < arr.length - 1 such that:
*       arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
*       arr[i] > arr[i + 1] > ... > arr[arr.length - 1]*/
public class ValidMountainArray {

    public boolean isValidMountainArray(int[] arr){
        int i = 0;
        int length = arr.length -1;
        while(i<length && arr[i]<arr[i+1])
            i++;
        if(i==0 || i==length)
            return false;
        while(i<length && arr[i]>arr[i+1])
            i++;
        return i==length;
    }
}
