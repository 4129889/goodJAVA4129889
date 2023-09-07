package xxx;

import java.io.*;

public class HK7_3 {

	public static void main(String[] args) {
		String sourceFilePath = "Sample.txt";
		String destinationFilePath = "copy.txt";

		try {
			copyFile(sourceFilePath, destinationFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
		try (FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream fos = new FileOutputStream(destinationPath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			System.out.println("文件複製完成！");
		}
	}
}
