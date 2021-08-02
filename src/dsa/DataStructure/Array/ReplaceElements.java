package dsa.DataStructure.Array;
/**
 * Replace Elements with Greatest Element on Right Side
 * */
public class ReplaceElements {

    public int[] replaceElements(int[] arr) {
        int maxVal = -1;
        int len = arr.length -1;
        for(int i =len ;i>=0;i--){
            int temp = arr[i];
            arr[i] = maxVal;
            maxVal = Math.max(maxVal,temp);
        }
        return arr;
    }
}
