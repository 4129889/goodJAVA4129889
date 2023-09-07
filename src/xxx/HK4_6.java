package xxx;

public class HK4_6 {
	public static void main(String[] args) {

		int[][] arr = { { 90, 90, 90, 100, 90, 90, 90, 90 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 1000, 1000, 90, 90, 90, 90, 90, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highScore = new int[arr[0].length];
		int i = 0, j = 0, h = 0, k = 0;
		for (i = 0; i < arr.length; i++) {
			h = 0;
			// 找最高分
			for (j = 0; j < arr[i].length; j++) {
				if (h < arr[i][j]) {
					h = arr[i][j];
				}
			}
			// 檢查同一科目是否有2位以上的同學最高分
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == h) {
					highScore[j]++;
				}
			}
		}
		for (k = 0; k < highScore.length; k++)
			System.out.println("第" + (k + 1) + "位同學最高分" + highScore[k] + "次");
		System.out.println("/////////////////////////////");
		// 方法2:增強型 for 迴圈
		k = 1;
		highScore = new int[arr[0].length];
		for (int[] row : arr) {
			h = 0;
			for (int score : row) {// 找最高分
				if (h < score) {
					h = score;
				}
			}
			for (j = 0; j < row.length; j++) {// 檢查同一科目是否有2位以上的同學最高分
				if (row[j] == h) {
					highScore[j]++;
				}
			}
		}
		for (int score : highScore) {
			System.out.println("第" + k + "位同學最高分" + score + "次");
			k++;
		}
	}
}
