package xxx;

import java.io.*;

public class HK7 {
	public static void main(String[] args) throws IOException {// 問題:1.何時用flush 2.第一列多算1字元 3.525字元1426byte 4.空白烈也算資料列
		File inputFile = new File("..\\JavaEx-2\\Sample.txt");
		File outputFile = new File("Sample.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		int c = 0;
		int line = 0;
		String data;

		while ((data = br.readLine()) != null) {
			out.write(data);
			bw.newLine();
			bw.flush();
			if (data != "")
				line++;
			System.out.println("第" + line + "行");
			System.out.flush();
			c += data.length();
			System.out.println(data.length() + "字元");
			System.out.println(c + "字元總數量");
			System.out.println(data + "data");

		}

		System.out.println(
				inputFile.getName() + "檔案共有" + inputFile.length() + "個位元組(byte)，" + c + "個字元(char)，" + line + "列資料");

	}
}