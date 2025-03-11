package Com_Rays_Collection;

import java.util.ArrayDeque;

public class TestArrayDeque {

	public static void main(String[] args) {

		ArrayDeque<Integer> q = new ArrayDeque<Integer>();

		q.offer(23);
		q.offerFirst(12);
		q.offerLast(45);
		q.offer(28);

		System.out.println(q);

		System.out.println(q.peek());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());

		System.out.println(q.poll());
		System.out.println("poll" + q);

		System.out.println(q.pollFirst());
		System.out.println("pollfirst" + q);

		System.out.println(q.pollLast());
		System.out.println("polllast" + q);

	}
}
