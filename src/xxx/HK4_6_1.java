package xxx;

public class HK4_6_1 {
	public static void main(String[] args) {

		int i = 0;
		int[][] scores = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 100, 100, 100, 100, 100, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 8, 7, 6, 5, 4, 3, 2, 1 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 定義用於計算最高分次數的陣列
		int[] maxScoreCounts = new int[scores.length];

		// 計算每位同學的最高分次數
		for (i = 0; i < scores.length; i++) {
			int maxScore = scores[i][0];
			int count = 1;

			for (int j = 1; j < scores[i].length; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
					count = 0;
				} else if (scores[i][j] == maxScore) {
					count++;
				}
			}

			maxScoreCounts[i] = count;
		}

		// 輸出結果
		for (i = 0; i < maxScoreCounts.length; i++) {
			System.out.println("第 " + (i + 1) + " 位同學考最高分的次數為：" + maxScoreCounts[i]);
		}

	}
}
