package xxx;

public class MultiplicationTableTimesTable {

	public static void main(String[] args) {
		System.out.println("(1).");// for+for
		for (int count = 1; count <= 9; count++) {
			for (int count2 = 1; count2 <= 9; count2++) {
				int sum;
				sum = count * count2;
				System.out.print(count + "*" + count2 + "=" + sum + "\t");
			}
			System.out.println();
		}
		System.out.println("(2).");// for+while
		for (int count = 1; count <= 9; count++) {
			int count2 = 1;
			while (count2 <= 9) {
				int sum;
				sum = count * count2;
				System.out.print(count + "*" + count2 + "=" + sum + "\t");
				count2++;
			}
			System.out.println();

		}
		System.out.println("(3).");// for+do
		for (int count = 1; count <= 9; count++) {
			int count2 = 1;
			do {
				int sum;
				sum = count * count2;
				System.out.print(count + "*" + count2 + "=" + sum + "\t");
				count2++;// while (count2 <= 5 );//這樣寫沒報錯
			} while (count2 <= 9);
			System.out.println();

		}
		System.out.println("(4).");//while+do
		int count = 1;
		while (count <= 9) {
			int count2 = 1;
			do {
				int sum;
				sum = count * count2;
				System.out.print(count + "*" + count2 + "=" + sum + "\t");
				count2++;// while (count2 <= 5 );//這樣寫沒報錯
			} while (count2 <= 9);
			System.out.println();
			count++;

		}
		System.out.print("for ninenineloop");// for+for
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
		}

		System.out.print("\nwhile ninenineloop");// while+while
		int i = 1;
		while (i <= 9) {
			System.out.println();
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			i++;

		}
		System.out.print("\ndowhile ninenineloop");// do+do
		i = 1;
		do {
			System.out.println();
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
		} while (i <= 9);


	}
	
}
