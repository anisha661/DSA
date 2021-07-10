package dsa.DataStructure.String;

/**
 * Given an input string write a function to return reverse of the input string
 * */
public class ReverseString {

    public String reverseStr(String str){
        char[] characters = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            char temp = characters[i];
            characters[i++]=characters[j];
            characters[j--]=temp;
        }
        return new String(characters);
    }
}
