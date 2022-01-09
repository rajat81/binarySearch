package com.google.rajatswnt;

import java.util.*;

public class MinWindowSubstring {

    public int solve(String a, String b) {
        int i = 0;
        int j = b.length()-1;
        int minLength = Integer.MAX_VALUE;
        while(i < a.length() && j <a.length()) {
            if(isValid(a.substring(i, j+1), b)) {
                while(isValid(a.substring(i, j+1), b)) {
                    i++;
                }
                minLength = Integer.min(minLength, j-i+1);
            }
            j++;
        }

        return minLength;
    }

    public boolean isValid(String a,  String b) {
        HashMap<Character,Integer> ha = new HashMap<>();
        HashMap<Character,Integer> hb = new HashMap<>();

        for(char c:a.toCharArray()) {
            if(ha.containsKey(c)) {
                ha.put(c, ha.get(c) + 1);
            } else ha.put(c, 1);
        }

        for(char c:b.toCharArray()) {
            if(hb.containsKey(c)) {
                hb.put(c, hb.get(c) + 1);
            } else hb.put(c, 1);
        }

        for(char c: hb.keySet()) {
            if(ha.getOrDefault(c, -1) < hb.get(c)) return false;
        }
        return true;
    }

}
