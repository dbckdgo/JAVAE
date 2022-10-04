package school;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student("철수", 30, true, 36.5);
		student s2 = new student("펭수", 35, false, 0);
		student s3 = new student("라리언", 25, true, 36);
		student s4 = new student("영희", 20, true, 36.8);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
