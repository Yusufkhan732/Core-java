package Com_Rays_Thread;

public class TestJoinThread {

	public static void main(String[] args) {

		JoinThread j1 = new JoinThread("abc");

		JoinThread j2 = new JoinThread("xyz");
		j1.start(); // start j1 first
		try {

			j1.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		j2.start(); // start j2 after j1 complete
	}

}
