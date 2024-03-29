package dsa.DataStructure.String;
/**
 * Given a string s and an integer array indices of the same length.
 *
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 * */
public class ShuffleString {

    public String shuffleString(String s, int[] indices){
        char[] str = new char[indices.length];
        for(int i = 0;i< indices.length;i++){
            str[indices[i]] = s.charAt(i);
        }
        return new String(str);
    }
}
