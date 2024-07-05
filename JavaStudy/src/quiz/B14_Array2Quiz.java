package quiz;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1}
		};
		int total = 0, cnt = 0, rowTotal = 0, colTotal = 0;
		double avg = 0;
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);
			}
		}
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				total += myArr[i][j];
			}
			cnt += myArr[i].length;
		}
		avg = (double)total / cnt;
		
		System.out.println(total);
		System.out.println(avg);
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		for (int i = 0; i < myArr.length; ++i) {
			rowTotal = 0;
			for (int j = 0; j < myArr[i].length; ++j) {
				rowTotal += myArr[i][j];
			}
			System.out.println(rowTotal);
		}
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		for (int i = 0; i < myArr[i].length; ++i) {
			colTotal = 0;
			for (int j = 0; j < myArr.length; ++j) {
				colTotal += myArr[j][i];
			}
			System.out.print(colTotal + " ");
		}
	}

}
