package filepack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter(".\\files\\demo1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 1; i <= 50; i++) {
				bw.write(i+",tester");
				bw.newLine();
			}
			bw.write("Manoj,Sirkali,Mayiladudhurai,609109,India");
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Achieved");
		}
	}
}
