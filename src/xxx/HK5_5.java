package xxx;

public class HK5_5 {
	public static void main(String[] args) {
//		5.身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖:
		HK5_5 hk5_5 = new HK5_5();// 建立物件
		System.out.println("亂碼為:" + hk5_5.rendom1(5));// 呼叫方法，輸入想要的亂碼長度
		hk5_5.rendom2(4);
	}

	public String rendom1(int lengt) {//charAt，回傳新字串
		String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrsyuvwxyz";// 每個字元有相同機率
		int num = 0, uppercase = 0, lowercase = 0;
		String str = "";
		do {
			str = "";
			num = 0;
			uppercase = 0;
			lowercase = 0;
			for (int inde = 0; inde < lengt; inde++) {
				int i = (int) (Math.random() * 62);
				System.out.println("引索" + inde);

				if (i <= 9) {// 數字0~9
					num++;
				} else if (i <= 35) {// 字母A~Z
					uppercase++;
				} else if (i <= 61) {// 字母a~z
					lowercase++;
				}
				str += s.charAt(i);
				System.out.println(str);
			}

		} while (num == 0 || uppercase == 0 || lowercase == 0);// 判斷是否包含數字及大小寫字母
		return str;
	}

	public void rendom2(int lengt2) {//char = 亂數i+特定值
		int num = 0, uppercase = 0, lowercase = 0;
		char[] c = new char[lengt2];
		do {
			num = 0;
			uppercase = 0;
			lowercase = 0;
			for (int inde = 0; inde < lengt2; inde++) {
				int i = (int) (Math.random() * 62);
				System.out.println("引索" + inde);

				if (i <= 9) {// 數字0~9(UNIcode 48~57)
					c[inde] = (char)(i+48);
					num++;
				} else if (i <= 35) {// 字母A~Z(UNIcode 65~90)
					c[inde] = (char)(i+55);
					uppercase++;
				} else if (i <= 61) {// 字母a~z(UNIcode 97~122)
					c[inde] = (char)(i+61);
					lowercase++;
				}
			}

		} while (num == 0 || uppercase == 0 || lowercase == 0);// 判斷是否包含數字及大小寫字母
		System.out.print("第2組亂碼:");
		for(char value:c)
		System.out.print(value);
	}
}
