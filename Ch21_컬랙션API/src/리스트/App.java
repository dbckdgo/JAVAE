package 리스트;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		displayList(numbers);

		List<Integer> list = new ArrayList<>();
		list.addAll(numbers);
		list.add(10);
		list.add(11);

		list.remove(0); // 인덱스 번호로제거
		

		displayList(list);
	}

	private static void displayList(List<Integer> list) {
		// TODO Auto-generated method stub
		list.forEach(e -> System.out.println(e));

	}

}
