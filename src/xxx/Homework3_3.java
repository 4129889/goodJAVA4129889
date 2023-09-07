package xxx;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
		int input, count = 0, k;
		int num[] = new int[49];
		System.out.println("阿文...請輸入你討厭哪個數字");
		while (true) {
			Scanner sc = new Scanner(System.in);

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input > 0 && input < 10) {

					for (int i = 1; i <= 49; i++)
						if ((i % 10 != input) && (i / 10 != input)) {
							System.out.print((num[count++] = i) + "\t");
							if (count % 6 == 0)
								System.out.println();
						}
					System.out.println("總共:" + count + "個數字可選");
					System.out.println("電腦選號:");
					for (int i = 0; i < 6; i++, System.out.print(num[k]+" "), num[k] = 0)
						while ((num[k = (int) (Math.random() * count)]) == 0)
							;
					break;
				}
			}
			System.out.println("請輸入整數1~9");
		}
	}
}