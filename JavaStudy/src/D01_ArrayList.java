import java.util.ArrayList;
import java.util.List;

public class D01_ArrayList {

	/*
		# 자료 구조(Data Structure)
		
			- 데이터를 가장 효율적으로 다루기 위해 어떻게 해야 하는가를 다루는 학문
			  ex) 수많은 데이터 중 특정 데이터를 찾기 위해서는 어떻게 하는 게 가장 효율적일까?
			      수많은 데이터들을 순서대로 재배치하는 데 가장 효율적인 방법은 무엇일까?
			- 세상에는 이미 수많은 정답들이 알고리즘 형태로 존재하고 있다.
		
		# Java Collections
		
			- 데이터를 효율적으로 다루기 위한 자료 구조들을 구현해놓은 클래스들의 모음을 자바에서는 컬렉션이라고 부른다.
			
		# Java.util.ArrayList
		
			- 배열과 유사하지만 크기가 자동으로 조절되는 자료구조
			- 배열처럼 데이터를 순차적으로 저장하기 아주 좋다.
			- 모든 데이터를 순차적으로 읽는 속도가 가장 빠른 자료구조이다.
	 */
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		// list.add(item) : 해당 리스트의 맨 뒤에 원하는 데이터를 추가한다.
		// 기본적으로 타입의 제약 없이 모든 객체를 추가할 수 있다.
		list.add("사과");
		list.add("오렌지");
		list.add("귤");
		list.add("배");
		list.add(12345.123);
		list.add(123.123);
		
		// add(index, data)
		list.add(4, 999);
		
		System.out.println(list); // [사과, 오렌지, 귤, 배, 999, 12345.123, 123.123]
		System.out.println(list2); // []
		
		// list.get(index) : 리스트의 해당 번째 요소를 꺼내 반환해준다.
		// 어떤 타입으로 꺼내야 할지 모르는 경우 Object 타입으로 꺼낸다.
		System.out.println(list.get(0)); // 사과
		System.out.println(list.get(3)); // 배
		System.out.println(list.get(4)); // 999
		
		// list.size() : 해당 리스트의 크기를 반환한다.
		System.out.println(list.size()); // 7
		
		System.out.println("### 반복문으로 꺼내기 ###");
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
		
		// Object 타입으로 꺼낸 값을 다시 활용하기 위해 다운캐스팅이 필요하다.
		System.out.println((int)list.get(4) + (double)list.get(5)); // 13344.123
		
		// 리스트의 타입을 지정하면서 생성하기 (제네릭 실행)
		ArrayList<String> snacks = new ArrayList<>();
		
		snacks.add("포카칩");
		snacks.add("오감자");
		snacks.add("스윙칩");
		
		System.out.println("0번 과자: " + snacks.get(0)); // 0번 과자: 포카칩
		System.out.println(snacks); // [포카칩, 오감자, 스윙칩]
		
		// 기본형 타입은 제네릭으로 사용할 수 없다.
		// 기본형 타입을 제네릭으로 사용하기 위해서는 참조형 버전을 사용해야 한다.
		ArrayList<Integer> scores = new ArrayList<>();
		
		scores.add(100);
		scores.add(88);
		scores.add(78);
		scores.add(100);
		scores.add(100);
		scores.add(100);
		
		System.out.println(scores); // [100, 88, 78, 100, 100, 100]
		
		// list.remove(index) : 해당 번째 값을 삭제한다.(삭제에 성공한 값을 반환한다.)
		int deleted = scores.remove(0);
		
		System.out.println("삭제에 성공한 값: " + deleted); // 삭제에 성공한 값: 100
		System.out.println(scores); // [88, 78, 100, 100, 100]
		
		// list.remove(value) : 해당 값을 삭제한다. 
		// 일치하는 값이 여러 개면 맨 앞에 있는 값 하나만 지운다.
		// (성공 여부를 반환한다)
		// int의 경우 값으로 삭제하고 싶으면 Integer.valueOf() 메서드를 사용해야 한다.
		boolean result = scores.remove(Integer.valueOf(90));
		System.out.println("삭제 성공 여부: " + result); // 삭제 성공 여부: false
		System.out.println(scores); // [88, 78, 100, 100, 100]
		
		// list.contains(value) : 해당 값의 포함 여부를 반환한다.
		System.out.println("30점 있니? " + scores.contains(30)); // 30점 있니? false
		
		// list.set(index, value) : 해당 번째 값을 원하는 값으로 수정한다.(수정하면서 수정 전 값을 반환해준다)
		int modified = scores.set(0, 9999);
		System.out.println("원래 있던 값: " + modified); // 원래 있던 값: 88
		System.out.println(scores); // [9999, 78, 100, 100, 100]
		
		ArrayList<String> democracy = new ArrayList<>();
		
		democracy.add("South Korea");
		democracy.add("Japan");
		democracy.add("USA");
		democracy.add("South Korea");
		democracy.add("South Korea");
		democracy.add("USA");
		democracy.add("Germany");
		democracy.add("France");
		
		System.out.println(democracy); // [South Korea, Japan, USA, South Korea, South Korea, USA, Germany, France]
		
		// list.sublist(from, to) : 리스트의 일부분을 새로운 리스트로 만들어 반환
		// (from 이상 to 미만)
		List<String> sub1 = democracy.subList(0, 3);
		List<String> sub2 = democracy.subList(3, 6);
		
		System.out.println(sub1); // [South Korea, Japan, USA]
		System.out.println(sub2); // [South Korea, South Korea, USA]
		
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		num1.add(50);
		
		num2.add(40);
		num2.add(50);
		num2.add(60);
		num2.add(70);
		
		System.out.println(num1); // [10, 20, 30, 40, 50]
		System.out.println(num2); // [40, 50, 60, 70]
		
		// list1.addAll(list2) : list1에 list2의 모든 값을 추가한다.
		num1.addAll(num2);
		System.out.println(num1); // [10, 20, 30, 40, 50, 40, 50, 60, 70]
		
		// list1.removeAll(list2) : list1에서 list2에 포함된 모든 값을 삭제한다.
		num1.removeAll(num2);
		System.out.println(num1); // [10, 20, 30]
		
		num1.add(40);
		num1.add(50);
		
		// list1.retainAll(list2) : list1과 list2에 모두 포함된 값만 남긴다.
		num1.retainAll(num2);
		System.out.println(num1); // [40, 50]
	}
}
