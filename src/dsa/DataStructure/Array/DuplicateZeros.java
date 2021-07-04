package dsa.DataStructure.Array;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Elements beyond the length of the original array are not written.
 * */
public class DuplicateZeros {

    public void duplicateZeroOccurrence(int[] arr){
        int possibleZeroDup = 0;
        int arrLen = arr.length - 1;

        //Counting no of zeros to be duplicated
        for(int i =0;i<arrLen - possibleZeroDup ;i++){
            if(arr[i] == 0){
                //Considering the edge case,this zero wont be duplicated as i here is pointing to the last element which could be included in arr
                if(i ==  arrLen - possibleZeroDup){
                    arr[arrLen] = 0;
                    arrLen-=1;
                    break;
                }
                possibleZeroDup++;
            }
        }
        int lastIndex = arrLen-possibleZeroDup;
        for(int j = lastIndex;j>=0;j--){
            //Copying zero occurrence twice and non-zero once
            if(arr[j] == 0){
                arr[j+possibleZeroDup] = 0;
                possibleZeroDup--;
                arr[j+possibleZeroDup]=0;
            }else{
                arr[j+possibleZeroDup] = arr[j];
            }
        }
    }
}
