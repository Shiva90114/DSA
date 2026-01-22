// Queue
//
// General Code
import java.util.*;

class QueueDemo{

	public static void main(String[] args){

	Queue<Integer> que = new LinkedList<Integer>();

	que.offer(10);
        que.offer(20);
	que.offer(30);
	que.offer(40);

	System.out.println(que);

	System.out.println(que.peek());

	que.poll();
	System.out.println(que);


	}
}
