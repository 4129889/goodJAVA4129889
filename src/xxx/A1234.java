package xxx;
import java.util.*;
public class A1234 {
	public static void main(String[] args) {
		int colleague[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int input, count = 0;
		while (true) {
			System.out.println("請輸入欲借金額:");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				System.out.print("有錢可借的員工編號:");
				for (int i = 0; i < colleague.length; i++)
					if (colleague[i][1] >= input) {
						System.out.print(colleague[i][0] + " ");
						count++;
					}
				System.out.println("共" + count + "人!");
				break;
			} else
				System.out.println("格式錯誤，請輸入正整數!");
		}
	}

}
