package dsa.DataStructure.Stack;

import java.util.Stack;

/**
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if open brackets is closed by same type of bracket and in same order
* */
public class ValidParenthesis {

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if( c == '(' || c == '{' || c =='['){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c=='}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c==']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
