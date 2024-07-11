package Leetcode;

import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<String> l = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
             if(c=='('){
                l.push(sb.toString());
                sb.setLength(0);
             }else if(c==')'){
                sb.reverse();
                sb.insert(0,l.pop());
             }
             else{
                sb.append(c);
             }
        }
        return sb.toString();
    }
}