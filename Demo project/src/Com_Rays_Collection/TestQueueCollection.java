package Com_Rays_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueCollection {

	public static void main(String[] args) {
		// Create a Queue using LinkedList
		Queue<String> q = new LinkedList<>();
		// Add elements to the queue
		q.offer("a");
		q.offer("b");
		q.offer("c");

		// Display the elements in the queue
		System.out.println(q);
		// Remove and display the front element using poll()
		System.out.println("Removed Front element  " + q.poll());

		System.out.println(q);
		// Peek at the front element without removing it
		System.out.println("front element (peek)  " + q.peek());
		System.out.println(q);
		// Display the size of the queue
		System.out.println("sie of q " + q.size());
		System.out.println(q);
		// Check if the queue contains a specific element
		System.out.println("Queue contains  " + q.contains("b"));
		// Check if the queue contains a specific element
		System.out.println("Queue contains  " + q.element());

	}

}
