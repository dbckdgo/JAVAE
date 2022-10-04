package App;

/*class Person {
	// 인스턴스(객체) 변수(객체로 생성되어야만 사용 가능)
	String name;
	int age;
}
다른패키지에 있는 calss 불러올러면 import 써야함*/


public class ClassObject {

	public static void main(String[] args) {
		// 클래스는 설계도로 실제 사용가능한 객체를 생성
		Person p1 = new Person(); // new 키워드로메모리에 person객체 생성
		p1.name = "펭수";
		p1.age = 7;
		Person p2 = new Person(); // new 키워드로메모리에 person객체 생성
		p2.name = "길동";
		p2.age = 17;

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p2.age);

	}

}
