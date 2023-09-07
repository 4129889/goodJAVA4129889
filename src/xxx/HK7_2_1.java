package xxx;

import java.io.*;

public class HK7_2_1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 0; i < 10; i++) {
				pw.println((int)(Math.random()*10+1));
				pw.flush();
				}
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("錯誤");
		}
	}

}