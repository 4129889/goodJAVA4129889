package xxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HK6CalTest {

	public static void main(String[] args) {

		HK6Calculator c1 = new HK6Calculator();
		while (true) {
			try {
				System.out.println("請輸入X的值");
				Scanner inputx = new Scanner(System.in);
				int x = inputx.nextInt();
				System.out.println("請輸入Y的值");
				int y = inputx.nextInt();
				c1.powerXY(x, y);
				break;
			} catch (HK6CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException i) {
				System.out.print("格式輸入錯誤");
			}
		}

	}
}