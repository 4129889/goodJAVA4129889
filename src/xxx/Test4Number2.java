package xxx;

public class Test4Number2 {

	public static void main(String[] args) {
		System.out.print("for ninenineloop");
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
		}

		System.out.print("\nwhile ninenineloop");
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
		System.out.print("\ndowhile ninenineloop");
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
