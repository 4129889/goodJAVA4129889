package xxx;

public class HK6Calculator {
	private int x, y;

	public HK6Calculator() {

	}

	public int getX(int x) {
		return x;
	}

	public int getY(int y) {
		return y;
	}

	public void setX(int x) {

		this.x = x;
	}

	public void setY(int y) {

		this.y = y;
	}

	public void powerXY(int x, int y) throws HK6CalException {
		if (x == 0 && y == 0) {
			throw new HK6CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new HK6CalException("次方為負值 結果回傳不為整數");
		} else {
			System.out.print(x + "的" + y + "次方 = " + (int) Math.pow(x, y));
		}
		

	}
}
