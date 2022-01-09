package com.google.rajatswnt;
import java.util.*;

public class LongestBalancedSubsequence {

    public int solve(String s) {
        int ans = Integer.MIN_VALUE;


        return ans;
    }

    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()) {
            if(c == '(') stack.push(c);
            if(c == ')') stack.pop();
        }
        return stack.isEmpty();
    }
}
