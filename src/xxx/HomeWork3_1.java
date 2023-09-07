package xxx;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {public static void main(String[] args) {
	String print = null;
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入數字:");
	int[] number = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
	Arrays.sort(number);
	int n1 = (int) (Math.pow(number[0], 2));
	int n2 = (int) (Math.pow(number[1], 2));
	int n3 = (int) (Math.pow(number[2], 2));
	// a.b.c 皆!=0
	if (number[0] + number[1] <= number[2]) {
		print = "不是三角形R";
	} else if ((n1 + n2) == n3) {
		print = "直角三角形R";
	} else if ((number[0] == number[1]) && number[1] == number[2]) {
		print = "正三角形R";
	} else if ((number[0] == number[1]) && number[0] > number[2]) {
		print = "等腰三角形R";
	} else {
		print = "其他三角形R";
	}
	System.out.println(print);
}

}
