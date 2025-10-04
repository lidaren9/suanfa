package com.sufa.x1.sufa_tools.graph;

public class Edge {
    public int weight;
    public Node from;
    public Node to;
    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
