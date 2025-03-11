package Com_Rays_Io;

import java.io.FileReader;

public class ReadCharByChar {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\admin\\Desktop\\io\\how are you.txt");

		int ch = in.read();

		while (ch != -1) {

			System.out.println((char) ch);

			ch = in.read();

		}

	}

}
