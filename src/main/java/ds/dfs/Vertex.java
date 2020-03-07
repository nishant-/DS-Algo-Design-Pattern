package ds.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name; //strings on vertices
    private boolean visited; //whether given vertex is visited or not
    private List<Vertex> neighbourList; //adjacent vertices list

    public Vertex(String name) {
        this.name = name;
        this.neighbourList = new ArrayList<>(); // a new vertex initially has no neighbours
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
