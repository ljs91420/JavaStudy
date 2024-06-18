package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E09_SaveGame {
	
	/*
		컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후 프로그램 종료시 여태까지의 게임 전적을 파일에 저장해주세요.
		
		프로그램 실행시에는 파일에 저장되어 있는 전적 데이터를 읽어 예전 기록이 계속해서 이어지도록 만들어보세요.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int usr, com;
		
		try (
			FileOutputStream fout = new FileOutputStream("myfiles/rockPaperScissors");
			DataOutputStream dout = new DataOutputStream(fout);
			FileInputStream fin = new FileInputStream("myfiles/rockPaperScissors");
			DataInputStream din = new DataInputStream(fin);
		) {
			while (true) {
				com = (int)(Math.random() * 3);
				
				System.out.print("가위(0)바위(1)보(2) 입력: ");
				usr = sc.nextInt();
				
				if (com == 0) {
					if (usr == 0) {
						dout.writeUTF("비김");
					}
					if (usr == 1) {
						dout.writeUTF("이김");
					}
					if (usr == 2) {
						dout.writeUTF("짐");
					}
				}
				if (com == 1) {
					if (usr == 0) {
						dout.writeUTF("짐");
					}
					if (usr == 1) {
						dout.writeUTF("비김");
					}
					if (usr == 2) {
						dout.writeUTF("이김");
					}
				}
				if (com == 2) {
					if (usr == 0) {
						dout.writeUTF("이김");
					}
					if (usr == 1) {
						dout.writeUTF("짐");
					}
					if (usr == 2) {
						dout.writeUTF("비김");
					}
				}
				System.out.println(din.readUTF());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
