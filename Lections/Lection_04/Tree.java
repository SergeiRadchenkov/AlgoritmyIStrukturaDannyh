package Lections.Lection_04;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public boolean exists(int value) {
        if (root != null) {
            Node node = find1(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    private Node find1(Node node, int value) {  // Проход в глубину
        if (node.value == value) {
            return node;
        } else {
            for (Node child: node.choldren) {
                Node result = find1(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    private Node find1(int value) {  // Проход в широту
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextline = new ArrayList<>();
            for (Node node: line) {
                if (node.value == value) {
                    return node;
                }
                nextline.addAll(node.choldren);
            }
            line = nextline;
        }
        return null;
    }

    public class Node {
        int value;
        List<Node> choldren;
    }
}
