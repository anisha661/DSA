package dsa.DataStructure.String;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s){
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> characters = new HashSet<>();

        while(j< s.length()){
            if(!characters.contains(s.charAt(j))){
                characters.add(s.charAt(j));
                j++;
                max = Math.max(characters.size(), max);
            }else{
                characters.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
