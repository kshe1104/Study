import java.util.LinkedList;
import java.util.Queue;

public class algorithm {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.poll(); //빼기
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.poll(); //빼기
    }
}

class Node{
    int data;
    Node it,rt; //it는 왼쪽 노드 rt는 오른쪽 노드
    public Node(int val){
        data = val;
        it = null;
        rt = null;
    }
}

