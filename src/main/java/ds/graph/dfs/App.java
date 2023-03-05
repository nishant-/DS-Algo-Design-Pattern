package ds.graph.dfs;

import ds.graph.common.Vertex;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");

        v1.addNeighbour(v2);
        v1.addNeighbour(v3);
        v3.addNeighbour(v4);
        v4.addNeighbour(v5);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);

        DFS dfs = new DFS();
        dfs.dfs(vertexList);


    }
}
