package xxx;

import java.io.*;

public class HK7_4_1 {// 1關閉順序感覺沒差
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("C:/data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		File file = new File("C:/data/Object.ser");

		Serializable[] animals = new Serializable[4];
		animals[0] = new Cat1("Kitty1");
		animals[1] = new Cat1("Kitty2");
		animals[2] = new Dog1("Doge1");
		animals[3] = new Dog1("Doge2");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
			System.out.println(animals[i]);
		}
		FileInputStream fis = new FileInputStream(file);// 讀物建
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
//			while (true) {1.無多形2.Dog implements Serializable
//				Object obj = ois.readObject();
//				if (obj instanceof Dog) {
//					((Dog) obj).speak();
//				} else {
//					((Cat) obj).speak();
//				}
			while (true) {
				Object obj = ois.readObject();
				((Pet) obj).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		oos.close();
		fos.close();

	}
}
