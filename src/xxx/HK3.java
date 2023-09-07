package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HK3 {
	public static void main(String[] args) {
		// 1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		// 三角形、其它三角形或不是三角形，如圖示結果
		System.out.println("輸入三角形邊長:");
		Scanner scan = new Scanner(System.in);
		double[] arr = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };
		Arrays.sort(arr);
		if (arr[0] + arr[1] <= arr[2] ) {
			System.out.println("非三角形");
		} else if (arr[0]==arr[2]) {
			System.out.println("正三角形");
		} else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2)==Math.pow(arr[2], 2)) {
			if (arr[0] == arr[1] ) {
				System.out.println("等腰直角三角形");
			} else
				System.out.println("直角三角形");
		} else if (arr[0] == arr[1] || arr[1] == arr[2]) {
			System.out.println("等腰三角形");
		} else
			System.out.println("一般三角形");

		// 方法2:土法
		System.out.println("輸入三角形邊長2:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("非三角形");
		} else if (a == b) {
			System.out.println("正三角形");
		} else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
			if (a == b || b == c || c == a) {
				System.out.println("等腰直角三角形");
			} else
				System.out.println("直角三角形");
		} else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
		} else
			System.out.println("一般三角形");
		System.out.println(a + " " + b + " " + c);
		// 方法3:方法
		System.out.println("輸入三角形邊長3:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		String triangleType = triangleType(a, b, c);

		System.out.println(triangleType);
		System.out.println(a + " " + b + " " + c);
		scan.close();
	}

	private static String triangleType(double a, double b, double c) {
		if (a + b <= c || a + c <= b || b + c <= a) {
			return "非三角形";
		} else if (a == b && b == c) {
			return "正三角形";
		} else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
			if (isIsoscelesTriangle(a, b, c)) {
				return "等腰直角三角形";
			} else
				return "直角三角形";
		} else if (a == b || b == c || c == a) {
			return "等腰三角形";
		} else
			return "非三角形";

	}

	// 判斷是否等腰
	private static boolean isIsoscelesTriangle(double a, double b, double c) {
		return a == b || b == c || c == a;
	}

}
