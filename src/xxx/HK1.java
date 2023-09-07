package xxx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HK1 {
	public static void main(String[] args) {
		int inter1 = 6, inter2 = 12;
		System.out.println("(1).\n和=" + (inter1 + inter2));// 無法直接"和="+sum=inter1 + inter2;，或是"和="+inter1 + inter2;
		System.out.println("product=" + inter1 * inter2);// 乘法先做所以可以

		int dozen = 200 / 12, egg = 200 % 12;
		System.out.println("(2).\n" + dozen + "打又" + egg + "顆");

		int days = 256559 / 86400, hours = (256559 % 86400) / 3600, minutes = 256559 % 86400 % 3600 / 60,
				seconds = 256559 % 86400 % 3600 % 60;
		System.out.println("(3).\n" + days + '\u5929' + '\n' + hours + "小時\n" + minutes + "分鐘\n" + seconds + '秒');// 由左至右'\u5929''秒'被字串同化，沒有變unicode(unicode+加數字是什麼奇怪的設定)，%n給printf用
		System.out.printf("%d%s%d%s%d%s%d%s", days, '\u5929', hours, "小時", minutes, "分", seconds, '秒');
		final double PI = 3.1415;
		double area = Math.pow(5, 2) * PI, perimeter = 5 * 2 * PI;
		System.out.printf("\n(4).\n半徑5公分的圓%n面積為%.2f\n圓周長%.2f%n", area, perimeter);// printf%n\n都可

		System.out.printf("(5).\n總共NT$%.8f%n", 1500000 * Math.pow(1.02, 10));
		System.out.println(new BigDecimal("1500000").multiply(new BigDecimal("1.02").pow(10)));
		System.out.println(new BigDecimal(String.valueOf(0.1)).divide(new BigDecimal(String.valueOf(0.03)), 6,
				RoundingMode.HALF_UP));

		System.out.println("(6).\n" + (5 + 5));// int5+int5=10
		System.out.println(5 + '5');// int5+int(unicode 35，16轉10=53)=58
		System.out.println(5 + "5");// int5+字串5，5跟5串起來=55

	}

}
