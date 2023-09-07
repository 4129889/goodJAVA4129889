package xxx;

import java.io.*;

public class HK7_1 {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("..\\JavaEx-2\\Sample.txt");
		File outputFile = new File("outagain.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
 
		 int Count = 0;
	        BufferedReader buffer = new BufferedReader(in);
	        while (buffer.readLine() != null) {
	            Count++;
	        }
	        System.out.printf("%s 檔案共有%d個位元組,%.1f個字元,%d列資料\n",
	        		inputFile.getName(), inputFile.length(), inputFile.length() / 2.0, Count);
	        buffer.close();
	    
	}
}