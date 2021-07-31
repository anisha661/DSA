package dsa.Maths;

import java.util.HashSet;
/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 *     Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *     Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 *     Those numbers for which this process ends in 1 are happy.
 *
 * Return true if n is a happy number, and false if not.
 * */
public class HappyNumber {

    public boolean isHappy(int n ){
        HashSet<Integer> seenNumber = new HashSet<>();
        while(n !=1){
            int currentNum = n;
            int sum = 0;
            while(currentNum != 0){
                sum += (currentNum % 10) * (currentNum % 10);
                currentNum/=10;
            }
            if(seenNumber.contains(sum)){
                return false;
            }

            seenNumber.add(sum);
            n = sum;
        }
        return true;
    }
}
