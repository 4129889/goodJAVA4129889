package xxx;

public class HK5_5_2 {
	public static void main(String[] args) {
		HK5_5_2 p5 = new HK5_5_2();
		p5.getAuthCode();
	}

	public void getAuthCode() {
		char[] randnums = new char[8];
		randnums = getRandCode();

		// 確認8個亂碼是否包含數字、大小寫英文字
			int num = 0, uppercase = 0, lowercase = 0;
			
			redo:
			for (int j = 0; j < randnums.length; j++) {
				if ((int)(randnums[j]) >= 48 && (int)(randnums[j]) <= 57) {
					num ++;
				} else if ((int)(randnums[j]) >= 65 && (int)(randnums[j]) <= 90) {
					uppercase ++;
				} else if ((int)(randnums[j]) >= 97 && (int)(randnums[j]) <= 122) {
					lowercase ++;
				}
				
				if (num == 0 || uppercase == 0 || lowercase == 0) {
					randnums = getRandCode();
					num = 0;
					uppercase = 0;
					lowercase = 0;
					continue redo;	
				}
			}

		System.out.println("本次隨機產生驗證碼為：");

		for (int i = 0; i < randnums.length; i++) {
			System.out.print(randnums[i]);
		}

	}

	public char[] getRandCode() {
		// 26個字母*2 (大小寫區分) +10個數字 = 62個元素
		char[] elements = new char[62];

		for (int i = 0; i < elements.length; i++) {
			if (i >= 0 && i <= 9) { // elements陣列先放入數字 0~9 (ASCII code 48~57)
				elements[i] = (char) (i + 48);
			} else if (i >= 10 && i <= 35) { // elements陣列再放入大寫英文字 A~Z (ASCII code 65~90)
				elements[i] = (char) (i + 55);
			} else if (i >= 36 && i <= 61) { // elements陣列再放入小寫英文字 a~z (ASCII code 97~122)
				elements[i] = (char) (i + 61);
			}
		}

		// 以RAND()函數抽出八個數字，儲存成一個陣列
		char[] randnums = new char[8];

		doagain: for (int i = 0; i < randnums.length; i++) {
			randnums[i] = elements[(int) (Math.random() * 62)];

		}

		// 回傳一維陣列
		return randnums;
	}

}