package xxx;

public class HK2 {
	public static void main(String[] args) {

		// 1.請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

		// 2.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		sum = 1;
		for (int i = 1; i < 11; i++) {
			sum *= i;
		}
		System.out.println(sum);

		// 3.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		sum = 1;
		int i = 1;
		while (i < 11) {
			sum *= i;
			i++;
		}
		System.out.println(sum);

		// 4.請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		for (i = 1; i < 11; i++) {
			System.out.print(i * i + " ");
		}

		// 5.阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個?
		System.out.println();
		int count = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {// &&短路;優於&
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.println("\n共" + count);

		count = 0;
		for (i = 0; i <= 4; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i != 4 && j != 4 && (i != 0 || j != 0)) {
					System.out.print(j + i * 10 + " ");
					count++;
				}
			}

		}
		System.out.println("\n共" + count);

		// 6.請設計一隻Java程式，輸出結果為以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		for (i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// 7.請設計一隻Java程式，輸出結果為以下：
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		for (i = 'A'; i <= 'F'; i++) {// i='A';'A'<'F';print((char)i);
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) i);
			}
			System.out.println();

			// for(i='A';i<'F';i++) {
			// for('A'<='')

		}
		
		char c = 'A';
		for (c = 'A'; c <= 'F'; c++) {// c='A';'A'<'F';print(c);
			for (int j = 'A'; j <= c; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		c = 'A';
		for (i = 0; i <= 5; i++) {// c='A';0<5;print((char)(c+i));
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (c + i));
			}
			System.out.println();
		}
		
		c = 'A';
		for (i = 0; i <= 5; i++) {// c='A';0<5;c++;print(c);
			for (int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			c++;
			System.out.println();
		}

		// 5.阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個?
		count = 0;

		for (i = 1; i <= 1000; i++) {
			if (!containsFour(i)) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\n共" + count);
	}

	// 判斷一個數字是否包含數字 4
	private static boolean containsFour(int num) {
		while (num != 0) {
			if (num % 10 == 4) {// 個位數4
				return true;
			}
			num /= 10;// 10->1，41->4，432->43->4
		}
		return false;

	}

}
