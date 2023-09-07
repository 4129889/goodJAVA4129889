package xxx;

import java.util.Scanner;

public class HK3_3_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i, count = 1, sum, r = scan.nextInt();
		for (i = 1; i <= 49; i++) {
			sum = i;
			while (sum > 0) {
				if (sum % 10 == r) {
					break;
				} else {
					sum /= 10;
				}
				
				
			}System.out.println(i);

		}
		scan.close();
	}
}
