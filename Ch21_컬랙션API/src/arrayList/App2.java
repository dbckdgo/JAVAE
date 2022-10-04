package arrayList;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("길동"));
		people.add(new Person("듈리"));

		people.forEach(t -> System.out.println(t));
		
		System.out.println();

		for (Person p : people) {
			System.out.println(p);
		}

	}

}
