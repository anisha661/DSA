package dsa.DataStructure.String;

import java.util.HashSet;
import java.util.Set;
/**
 * Given a string, reverse only the vowels of string.
 * */
public class ReverseVowels {


    public String reverseVowelsOfString(String str){
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        char[] characters = str.toCharArray();
        int i = 0;
        int j = str.length() -1;
        while(i<j){
            while(i<j && !vowels.contains(characters[i])){
                i++;
            }
            while(i<j && !vowels.contains(characters[j])){
                j--;
            }

            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] =temp;
        }
        return new String(characters);
    }
}
