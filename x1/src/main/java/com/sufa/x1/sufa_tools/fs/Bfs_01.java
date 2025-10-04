package com.sufa.x1.sufa_tools.fs;

import com.sufa.x1.sufa_tools.graph.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs_01 {
    public static void bsf(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.value);
            for (Node n : cur.nexts) {
                if (!set.contains(n)) {
                    set.add(n);
                    queue.add(n);
                }
            }
        }
    }
}
