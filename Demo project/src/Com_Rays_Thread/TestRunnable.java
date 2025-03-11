package Com_Rays_Thread;

public class TestRunnable {

	public static void main(String[] args) {

		Thread t = new Thread(new ByRunnable("abc"));

		Thread t1 = new Thread(new ByRunnable("xyz"));
		t1.start();
		t.start();
	}
}
