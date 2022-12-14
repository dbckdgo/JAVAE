package 아이템삭제;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();

		Cat c1 = new Cat("마틸다");
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		cats.add(new Cat("보랑"));

		cats.remove(1); // 인덱스 번호로 삭제
		cats.remove(c1); // 객체로 삭제

		cats.forEach(e -> System.out.println(e));
	}

}
