import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class D06_Collections {

	/*
		# java.util.Arrays
		
			- 배열을 편하게 다룰 수 있는 기능들이 모여있는 클래스
			
		# java.util.Collections
		
			- 컬렉션들을 편하게 다룰 수 있는 기능들이 모여있는 클래스
	 */
	
	public static void main(String[] args) {
		// Arrays.asList(배열) : 전달한 배열을 리스트로 만들어 반환한다.
		// 이 메서드로 만든 리스트는 기능들이 미구현 상태이다.
		List<Integer> list = new LinkedList<>(Arrays.asList(new Integer[] {10, 10, 10, 10, 11, 12}));
		
		list.add(3, 33);
		
		System.out.println(list); // [10, 10, 10, 33, 10, 11, 12]
		
		// Arrays.copyOf(origin, length) : 해당 배열의 복사본을 만들어 반환한다.
		String[] zoo = {"사자", "코끼리", "판다", "악어", "돌고래"};
		String[] subZoo = Arrays.copyOf(zoo, 3);
		
		// Arrays.toString(arr) : 배열을 보기 좋은 문자열로 만들어 반환한다.
		System.out.println(Arrays.toString(subZoo)); // [사자, 코끼리, 판다]
		
		// Arrays.sort(arr) : 전달한 배열의 내용을 크기순으로 정렬해준다.
		// 정렬된 새 인스턴스를 만들어주는 것이 아니라 원본을 정렬해버리므로 주의해야 한다.
		Arrays.sort(zoo);
		System.out.println(Arrays.toString(zoo)); // [돌고래, 사자, 악어, 코끼리, 판다]
		
		// Arrays.fill(arr, value) : 배열의 모든 내용을 하나의 값으로 채워버린다.
		Arrays.fill(zoo, "nothing");
		System.out.println(Arrays.toString(zoo)); // [nothing, nothing, nothing, nothing, nothing]
		
		// Collections.addAll(Collection, values...) : 해당 컬렉션에 값을 여러 개 추가할 수 있다.
		Set<Integer> numSet = new HashSet<>();
		
		Collections.addAll(numSet, 1, 1, 1, 2, 3, 3, 4, 5, 6);
		System.out.println(numSet); // [1, 2, 3, 4, 5, 6]
		
		// Collections.sort(List) : 리스트만 정렬해준다. Set은 정렬이 불가능하다.
		List<String> zooList = new ArrayList() {
			{
				super.add("판다");
				add("곰");
				add("사자");
				add("원숭이");
			}
		};
		Collections.sort(zooList);
		System.out.println(zooList); // [곰, 사자, 원숭이, 판다]
		
		// Collections.shuffle(list) : 전달한 리스트의 순서를 섞는다.
		Collections.shuffle(zooList);
		System.out.println(zooList); // [판다, 원숭이, 곰, 사자]
		
		// Collections.frequency(Collection, value) : 전달한 컬렉션에 해당 값이 몇 번 나오는지 알려준다.
		int count = Collections.frequency(numSet, 7);
		System.out.println("numSet에서 7이 몇 번 나오나요? " + count); // numSet에서 7이 몇 번 나오나요? 0
		
		count = Collections.frequency(zooList, "판다");
		System.out.println("판다 몇 번 나오나요? " + count); // 판다 몇 번 나오나요? 1
		
		// Collections.fill(list, value) : 모든 값을 전달한 값으로 수정한다.
		// Set은 값 수정이 불가능하므로 fill도 불가능하다.
		Collections.fill(zooList, "nothing");
		System.out.println(zooList); // [nothing, nothing, nothing, nothing]
	}	
}
