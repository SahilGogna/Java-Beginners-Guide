package binarytrees;

import java.util.Stack;

public class Q94 {

    public static BTreeNode create(Integer[] arr) {

        BTreeNode node = new BTreeNode(arr[0], null, null);
        Q86.Pair pair = new Q86.Pair(node, 1);
        Stack<Q86.Pair> stack = new Stack<>();
        stack.push(pair);
        int index = 0;

        while (stack.size() > 0) {

            Q86.Pair top = stack.peek();

            if (top.state == 1) {
                index++;
                if (arr[index] != null) {
                    top.node.left = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.left, 1);
                    stack.push(p);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                index++;
                if (arr[index] != null) {
                    top.node.right = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.right, 1);
                    stack.push(p);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                stack.pop();
            }
        }

        return node;
    }

    public static void display(BTreeNode node) {
        if (node == null) return;
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";

        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static BTreeNode leftCloned(BTreeNode node) {

        if(node == null) return null;

        BTreeNode lcR = leftCloned(node.left);
        BTreeNode rcR = leftCloned(node.right);

        BTreeNode newNode = new BTreeNode(node.data, lcR , null);
        node.left = newNode;
        node.right = rcR;

        return node;
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, null, null, 75, 62, null, null, 87, null, null};
        BTreeNode root = create(arr);
        BTreeNode newNode = leftCloned(root);
        display(newNode);
    }
}
