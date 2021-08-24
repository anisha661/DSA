package dsa.DataStructure.String;

import java.util.Arrays;

//Given two string num1 and num2 multiply the given string and return the result as a string
public class MultiplyString {

    public String multiplyString(String num1,String num2){
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int n1=chars1.length, n2=chars2.length;
        char[] result = new char[n1+n2];
        Arrays.fill(result,'0');

        for(int j=n2-1;j>=0;j--){
            for(int i=n1-1;i>=0;i--){
                int product = (chars1[i] - '0')*(chars2[j]-'0');
                int temp = result[i+j+1]-'0' + product;
                result[i+j+1] = (char) (temp%10 + '0');
                result[i+j] = (char) ((result[i+j]-'0') + temp/10 + '0');
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean seen = false;
        for(char c: result){
            if( c == '0' && !seen) continue;;
            sb.append(c);
            seen=true;
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
