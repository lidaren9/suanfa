package com.sufa.x1.sufa_tools.Sort;

import com.sufa.x1.sufa_tools.graph.Graph;
import com.sufa.x1.sufa_tools.graph.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologySort {
    public static List<Node> sortedTopologicalSort(Graph graph) {
        HashMap<Node, Integer> iMap = new HashMap<>();
        Queue<Node> zeroInQueue = new LinkedList<>();
        for (Node node : graph.nodes.values()) {
            iMap.put(node, node.in);
            if (node.in == 0) {
                zeroInQueue.add(node);
            }
        }
        List<Node> result = new LinkedList<>();
        while (!zeroInQueue.isEmpty()) {
            Node cur = zeroInQueue.poll();
            result.add(cur);
            for (Node next : cur.nexts) {
                iMap.put(next, iMap.get(next) - 1);
                if (iMap.get(next) == 0) {
                    zeroInQueue.add(next);
                }
            }
        }
        return result;
    }
}
