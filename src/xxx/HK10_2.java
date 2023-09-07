package xxx;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HK10_2 {
	public static void main(String[] args) {
		{
			String choice = null;
			DecimalFormat decimalFormat = null;

			// scan number
			System.out.println("請輸入數字");
			Integer input = intScanner("格式不正確，請再輸入一次");

			// scan choice and format number according to the choice
			System.out.println("欲格式化成 (1)千分位 (2)百分比 (3)科學記號:");
			C:switch (intScanner("格是不正確，請再輸入一次")) {
			case 1 -> {
				decimalFormat = new DecimalFormat("#,###.00");
				choice = "千分位";
			}
			case 2 -> {
				decimalFormat = new DecimalFormat("#.##%");
				choice = "百分比";
			}
			case 3 -> {
				decimalFormat = new DecimalFormat("0.#E0");
				choice = "科學記號";
			}
		    default -> {
		        System.out.println("無效的選擇，將使用預設數字格式。");
		        decimalFormat = new DecimalFormat("#,###.00");
		        choice = "千分位";
		    }
			}
			if (choice != null) {
				System.out.printf("%s:%s", choice, decimalFormat.format(input));
			}
		}
	}
	 static int intScanner(String invalidMessage) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            if (scanner.hasNextInt()) {
	                return scanner.nextInt();
	            } else {
	                System.out.println(invalidMessage);
	                scanner.next();
	            }
	        }
	    }

}
