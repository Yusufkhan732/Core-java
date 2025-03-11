package Com_Rays_Io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLine {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\admin\\Desktop\\io\\how are you.txt");

		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();

		}
		in.close();
		file.close();
	}

}
