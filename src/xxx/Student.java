package xxx;

public class Student {
	int score = 90;

	public void play(int hours) {
		score -= hours;
	}

	public void study(int hours) {
		score += hours;
	}

	public static void main(String[] args) {

		Student Jay = new Student();
		System.out.println(Jay.score);
		Jay.play(4);
		Jay.study(8);

		Student Jason = new Student();
		System.out.println(Jason.score);
		Jason.play(9);
		Jason.study(6);

		System.out.println(Jay.score);
		System.out.println(Jason.score);
	}

}
