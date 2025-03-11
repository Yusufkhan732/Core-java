package Com_Rays_Io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\admin\\Desktop\\io\\how are you.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello bhai");
		out.println("kkrh");

		out.close();

		file.close();

		System.out.println("data write Successfully.....!!!");
	}

}
