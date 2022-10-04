package arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Interatingv {

	public static void main(String[] args) {
		// 반복문 사용하기
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(123);

		for (Integer i : list) {
			System.out.println(i);
		}
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			System.out.println(i + ":" + n);
//			인덱스 번호를 쓸수있다
//			System.out.println(i);
		}
		// 3 람다식
		list.forEach(n -> System.out.println(n));

	}
}
