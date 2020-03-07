package ds.dfs;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> vertexStack;

    public DFS() {
        this.vertexStack = new Stack<>();
    }

    public void dfs(List<Vertex> vertices) {
        for(Vertex v : vertices) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex rootNode) {

        this.vertexStack.add(rootNode);
        rootNode.setVisited(true);

        while(!vertexStack.isEmpty()) {

            Vertex actualVertex = this.vertexStack.pop();
            System.out.print(actualVertex+" ");

            //now visit the neighbours of this vertex

            for(Vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.vertexStack.push(v);
                }
            }
        }
    }
}
