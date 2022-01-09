package com.google.rajatswnt;
import java.util.*;

public class LevelOrderTraversal {

    public int[] solve(Tree root) {
        Queue<Tree> q = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i< size; i++) {
                Tree element = q.remove();
                list.add(element.val);
                if(element.left!=null) q.add(element.left);
                if(element.right!=null) q.add(element.right);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
