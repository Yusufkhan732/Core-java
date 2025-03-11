import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestSplit {

	public static void main(String[] args) throws Exception {

		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\io\\sop.txt"))) {

			String[] lines = new String[10];
			int count = 0;

			for (int i = 0; i < 10; i++) {
				lines[i] = reader.readLine();
				if (lines[i] == null) {
					System.out.println("the file must have at least 10 times");
					return;

				}
			}
			for (int i = 0; i < 5; i++) {
				String file = "C:\\Users\\admin\\Desktop\\io\\sop.txt" + i + 1 + ".txt";
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
					writer.write(lines[i * 2] + "\n");
					writer.write(lines[i * 2] + "\n");

				}
				System.out.println(file);

			}

		}
	}
}
