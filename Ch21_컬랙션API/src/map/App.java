package map;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 키값으로해당 value 값을 가져옴
		HashMap<Integer, String> list = new HashMap<>();

		list.put(0, "펭수");
		list.put(1, "길동");
		list.put(3, "라이엉");
		list.put(4, "프레드");
		list.put(4, "마이클"); //키값 중복안되고 같은 키면 값이 업데이트된다
		list.put(10, "수지");
		
		System.out.println(list.get(1)); //키값으로 value 가져오기

		list.forEach((e, k) -> System.out.println(e + ":" + k));
		
		//반복문쓰기 (람다식 말고)
		for(String s : list.values()) {
			System.out.println(s);
		}
		for(int i : list.keySet()) {
			System.out.println(i);
		}

	}

}
