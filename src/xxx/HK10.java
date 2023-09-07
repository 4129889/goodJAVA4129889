package xxx;

import java.nio.file.spi.FileSystemProvider;

public class HK10 {
	public static void main(String[] args) {//obsolete
		long s = System.currentTimeMillis();
		System.out.print("2 3 5 7 ");
		for (int i = 11; i <= 100; i += 2)
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
				System.out.print(i + " ");
		long e = System.currentTimeMillis();
		System.out.println("\n"+(e-s)+"ms");		
		c: for (int i = 0; i < 5; i++) {// 方法2
			int randomNum = (int) (Math.random() * 3) + 1;
			if (randomNum % 2 == 0 && randomNum != 2 ||randomNum == 1) {//忽略2的倍數，因為1跟2比較特別
				System.out.println(randomNum + "不是質數");
				continue c;
			}
			for (int j = 2; j * j <= randomNum; j++) {
				if (randomNum % j == 0) {
					System.out.println(randomNum + "不是質數");
					continue c;
				}
			}
			System.out.println(randomNum + "是質數");
		}
		long s1 = System.currentTimeMillis();
		System.out.print("2 3 ");// 方法3快
		c1: for (int i = 5; i < 100; i += 2) {
			if (i % 6 == 1 || i % 6 == 5) {
				for (int j = 5; j <= Math.sqrt(i); j += 6) {
					if (i % j == 0 || i % (j + 2) == 0)
						continue c1;
				}
				System.out.print(i + " ");
			}
		}long e1 = System.currentTimeMillis();
		System.out.println("\n"+(e1-s1)+"ms");
	}
}
