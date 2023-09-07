package xxx;

import java.io.*;
import java.util.HashSet;

public class HK7_2 {// Math.random()自動排序
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		HashSet<Integer> set = new HashSet<>();
		while (set.size() != 10) {
			set.add((int) (Math.random() * 100) + 1);
			ps.println(set);

		}
		ps.println();
		ps.flush();
	}

}
