package ds.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Vertex v1 = new Vertex("One");
        Vertex v2 = new Vertex("Two");
        Vertex v3 = new Vertex("Three");
        Vertex v4 = new Vertex("Four");
        Vertex v5 = new Vertex("Five");

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
