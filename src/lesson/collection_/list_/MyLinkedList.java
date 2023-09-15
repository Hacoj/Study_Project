package lesson.collection_.list_;

class Node{
    public  Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node("Shen");
        Node node2 = new Node("Chen");
        Node node3 = new Node("De");
        Node node4 = new Node("Wan");
        Node node5 = new Node("Jia");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.pre = node1;
        node3.pre = node2;
        node4.pre = node3;
        node5.pre = node4;

        Node nodeList = node1;

        while (true) {
            if (nodeList == null) {
                break;
            }

            System.out.println(nodeList);
            nodeList = nodeList.next;
        }

        Node node_insert = new Node("Shuai");
        node3.next = node_insert;
        node4.pre = node_insert;

        node_insert.next = node4;
        node_insert.pre = node3;

        nodeList = node1;
        while (true) {
            if (nodeList == null) {
                break;
            }

            System.out.println(nodeList);
            nodeList = nodeList.next;
        }
    }
}

