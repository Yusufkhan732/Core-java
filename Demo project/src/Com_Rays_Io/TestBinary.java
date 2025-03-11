package Com_Rays_Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("C:\\Users\\admin\\Desktop\\io\\hello.text.YUSUF KHAN\\1760.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Desktop\\io\\cpj.jpg");

		int ch = in.read();

		while (ch != -1) {

			out.write(ch);

			ch = in.read();

		}
		out.close();
		in.close();

	}

}
