package xxx;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HK4 {
	public static void main(String[] args) {
//		1.有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int i, arg = 0, sum = 0;
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
			arg = sum / arr.length;
		}
		System.out.println(arg);
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arg) {
				System.out.print(arr[i] + " ");
			}
		}
//		2.請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		System.out.println();
		String s = "Hello World";
		int l = s.length();
		for (i = l - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("\n" + new StringBuilder(s).reverse());
		System.out.println(s);
		s = new StringBuilder(s).reverse().toString();
		System.out.println(s);
		System.out.println(new StringBuffer("Hello World!").reverse());//Buffer是thread-safe 同步
//		3.有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)
		int j = 0, count1 = 0, count2 = 0;
		char k;
		String[] st = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (i = 0; i < st.length; i++) {
			for (j = 0; j < st[i].length(); j++) {
				k = st[i].charAt(j);
				if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
					count1++;
				}
				switch (k) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count2++;
				}

			}
		}
		System.out.println(count1);
		System.out.println(count2);
//		4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner,二維陣列)
		int[][] arra = { { 25, 32, 8, 19, 27 }, { 2000, 800, 500, 1000, 1200 } };
		Scanner scan = new Scanner(System.in);
		int a = 0, count = 0;
		while (true) {
			if (scan.hasNextInt()) {
				a = scan.nextInt();
				break;
			} else
				System.out.println("輸入整數");
			scan.next();
		}
		for (i = 0; i < arra[1].length; i++) {

			if (arra[1][i] >= a) {
				System.out.print(arra[0][i] + " ");
				count++;
			}
		}
		System.out.println("共" + count + "人");
//		5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		int y, m, d, mon;
		sum = 0;
		int[] arr1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		y = scan.nextInt();
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			arr1[1] = 29;

		while (true) {
			System.out.println("輸入月份");
			m = scan.nextInt();
			System.out.println("輸入日期");
			d = scan.nextInt();
			if (m >= 1 && m <= 12 && d <= arr1[m - 1])
				break;
			else {
				System.out.println("請輸入正確月份日期");

			}
		}

		for (mon = 0; mon < m - 1; mon++)
			sum += arr1[mon];
		//////////////////////////////
		GregorianCalendar cal = new GregorianCalendar(y,m-1, d);//西元1700以下潤年有錯
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		boolean isLeap = cal.isLeapYear(y);
		System.out.println(isLeap);

		System.out.println(sum + d);

	}
}
