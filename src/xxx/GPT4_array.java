package xxx;

public class GPT4_array {
	    public static void main(String[] args) {
	        // 声明和初始化一个4维数组
	        int[][][][] fourDArray = new int[2][3][4][5];

	        // 给四维数组赋值
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 4; k++) {
	                    for (int l = 0; l < 5; l++) {
	                        fourDArray[i][j][k][l] = i + j + k + l;
	                    }
	                }
	            }
	        }

	        // 访问四维数组的元素
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 4; k++) {
	                    for (int l = 0; l < 5; l++) {
	                        System.out.print(fourDArray[i][j][k][l] + " ");
	                    }
	                    System.out.println();
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	    }
	}


