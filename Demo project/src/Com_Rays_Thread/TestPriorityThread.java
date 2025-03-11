package Com_Rays_Thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread p1 = new PriorityThread("abc");
		PriorityThread p2 = new PriorityThread("xyz");

		// set thread priorities

		p1.setPriority(10); // maximum priority
		p2.setPriority(1); // minimum priority

		p1.start();
		p2.start();
	}
}
