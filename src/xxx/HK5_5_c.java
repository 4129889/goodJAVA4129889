package xxx;

public class HK5_5_c {
	public static void main(String[] args) {
		String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrsyuvwxyz";
		int num = 0, uppercase = 0, lowercase = 0;
		char[] charArr = new char[8];
		do {
			num = 0;
			uppercase = 0;
			lowercase = 0;
			for (int j = 0; j <= 7; j++) {
				int i = (int) (Math.random() * 62);
				System.out.println(i);
				char r = s.charAt(i);
				System.out.println(r);

				if (i <= 9) {
					num++;
				} else if (i <= 35) {
					uppercase++;
				} else if (i <= 61) {
					lowercase++;
				}
				charArr[j] = s.charAt(i);
			}

		} while (num == 0 || uppercase == 0 || lowercase == 0);

	}
}
