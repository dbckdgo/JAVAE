package 메소드리턴;

class Cat {
//	void getAnimal() {
//		System.out.println("고양이를 리턴합니다.");
	
	//문자열 타입은 문자열을 리턴하는 함수
	String getAnimal() {
		System.out.println("고양이를 리턴합니다.");
		return "고양이";
		
	}
	
	}
public class App {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.getAnimal();
		String a =c1.getAnimal();
		String b =c1.getAnimal();
		String c =c1.getAnimal();
	
		System.out.println(a+b+c);
	
	}

}
