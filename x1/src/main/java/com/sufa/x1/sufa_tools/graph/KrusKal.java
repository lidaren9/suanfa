package com.sufa.x1.sufa_tools.graph;

import java.util.*;

public class KrusKal {

    public static class MySets {
        public HashMap<Node, List<Node>> setMap;

        public MySets(List<Node> nodes) {
            for (Node node : nodes) {
                List<Node> list = new ArrayList<>();
                list.add(node);
                setMap.put(node, list);
            }
        }

        public boolean isSameSet(Node from, Node to) {
            List<Node> fromList = setMap.get(from);
            List<Node> toList = setMap.get(to);
            return fromList == toList;
        }

        public void union(Node from, Node to) {
            List<Node> fromList = setMap.get(from);
            List<Node> toList = setMap.get(to);

            for (Node node : toList) {
                fromList.add(node);
                setMap.put(node, fromList);
            }
        }

    }

    public static Set<Edge> kruskalMST(Graph graph) {
        MySets mySets = new MySets(graph.nodes.values().stream().toList());
        PriorityQueue<Edge> pq = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.weight - e2.weight;
            }
        });
        for (Edge edge : graph.edges) {
            pq.add(edge);
        }
        Set<Edge> result = new HashSet<>();
        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            if (!mySets.isSameSet(edge.from, edge.to)) {
                result.add(edge);
                mySets.union(edge.from, edge.to);
            }
        }
        return result;
    }
}
