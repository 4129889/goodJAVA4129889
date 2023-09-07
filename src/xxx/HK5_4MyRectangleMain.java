package xxx;
//• 請另外建立一個MyRectangleMain類別，此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
public class HK5_4MyRectangleMain {
	public static void main(String[] args) {
		HK5_4MyRectangle my1 = new HK5_4MyRectangle(10,1);
		my1.setWidth(1);
		my1.setDepth(2);
		System.out.println(my1.getArea());
//(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		my1 = new HK5_4MyRectangle(10,3);
		System.out.println(my1.getArea()+"\n"+my1.getArea(100,4));
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	}
}
