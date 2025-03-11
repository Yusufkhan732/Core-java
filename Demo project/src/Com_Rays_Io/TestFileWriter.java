package Com_Rays_Io;

import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {

		FileWriter out = new FileWriter("C:\\Users\\admin\\Desktop\\io\\how are you.txt");

		out.write("hello\n");

		out.write("how are you");
		
		out.write("i am good");
		

		out.close();
	}
}
