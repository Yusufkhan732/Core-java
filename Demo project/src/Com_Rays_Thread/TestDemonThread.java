package Com_Rays_Thread;

public class TestDemonThread {

	public static void main(String[] args) {

		BackgroundThread b = new BackgroundThread("demon thread");

		b.setDaemon(true);

		b.start();

		for (int i = 0; i <= 50; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i + "main");

		}
	}

}