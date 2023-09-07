package xxx;

public class TEXTGPT {
	public static void main(String[] args) {
		String str1 = "aaaaaa";
		String str2 = "aaaaaz";

		int result = str1.compareTo(str2);

		System.out.println("Comparison result: " + result);
		// 声明和初始化一个3维数组
		int[][][] threeDArray = new int[3][4][5];

		// 给三维数组赋值
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 5; k++) {
					threeDArray[i][j][k] = i + j + k;
				}
			}
		}

		// 访问三维数组的元素
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 5; k++) {
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
	



