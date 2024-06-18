package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileEncryption {

	/*
		frankenstein.txt를 시저 암호 방식으로 암호화하여 frankenstein_encrypted.enc를 생성해보세요.
		
		(1) char 단위로 한 글자씩 암호화하는 속도를 측정해보기
		
		(2) char[] 방식으로 암호화하는 속도를 측정해보기
		
		(3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
		
		(4) 이미 같은 이름의 결과 파일이 경로에 존재한다면 파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
		    frankenstein_encrypted(1).enc
		    frankenstein_encrypted(2).enc
		    frankenstein_encrypted(3).enc...
	 */
	
	public static void main(String[] args) {
		File originFile = new File("myfiles/frankenstein.txt");
		File encryptedFile = new File("./frankenstein.enc");
		
		long start, end;
		
		start = System.currentTimeMillis();
		try (
			FileReader in = new FileReader(originFile);
			FileWriter out = new FileWriter(encryptedFile);
		) {		
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time1 = end - start;
		
		start = System.currentTimeMillis();
		try (
			FileReader in = new FileReader(originFile);
		) {
			char[] buff = new char[2048];
			
			int len;
			while ((len = in.read(buff)) != -1) {
				System.out.println(new String(buff, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time2 = end - start;
		
		start = System.currentTimeMillis();
		try (
			FileReader fin = new FileReader(originFile);
			BufferedReader in = new BufferedReader(fin);
		) {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time3 = end - start;
		
		System.out.println("걸린 시간1: " + time1 + "ms");
		System.out.println("걸린 시간2: " + time2 + "ms");
		System.out.println("걸린 시간3: " + time3 + "ms");
	}
}

class CeasarCipher {
	String cryptSet;
	
	public CeasarCipher() {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	}
	
	public CeasarCipher(String cryptSet) {
		this.cryptSet = cryptSet;
	}
	
	String encrypt(String plain, int key) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < plain.length(); ++i) {
			char ch = plain.charAt(i);
			int index = cryptSet.indexOf(ch);
			if (index != -1) {
				result.append(cryptSet.charAt((index + key) % cryptSet.length()));
			} else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
}