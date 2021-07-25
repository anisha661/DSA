package dsa.DataStructure.String;

import java.util.HashMap;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * */
public class FirstUniqueCharacter {

    public int findFirstUniqueCharacter(String s){

        //Hashmap to put the character and the number of occurrence of the character
        HashMap<Character,Integer> characters = new HashMap<Character,Integer>();
        for(int i =0;i <s.length();i++){
            char c = s.charAt(i);
            characters.put(c, characters.getOrDefault(c,0)+1);
        }

        for(int i =0;i<s.length();i++){
            if(characters.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;

    }
}
