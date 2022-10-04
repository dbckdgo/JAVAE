package application;

public class Regex {

	public static void main(String[] args) {
		// 정규표현식
		System.out.println("Cat".matches("cat"));
		System.out.println("Cat".matches("[Cc]at"));
		System.out.println("Cat".matches("[a-z]at"));
		System.out.println("Cat".matches("[a-zA-Z]at"));
		System.out.println("Cat".matches("Cat"));
		System.out.println("Cat".toLowerCase().matches("cat"));
		System.out.println("Cat".toLowerCase().matches("Cat"));

		// \d 는 숫자 \w 는 문자 \w+ 한개이상의문자
		// 전화번호 형식이 맞는지 체크 (010)-\\d{3,4}-\\d{4}
		boolean cheak = "010-1212-3434".matches("(010)-\\d{3,4}-\\d{4}");
		System.out.println("전화번호 체크" + cheak);
		
		//이메일 형식이 맞는지 체크 \w+@\w\.\w+
		boolean ch1  ="ttt@aver.com".matches("\\w+@\\w+\\.\\w+");
		System.out.println("이메일" +ch1);
	}

}
