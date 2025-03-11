package Com_Rays_Thread;

public class TestWithoutThread {
	public static void main(String[] args) {

		WithoutThread t = new WithoutThread("abc");
		WithoutThread t1 = new WithoutThread("xyz");
		t1.run();
		t.run();
	}
}
