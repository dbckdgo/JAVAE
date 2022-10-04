package gettersetter;

public class Person {
//다른클래스에서 접근 불가 private 키워드
	private String name;
	private int age;

	// get(값을 리턴) set(값을 입력) 메소드 를 통해서 변수에 접근가능
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name; // 이름을 리턴
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age; // 나이 리턴
	}
}
