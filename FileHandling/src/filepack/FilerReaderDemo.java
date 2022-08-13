package filepack;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilerReaderDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader(".\\files\\demo1.txt");
		BufferedReader br = new BufferedReader(fr);
		String content;
		
		while (( content=br.readLine() ) != null) {
			System.out.println(content);
		}
	
			br.close();
		}
		

	}


