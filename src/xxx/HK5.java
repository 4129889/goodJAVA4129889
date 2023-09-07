package xxx;

import java.util.Scanner;

public class HK5 {
	public static void main(String[] args) {
//		1.請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
		Scanner scan = new Scanner(System.in);
		int heightin = scan.nextInt();
		int widthin = scan.nextInt();
		scan.close();
		starSquare(heightin, widthin);
//		2.請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
		randAvg();
	}

	private static void starSquare(int heightwork, int widthwork) {
		int i, j;
		for (i = 1; i <= heightwork; i++) {
			for (j = 1; j <= widthwork; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void randAvg() {
		int sum = 0, i, ran;
		for (i = 1; i <= 10; i++) {
			System.out.print((ran = (int) (Math.random() * 101)) + " ");
			sum += ran;
		}
		System.out.println("平均" + sum / 10);
	}
}
