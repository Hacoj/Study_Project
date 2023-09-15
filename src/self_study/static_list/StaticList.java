package self_study.static_list;

public class StaticList {

    private static final int MAX_SIZE = 1000;
    public Node[] nodes = new Node[MAX_SIZE];

    public boolean initList(Node head) {
        for (int i = 0; i < MAX_SIZE - 1; i++) {
            nodes[i].cur = i + 1;
        }

        nodes[MAX_SIZE - 1].cur = 0;
        return true;
    }

    public int mallocSpace(){
        int i = nodes[0].cur;
        if(i != 0){
            nodes[0].cur = nodes[i].cur;
        }
        return i;
    }

    public boolean freeSpace(int k){
        nodes[k].cur = nodes[0].cur;
        nodes[0].cur = k;

        return true;
    }

    public boolean insert(int val, int position) {
        Node temp = nodes[0];
        for(int i = 0; i< position - 1; i++){
            temp = nodes[temp.cur];
        }

        int space = mallocSpace();

        nodes[space] = new Node(val,temp.cur);
        temp.cur = nodes[space].cur;

        return true;
    }
}



