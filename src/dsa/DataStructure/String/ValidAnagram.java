package dsa.DataStructure.String;

import java.util.HashMap;

/**
 * Given two string s and t , write a function to determine if t is an anagram of s
 * **/
public class ValidAnagram {

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        int[] charCount = new int[26];
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) -'a']--;
        }
        for(int c : charCount){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
