package xxx;
//• 請設計一個類別MyRectangle：

//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法：
//void setWidth(double width): 將收到的引數指定給width屬性
//void setDepth(double depth): 將收到的引數指定給depth屬性
//double getArea(): 能計算該長方形的面積
//(3) 有兩個建構子：
//public MyRectangle(): 不帶參數也無內容的建構子
//public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
//• 請另外建立一個MyRectangleMain類別，此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

public class HK5_4MyRectangle {// 請設計一個類別MyRectangle：
	private double width0, depth0;// (1) 有兩個double型態的屬性為width, depth
	
	// (2) 有三個方法：
	void setWidth(double width1) {
		this.width0 = width1;
	}// void setWidth(double width): 將收到的引數指定給width屬性

	void setDepth(double depth1) {
		this.depth0 = depth1;
	}// void setDepth(double depth): 將收到的引數指定給depth屬性

	double getArea() {
		return width0 * depth0;
	}// double getArea(): 能計算該長方形的面積

	double getArea(int width3, int depth3) {
		return width3 * depth3;
	}// 自己額外加的override方法
	
	// (3) 有兩個建構子：
	public HK5_4MyRectangle() {
	}
	// public MyRectangle(): 不帶參數也無內容的建構子

	public HK5_4MyRectangle(double width2, double depth2) {
		// public MyRectangle(double width, double depth):
		// 傳入的兩個引數會指定給對應的屬性
		this.width0 = width2;
		this.depth0 = depth2;
	}

}
