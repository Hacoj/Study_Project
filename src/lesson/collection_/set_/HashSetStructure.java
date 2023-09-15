package lesson.collection_.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] table = new Node[16];

        System.out.println(table);

        table[2] = new Node("Shen");
        Node chen = new Node("Chen");
        table[2].next = chen;
        Node de = new Node("de");
        chen.next = de;
        System.out.println(table);
    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}