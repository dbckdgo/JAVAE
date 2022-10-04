package 메소드;

public class Person {
	// 인스턴스(객체) 변수(객체로 생성되어야만 사용 가능)
	String name;
	int age;

	// 메소드(클래스 안에있는 함수)
	// void 타입은 리턴이 없음
//    타입 함수명(매개변수) {함수코드}       
	void sayHi() {
		System.out.println("하이 " + name);
	}
}
