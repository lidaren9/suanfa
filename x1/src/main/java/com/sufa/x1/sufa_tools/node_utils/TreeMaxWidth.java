package com.sufa.x1.sufa_tools.node_utils;

import com.sufa.x1.sufa_tools.base.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMaxWidth {
    public static int getMaxWidth(Node head) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(head);
        HashMap<Node, Integer> levelMap = new HashMap<Node, Integer>();
        levelMap.put(head, 1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int maxWidth = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            Node cur = q.remove();
            int curNodeLevel = levelMap.get(cur);
            if (curNodeLevel == curLevel) {
                curLevelNodes++;
            } else {
                curLevel++;
                curLevelNodes = 1;
            }
            maxWidth = Math.max(maxWidth, curLevelNodes);
            System.out.print(cur.value + " ");
            if (cur.left != null) {
                levelMap.put(cur.left, curNodeLevel + 1);
                q.add(cur.left);
            }
            if (cur.right != null) {
                levelMap.put(cur.right, curNodeLevel + 1);
                q.add(cur.right);
            }
        }
        return maxWidth;
    }
}
