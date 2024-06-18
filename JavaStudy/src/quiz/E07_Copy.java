package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_Copy {
	 
	/*
		폴더의 경로를 전달하면 같은 경로에 폴더 이름2를 만들고 안의 모든 내용을 복사해주는 메서드를 만들어보세요
		
		ex1> dog 폴더의 경로를 전달하면 안에 있는 모든 강아지 사진이 복사된 dog2 폴더가 생겨야 함
		ex2> myimage 폴더의 경로를 전달하면 내부의 모든 내용이 그대로인 myimage2가 생겨야 함
	 */
	
	static void copy(String path) {
		// 원래 경로에 들어있는 파일들의 목록을 꺼낸다!
		String[] files = new File(path).list();
		String dest = path + "2";
		File destFolder = new File(dest);
		
		for (String file : files) {
			try {
				FileReader in = new FileReader(path);
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			try {
				destFolder.mkdirs();
				FileWriter out = new FileWriter(dest);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		copy("myimages/animal/dog");
	}
}
