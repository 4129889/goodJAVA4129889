package xxx;

public class H3_1_49 {
	    public static void main(String[] args) {
	        int totalCount = 0;

	        for (int i = 1; i <= 49; i++) {
	            if (!containsFour(i)) {
	                System.out.print(i + " ");
	                totalCount++;
	            }
	        }

	        System.out.println("\n可以选择的数字总共有：" + totalCount + " 个。");
	    }

	    // 判断一个数字是否包含数字 4
	    private static boolean containsFour(int num) {
	        while (num != 0) {
	            int digit = num % 10;
	            if (digit == 4) {
	                return true;
	            }
	            num /= 10;
	        }
	        return false;
	    }
	}


