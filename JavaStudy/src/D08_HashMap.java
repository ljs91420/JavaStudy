import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class D08_HashMap {

	/*
		# Map
		
			- 데이터를 Key/Value 방식으로 저장할 수 있는 자료구조
			- 인덱스 번호 대신 Key값을 사용해 원하는 Value를 꺼낼 수 있다.
			- Key는 중복이 허용되지 않는다.(꺼낼 때 Set으로 꺼낸다.)
			- Value는 중복이 허용된다.(꺼낼 때 Collection으로 꺼낸다.)
	 */
	
	public static void main(String[] args) {
		// 첫번째 제네릭 : Key의 타입
		// 두번째 제네릭 : Value의 타입
		HashMap<String, Object> info = new HashMap<>();
		
		// put(K, V)를 사용해 키와 값을 짝지어서 넣어준다.
		info.put("이름", "임꺽정");
		info.put("나이", 30);
		info.put("군필", true);
		// 같은 Key값으로 put()하면 덮어쓰기 된다.
		info.put("이름", "김말이");
	
		System.out.println(info); // {군필=true, 이름=김말이, 나이=30}
		
		// get(Key) : 키를 사용해 값을 꺼낸다.
		System.out.println(info.get("이름")); // 김말이
		System.out.println(info.get("나이")); // 30
		System.out.println(info.get("군필")); // true
		
		// map.keySet() : 해당 맵에 들어있는 모든 키를 Set타입으로 꺼내온다.
		Set<String> keys = info.keySet();
		
		System.out.println("모든 키들: " + keys); // 모든 키들: [군필, 이름, 나이]
		
		// map.values() : 해당 맵에 들어있는 모든 값을 Collection타입으로 꺼내온다.
		Collection<Object> values = info.values();
		
		System.out.println("모든 값들: " + values); // 모든 값들: [true, 김말이, 30]
		
		HashMap<Integer, String> map2 = new HashMap<>();
		
		map2.put(10, "강아지");
		map2.put(0, "호랑이");
		map2.put(3, "고양이");

		System.out.println(map2); // {0=호랑이, 3=고양이, 10=강아지}
		
		// map.containsKey(Key) : 해당 키 값이 있는지 여부를 반환
		System.out.println("키 중에 10이 있나요? " + map2.containsKey(10)); // 키 중에 10이 있나요? true
		
		// map.containsValue(Value) : 해당 값이 있는지 여부를 반환
		System.out.println("값 중에 칠면조 있나요? " + map2.containsValue("칠면조")); // 값 중에 칠면조 있나요? false
		
		HashMap<String, Integer> scores = new HashMap<>();
		
		scores.put("김민수", 880);
		scores.put("김동우", 2395);
		
		System.out.println(scores); // {김동우=2395, 김민수=880}
		
		// putIfAbsent(Key, Value) : 최초 추가라면 값을 추가하고 이미 존재하는 값이 있다면 값을 수정하지 않고 값을 꺼낸다. 
		Integer value = scores.putIfAbsent("김동우", 0);
		
		System.out.println("반환된 값:" + value); // 반환된 값:2395
		
		// remove(key) : 해당 키 값을 삭제하고 방금 삭제한 값을 반환한다.
		value = scores.remove("김동우");
		
		System.out.println("삭제된 값: " + value); // 삭제된 값: 2395
		
		// remove(key, value) : 해당 키 값을 삭제하는데 값이 일치하는 경우에만 삭제한다.
		boolean result = scores.remove("김민수", 110);
		System.out.println("삭제 여부: " + result); // 삭제 여부: false
		
		System.out.println(scores); // {김민수=880}
	}
}
