package 생성자매개변수.copy;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이 Person 생성자메소드가 실행됨
		Person p1 = new Person("길동", 30);
		Person p2 = new Person("팽수", 7);
		Person p3 = new Person("라이너", 26);
		Person p4 = new Person(); // 기본 생성자로 객체 생성
		p2.setAge(11);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p3.getName());
		System.out.println(p3.getAge());

		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3.toString());
		System.out.println(p4);
	}

}
