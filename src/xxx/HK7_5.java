//package xxx;
//
//import java.io.*;
//
//public class HK7_5 {
//	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		File file = new File("C:/data/Object.ser");
//		FileInputStream fis = new FileInputStream(file);
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		System.out.println(file.getName() + "檔案內容如下: ");
//		System.out.println("--------------------");
//		int c = 0;
//		try {
//			while (true) {
//				c++;
//				System.out.println(c);
//				Object obj = ois.readObject();
//				if(obj instanceof Dog) {
//					((Dog) obj).speak();}
//				else {
//					((Cat) obj).speak();}
//				
//				System.out.println("--------------------");
//			}
//		} catch (EOFException e) {
//			System.out.println("資料讀取完畢！");
//		}
//		ois.close();
//		fis.close();
//	}
//
//}
