package xxx;

import java.io.*;

public class HK7_3_1 {

	public static void main(String[] args) {
		File sourceFile = new File("Sample.txt");
		File destinationFile = new File("copy.txt");

		try {
			copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile(File source, File destination) throws IOException {
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(destination);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			System.out.println(destination.getName());
			System.out.println("文件複製完成！");
		}
	}
}
