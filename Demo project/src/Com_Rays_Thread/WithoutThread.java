package Com_Rays_Thread;

public class WithoutThread {

	String name = null;

	public WithoutThread(String name) {
		this.name = name;

	}

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " = " + name);

		}
	}
}
