import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {

    private class Node {
        private String label;

        public Node(String label){
            this.label = label;
        }

        @Override
        public String toString(){
            return label;
        }
    }

    private class Edge {
        private Node from;
        private Node to;
        private int weight;

        public Edge(Node from, Node to, int weight){
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString(){
            return from + "->" + to;
        }

    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edge>> adjacencyList = new HashMap<>();
    //private Map<Graph.Node, List<Graph.Node>> adjacencyList = new HashMap<>();

    public void  addNode(String label){
        var node = new Node(label);
        nodes.putIfAbsent(label , node);
        adjacencyList.putIfAbsent(node , new ArrayList<>());

    }

    public void  addEdge(String from , String to, int weight){
        var fromNode = nodes.get(from);
        if(fromNode == null)
            throw new IllegalArgumentException();

        var toNode = nodes.get(to);

        if(toNode == null)
            throw new IllegalArgumentException();

        //adding a weight to both to and from edges of the undirected graph.
        adjacencyList.get(fromNode).add(new Edge(fromNode, toNode , weight));

        adjacencyList.get(toNode).add(new Edge(toNode, fromNode, weight));
    }

    public void print() {

        for(var source: adjacencyList.keySet()){
            var targets = adjacencyList.get(source);

            if(!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);

        }

    }




}
