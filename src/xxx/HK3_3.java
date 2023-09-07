package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HK3_3 {
	public static void main(String[] args) {
		// 3.輸入不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，並隨機選兩個
		System.out.print("輸入不要的數字:");
		Scanner scan = new Scanner(System.in);
		int i, num, count = 0, sca = scan.nextInt();
		while(sca>9||sca<1) {System.out.println("請輸入1~9"); sca = scan.nextInt();}
		scan.close();
		int[] arr1 = new int[49];
		System.out.println("arr1陣列的長度是:" + arr1.length);
		System.out.println("陣列預設值為:" + arr1[0]);
		System.out.println("可選數字有:");
		while(sca>9||sca<1) {;}
		c: for (i = 1; i <= arr1.length; i++) {
			num = i;
			while (num > 0) {
				if (num % 10 == sca) {
					continue c;
				} else {
					num /= 10;
				}

			}
			System.out.print((arr1[count++] = i) + " ");

		}
		System.out.println("\n共" + count + "組數字可選");
		int r = -1;
		int[] arr2 = new int[6];
		int count1 = 0;

		for (i = 1; i <= 6; i++) {
			while (arr1[r = (int) (Math.random() * arr1.length)] == 0) {
				;
			}
			arr2[count1++] = arr1[r];

			System.out.println("第" + i);
			System.out.println("引索是:" + r);
			System.out.println("數字是:" + arr1[r]);
			arr1[r] = 0;
		}
		Arrays.sort(arr2);
		System.out.print("隨機六組數字:");
		for (i = 0; i <= 5; i++)
			System.out.print(arr2[i] + " ");
		System.out.println("\narr1陣列的長度是:" + arr1.length);
		System.out.print("arr2陣列的長度是:" + arr2.length);
		
	}
}
