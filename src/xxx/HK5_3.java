package xxx;

public class HK5_3 {
	public static void main(String[] args) {
//		2.利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		可以找出二維陣列的最大值並回傳，如圖：
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		int maxInt = maxElement(intArray);
		System.out.println("二維陣列最大值為：" + maxInt + "\t" + maxElement(doubleArray));

	}

	private static int maxElement(int[][] x) {
		int max = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	private static double maxElement(double[][] x) {
		double max = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
