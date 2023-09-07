package xxx;
import java.util.Scanner;
public class C3_2 {public static void main(String[] args) {
	int mrd = (int) (Math.random() * 101);
	System.out.println("歡迎光臨");
	System.out.println("亂數為:" + mrd);
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入數字:" + " ");

	mrd:
	while (true) {

		int number;
		String hint = "";
		number = sc.nextInt();
		if ((number >= 0) && (number <= 100)) {
			if (number == mrd) {
				System.out.println("恭喜答對!");
				break mrd;
			} else if (number < mrd) {
				hint = "大一點";
			} else if (number > mrd) {
				hint = "小一點";
			}
		}

		else {
			System.out.println("數字亂猜R");
		}
		System.out.println(hint);
	}
}

}
