package quiz;

import java.util.Scanner;

public class D08_Omok {
	// 오목을 만들어 주세요.
	public static void main(String[] args) {
		// 힌트 - 콘솔에 판 그리는 방법
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				System.out.printf("%2c", '┼'); // 'ㅂ' 한자
			}
			System.out.println();
		}
		
		// 힌트2 - 오목판에 돌 놓는 방법
		char[][] omok = {
				{'┌', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┬', '┐'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
				{'└', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┴', '┘'},
		};
		
		for (int i = 0; i < omok.length; ++i) {
			for (int j = 0; j < omok[i].length; ++j) {
				System.out.printf("%-2c", omok[i][j]);
			}
			System.out.println();
		}
		
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("x, y값 입력: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			for (int i = 0; i < omok.length; ++i) {
				for (int j = 0; j < omok[i].length; ++j) {
					omok[y][x] = '●';
				}
			}
			
			for (int i = 0; i < omok.length; ++i) {
				for (int j = 0; j < omok[i].length; ++j) {
					System.out.printf("%-2c", omok[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("x, y값 입력: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			for (int i = 0; i < omok.length; ++i) {
				for (int j = 0; j < omok[i].length; ++j) {
					omok[y][x] = '○';
				}
			}
			
			for (int i = 0; i < omok.length; ++i) {
				for (int j = 0; j < omok[i].length; ++j) {
					System.out.printf("%-2c", omok[i][j]);
				}
				System.out.println();
			}
		}
	}
}
