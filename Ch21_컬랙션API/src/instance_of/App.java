package instance_of;

class Creature {
	String name;

}

class Cat extends Creature {

}

public class App {

	public static void main(String[] args) {
		// instanceof 객체 타입이맞으면 true
		Creature c1 = new Creature();
		Creature c2 = new Cat();

		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof Creature);
		System.out.println(c1 instanceof Cat);

		System.out.println("Cat의 객체는?");

		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Creature);
		System.out.println(c2 instanceof Cat);

	}

}
