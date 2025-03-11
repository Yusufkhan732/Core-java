package Com_Rays_Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue(Comparator.reverseOrder());
		q.offer(12);
		q.offer(23);
		q.offer(11);
		q.offer(33);

		System.out.println(q);

		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
	}

}
