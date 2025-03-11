package Com_Rays_Thread;

public class TestThread {

	public static void main(String[] args) {

		WithThread t = new WithThread("abc");

		WithThread t1 = new WithThread("xyz");
		
		
		t.start();
		t1.start();
	}

}
