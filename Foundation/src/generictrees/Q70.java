package generictrees;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class Q70 {

    public static Node formGenericTree(int[] arr) {
        Node root = new Node();
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node node = new Node();
                node.data = arr[i];

                if (stack.size() > 0) {
                    stack.peek().children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);
            }
        }
        return root;
    }

    public static void levelOrderTraversal(Node node){
        Queue<Node> parentQueue = new ArrayDeque<>();
        Queue<Node> childQueue = new ArrayDeque<>();

        parentQueue.add(node);

        while(parentQueue.size() > 0 ){
            Node parent = parentQueue.remove();
            System.out.print(parent.data +"\t");
            for(Node child: parent.children){
                childQueue.add(child);
            }
            if(parentQueue.size() == 0){
                parentQueue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();

            }
        }
    }

    public static void mirror(Node node){
        for(Node child: node.children){
            mirror(child);
        }
        Collections.reverse(node.children);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        mirror(root);
        levelOrderTraversal(root);
    }
}
