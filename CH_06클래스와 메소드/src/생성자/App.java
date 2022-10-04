package 생성자;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                         이 Person 생성자메소드가 실행됨
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.setName ("길동");
		p1.setAge(30);
	
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2);
		System.out.println(p3);
	}

}
