package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Integer>> adjList;
    int size;

    Graph(int n) {
        size = n;
        adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int start) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[size];
        queue.addLast(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.removeFirst();
            System.out.print(currentNode + ", ");
            for (int node: adjList.get(currentNode)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.addLast(node);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[size];
        stack.addLast(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int currentNode = stack.removeLast();
            System.out.print(currentNode + ", ");
            for (int node: adjList.get(currentNode)) {
                if (!visited[node]) {
                    stack.addLast(node);
                    visited[node] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        graph.bfs(0);
        graph.dfs(0);
    }
}
