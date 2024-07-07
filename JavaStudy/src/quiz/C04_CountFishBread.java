package quiz;

import java.util.Scanner;

import myobj.FishBread;

public class C04_CountFishBread {

	/*
		1. 붕어빵 클래스를 만들어 보세요.
			
			- 붕어빵의 속성은 맛, 가격, 품질이 있다.
			- 맛과 품질은 인스턴스 생성 시 랜덤으로 결정됨
			- 가격은 팥 800원, 슈크림 1000원, 민트초코 1200원이고 품질에 따라 +-100원이 된다.(품질은 상/중/하)
			
		2. 설계한 클래스를 활용하여 붕어빵을 100개 만들고 어떤 맛 붕어빵이 몇 개 있는지 세어보세요.
		
		3. n개의 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는 함수를 만들어보세요.
	 */
	
	public static void main(String[] args) {
		FishBread[] fb = new FishBread[100];
		int len = fb.length, redBeanQty = 0, custardCreamQty = 0, mintChocoQty = 0;
		
		for (int i = 0; i < len; ++i) {
			if (fb[i].equals("redBean")) {
				++redBeanQty;
			} else if (fb[i].equals("custardCream")) {
				++custardCreamQty;
			} else if (fb[i].equals("mintChoco")) {
				++mintChocoQty;
			}
		}
		
		System.out.printf("팥: %d개, 슈크림: %d개, 민트초코: %d개\n", redBeanQty, custardCreamQty, mintChocoQty);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("붕어빵의 총 개수 입력: ");
		n = sc.nextInt();
		
		FishBread[] fb2 = new FishBread[n];
		int len2 = fb2.length;
		
		for (int i = 0; i < len2; ++i) {
			
		}
	}

}
