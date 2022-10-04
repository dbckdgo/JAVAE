package demo;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ParshingJson {

	public static void main(String[] args) {

		String src = "info.json";
		// 파일에서 JSON 데이터를가져옴 (Parshing)
		InputStream is = ParshingJson.class.getResourceAsStream(src);

		if (is == null) {
			throw new NullPointerException("v파일이없음");
		}

		JSONTokener tokener = new JSONTokener(is); // 제이슨 데이터를 tokener에 넣기
		JSONObject object = new JSONObject(tokener); // 제이슨 객체변환
//		요까지는똑같다.

		System.out.println(object);
		JSONArray employees = object.getJSONArray("employees");
		System.out.println(employees);
		for (Object emp : employees) {
			JSONObject employee = (JSONObject)emp;
			System.out.print(employee.get("id") + "\t");
			System.out.print(employee.get("name") + "\t");
			System.out.println(employee.get("email"));
		}

	}

}
