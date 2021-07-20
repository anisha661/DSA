package dsa.DataStructure.Array;

import java.util.ArrayList;
import java.util.List;
/**
 * Given an array target and an integer n. In each iteration, you will read a number from  list = {1,2,3..., n}.
 *
 * Build the target array using the following operations:
 *
 *     Push: Read a new element from the beginning list, and push it in the array.
 *     Pop: delete the last element of the array.
 *     If the target array is already built, stop reading more elements.
 *
 * Return the operations to build the target array. You are guaranteed that the answer is unique.
 * */
public class ArrayWithStackOperation {

    private static final String PUSH = "Push";
    private static final String POP = "Pop";
    public List<String> buildArray(int[] target, int n){
        List<String> list = new ArrayList<>();

        int j = 1;
        for(int i=0;i<target.length;){
            if(target[i] == j){
                list.add(PUSH);
                i++;
                j++;
            }else{
                list.add(PUSH);
                list.add(POP);
                j++;
            }
        }
        return list;

//        int preTarget = 0;
//        for(int item : target){
//            list.add(PUSH);
//
//            int diff = item - preTarget;
//            while(diff !=1){
//                for(int i =0;i<diff-1;i++){
//                    list.add(POP);
//                    list.add(PUSH);
//                }
//            }
//            preTarget = item;
//        }
//        return list;
    }
}
