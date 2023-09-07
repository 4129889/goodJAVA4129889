package xxx;

import java.util.Random;
import java.util.Scanner;

public class HK3_2 {
	public static void main(String[] args) {
		// 2.產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
		Random ran = new Random();
		int r = ran.nextInt(101), i = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入數字:\n答案:" + r);
		while (i != r) {
			i = scan.nextInt();
			if (i > r) {
				System.out.println("太大");
			} else if (i < r)
				System.out.println("太小");
			else
				System.out.println(true);
		}
		// 方法2:亂數方法、無窮迴圈
		r = (int) (Math.random() * 101);
		System.out.println("輸入數字2:\n答案:" + r);

		r: while (true) {

			int number;
			String s = "";
			number = scan.nextInt();

			if (number == r) {
				System.out.println("答對!");
				break r;
			} else if (number < r) {
				s = "大點";
			} else if (number > r) {
				s = "小點";
			}

			System.out.println(s);

		}
		scan.close();

	}

}
