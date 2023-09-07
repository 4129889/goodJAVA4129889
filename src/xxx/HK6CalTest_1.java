
package xxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HK6CalTest_1 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        // scan x
        System.out.println("請輸入x的值(正整數)");
        while (true) {
            try {
                x = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確\n請重新輸入x的值(正整數)");
                scanner.nextLine();
            }
        }
        // scan y
        System.out.println("請輸入y的值(正整數)");
        while (true) {
            try {
                y = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確\n請重新輸入y的值(正整數)");
                scanner.nextLine();
            }
        }
        // calculate power xy
        try {HK6Calculator c1 = new HK6Calculator();
            c1.powerXY(x, y);
        } catch (HK6CalException e) {
            System.out.println(e.getMessage());
        }
    }
}