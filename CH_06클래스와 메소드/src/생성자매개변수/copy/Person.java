package 생성자매개변수.copy;

public class Person {

	private String name;
	private int age;

	public Person() {
	} // 기본 생성자

	// 이름과 나이가 들어가는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("한사람을 생성");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// toString 매소드 객체의 정보를 한눈에 보기
	public String toString() {
		String text ="이름: "+name+ " 나이:" +age;
		return text;
	}

}
