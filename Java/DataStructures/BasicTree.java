package DataStructures;

import java.util.ArrayList;
import java.util.List;

class Node {

    String data;
    List<Node> nodeList;

    public Node(String data) {
        this.data = data;
        this.nodeList = new ArrayList<>();
    }

    public void addChildNode(Node node) {
        this.nodeList.add(node);
    }

}


public class BasicTree {
    static void printTree(Node node, String indentation) {
        System.out.println(indentation + "Node Data  : "  +node.data);
        for(Node tempNode : node.nodeList) {
            printTree(tempNode, indentation + "    ");
        }
    }

    public static void main(String [] args) {

        Node rootNode = new Node("Root");

        Node child1 = new Node("Child1");
        Node child2 = new Node("Child2");

        Node grandChild1 = new Node("GrandChild1");
        Node grandChild2 = new Node("GrandChild2");

        rootNode.addChildNode(child1);
        rootNode.addChildNode(child2);

        child1.addChildNode(grandChild1);
        child2.addChildNode(grandChild2);

        printTree(rootNode, "");
    }



}
