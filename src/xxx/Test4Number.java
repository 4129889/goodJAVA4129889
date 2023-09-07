package xxx;

public class Test4Number {

	public static void main(String[] args) {
		int count = 0;

		for (count = 0; count <= 100; count++) {
			if (count % 4 == 0)
				System.out.print(count + " ");
		}

		System.out.println();

		for (count = 0; count <= 100; count += 4) {
			System.out.print(count + " ");
		}
		System.out.print(count + " ");
	}
}
