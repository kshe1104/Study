import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Node root;

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(0);
        tree.root.it = new Node(1);
        tree.root.rt = new Node(2);
        tree.root.it.it = new Node(3);
        tree.root.it.rt = new Node(4);
        tree.root.rt.it = new Node(5);
        tree.root.rt.rt = new Node(6);
        tree.BFS(tree.root);
    }

    public void BFS(Node root){
        Queue<Node> Q  = new LinkedList<>();
        Q.offer(root);
        int L =0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.printf(L+" : ");
            for(int i=0;i<len;++i){
                Node current = Q.poll();
                System.out.printf(current.data+" ");
                if (current.it != null) {
                    Q.offer(current.it);
                }
                if(current.rt!=null){
                    Q.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }
}
