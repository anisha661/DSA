package dsa.DataStructure.String;


/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * */
public class ValidPalindrome {


    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(left<right && Character.toLowerCase(str.charAt(left++))!=Character.toLowerCase(str.charAt(right--))){
                return false;
            }
        }
        return true;
    }
}
