package xxx;

public class HK5_5_0 {
	public static void main(String[] args) {
		HK5_4MyRectangle[] rectangle1 = new HK5_4MyRectangle[2];
		rectangle1[0] = new HK5_4MyRectangle();
		rectangle1[0].setWidth(10);
		rectangle1[0].setDepth(20);
		rectangle1[1] = new HK5_4MyRectangle(10, 200);
		for (HK5_4MyRectangle rect0 : rectangle1) {
			System.out.println("rectangle area is " + rect0.getArea());
		}
	}
}
