package xxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HK3_3_1_1 {
	public static void main(String[] args) {
		System.out.println("请输入不想要的数字（1~9之间的整数），用空格分隔：");
		Scanner scanner = new Scanner(System.in);

		List<Integer> unwantedNumbers = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			unwantedNumbers.add(i + 1);
		}

		while (scanner.hasNextInt()) {
			int unwantedNumber = scanner.nextInt();
			if (unwantedNumber >= 1 && unwantedNumber <= 9) {
				unwantedNumbers.remove(Integer.valueOf(unwantedNumber));
			} else {
				System.out.println("输入的数字不在 1~9 范围内，将忽略此输入。");
			}
		}


		System.out.println("您可以选择的数字为：" + unwantedNumbers);

		if (unwantedNumbers.size() >= 2) {
			Random random = new Random();
			int randomIndex1 = random.nextInt(unwantedNumbers.size());
			int randomIndex2 = random.nextInt(unwantedNumbers.size());
			while (randomIndex2 == randomIndex1) {
				randomIndex2 = random.nextInt(unwantedNumbers.size());
			}
			int number1 = unwantedNumbers.get(randomIndex1);
			int number2 = unwantedNumbers.get(randomIndex2);
			System.out.println("随机选择的两个数字为：" + number1 + " 和 " + number2);
		} else {
			System.out.println("您可以选择的数字不足两个，无法进行随机选择。");
		}
	}
}
