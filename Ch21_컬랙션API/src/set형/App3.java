package set형;

import java.util.Set;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		// 트리셋 중복이 안되고 정렬됨
		Set<String> fruits = new TreeSet<>();
		Set<Integer> list = new TreeSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		list.add(99);
		list.add(54);
		list.add(7);
		list.add(0);
		list.add(75);
		list.add(67);

		System.out.println(fruits.contains("오렌지")); // contains 있나 없나 확인
		fruits.forEach(e -> System.out.println(e));

		list.forEach(e -> System.out.println(e));

	}
}
