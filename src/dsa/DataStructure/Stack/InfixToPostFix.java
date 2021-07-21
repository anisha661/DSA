package dsa.DataStructure.Stack;

import java.util.Stack;

public class InfixToPostFix {

    public int checkPrecision(char c){
        switch(c){
            case '-':
            case '+':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public String postfixConversion(String exp){
        Stack<Character> stack = new Stack<>();
        String finalExp = new String("");
        for(int i =0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                finalExp+=c;
            }else if(c == '('){
                stack.push(c);
            }else if (c == ')') {
                while(!stack.isEmpty() && stack.peek()!='(')
                    finalExp+=stack.pop();
                    stack.pop();

            }else {
                while(!stack.isEmpty() && checkPrecision(c) <= checkPrecision(stack.peek())){
                    finalExp+=stack.pop();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid expression";
            finalExp+=stack.pop();
        }
        return finalExp;

    }
}
