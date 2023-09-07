package xxx;

public class TestBMI {
	
	public static void main(String[] args) {
		double height = 1.7, weight = 55, BMI = weight / Math.pow(height, 2);
		System.out.printf("BMI = %.2f%n讚%n100%n"+100,(weight / (height * height)));
				
		if (BMI <= 18.5)
			System.out.println("%n過輕");
		else if (weight / (height * height) >= 24)
			System.out.println("%n過重");
		else if (weight / (height * height) >= 18.5 && weight / (height * height) <= 24 )
			System.out.println("%n正常");
		System.out.println(BMI >= 18.5 && BMI <= 24? "正常": "不正常");
		
				
	}

}