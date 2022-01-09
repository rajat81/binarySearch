package com.google.rajatswnt;


public class ReverseLL {
    public LLNode solve(LLNode node) {
        // 1 2 3 4 5 6
        LLNode temp = node;
        LLNode last = null;
        int n  = 0;
        while (temp!=null) {
            n++;
            last = temp;
            temp = temp.next;
        }

        LLNode first = node;

        while(n > 0) {
            LLNode second = first.next;
            last.next = first;
            first = second;
            n--;
        }

        return first;
    }
}
