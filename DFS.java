public class DFS {
    Node root;

    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.root = new Node(0);
        tree.root.it = new Node(1);
        tree.root.rt = new Node(2);
        tree.root.it.it = new Node(3);
        tree.root.it.rt = new Node(4);
        tree.root.rt.it = new Node(5);
        tree.root.rt.rt = new Node(6);
        tree.DFS(tree.root);
    }

    public void DFS(Node root)
    {
        if(root==null)
            return;

        else{
            System.out.println(root.data+" ");
            DFS(root.it);
            DFS(root.rt);
        }
    }
}
