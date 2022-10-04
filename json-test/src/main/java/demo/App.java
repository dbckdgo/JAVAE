package demo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;

public class App {

	public static void main(String[] args) {
		// 자바 list를 json으로 변환
		Gson gson = new Gson();

//		Employee e1 = new Employee(1234, "길동", "gill@google.com");
//		Employee e2 = new Employee(1235, "펭수", "peng@google.com");
//		List<Employee> list = new ArrayList<>();
//
//		list.add(e1);
//		list.add(e2);
//
//		String jsonString = new Gson().toJson(list);
//		System.out.println(jsonString);

		String jsonString = "[{\"id\":1234,\"name\":\"길동\",\"email\":\"gill@google.com\"},{\"id\":1235,\"name\":\"펭수\",\"email\":\"peng@google.com\"}]";
		List<Employee> list = gson.fromJson(jsonString, new TypeToken<List<Employee>>() {
		}.getType());
		System.out.println(list);
	}
}
