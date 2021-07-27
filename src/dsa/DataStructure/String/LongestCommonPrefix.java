package dsa.DataStructure.String;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * */
public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {

        //Horizontal Scanning
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i =1; i< strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;


        //Vertical Scanning
        /**
         String prefix = "";
         if(strs.length  == 0 || strs == null) return "";

         int index = 0;
         for(char c: strs[0].toCharArray()){
         for(int i = 1; i<strs.length;i++){
         if(index == strs[i].length() || c != strs[i].charAt(index)){
         return prefix;
         }
         }
         prefix+=c;
         index++;
         }
         return prefix;
         **/
    }
}
