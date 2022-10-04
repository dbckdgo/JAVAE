package demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class OrgjsonTest {

	public static void main(String[] args) {

		JSONObject jo = new JSONObject();
//		jo.put("id", 1234);
//		jo.put("name", "길도");
//		jo.put("email", "gill@google.com");
//
//		System.out.println(jo.toString());

		
		Employee e1 = new Employee(1234, "길동", "gill@google.com");
		Employee e2 = new Employee(1235, "펭수", "peng@google.com");
      
		JSONObject jo1 = new JSONObject(e1);
		JSONObject jo2 = new JSONObject(e2);
		
		JSONArray employee = new JSONArray();
		employee.put(jo1);
		employee.put(jo2);
		
		JSONObject obj = new JSONObject();
		obj.put("employees", employee);
		
		System.out.println(obj.toString(2));
	
	}

}
