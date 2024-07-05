
public class B06_Operator3 {

	/*
		# 대입 연산자
		
			= : 왼쪽의 변수에 오른쪽의 값을 넣는다.
			
		# 복합 대입 연산자
		
			+= : 왼쪽의 변수에 오른쪽의 값을 더해서 누적시킨다.
			-= : 왼쪽의 변수에 오른쪽의 값을 빼서 누적시킨다.
			*= : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적시킨다.
			/= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적시킨다.
			%= : 왼쪽의 변수에 왼쪽의 변수를 오른쪽의 값으로 나눈 나머지를 저장한다.
			
			&= : AND 연산 누적
			|= : OR 연산 누적
			^= : XOR 연산 누적
			
		# 단항 연산자
		
			++ : 해당 변수에 1을 더해서 누적
			-- : 해당 변수에 1을 빼서 누적
	 */
	
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a); // 10
		a = 5;
		System.out.println(a); // 5
		a = a + 3;
		System.out.println(a); // 8
		a += 2;
		System.out.println(a); // 10
		
		a = 30;
		
		a += 3;
		System.out.println(a); // 33
		a -= 15;
		System.out.println(a); // 18
		a *= 3;
		System.out.println(a); // 54
		a /= 7.0;
		System.out.println(a); // 7
		a %= 2;
		System.out.println(a); // 1
		
		System.out.println(a = 22); // 22
		System.out.println(a += 3); // 25
		
		System.out.println(a); // 25
		
		boolean everyoneAgree = false;
		
		everyoneAgree &= true;
		everyoneAgree &= true;
		everyoneAgree &= false;
		everyoneAgree &= true;
		everyoneAgree &= true;
		
		System.out.println("모두가 동의했나요? " + everyoneAgree); // 모두가 동의했나요? false
		
		// 비트 연산
		int num = 10;
		num &= 3;
		System.out.println(num); // 2
		
		a = 15;
		
		a++;
		System.out.println(a); // 16
		++a;
		System.out.println(a); // 17
		a--;
		System.out.println(a); // 16
		--a;
		System.out.println(a); // 15
		
		a = 10;
		System.out.println(a++); // 10
		System.out.println(a); // 11
		System.out.println(++a); // 12
		System.out.println(a); // 12
	}

}
