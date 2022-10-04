package demo;

/* Java 1.8 샘플 코드 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimple {
	public static void main(String[] args) throws IOException, ParseException {
		StringBuilder urlBuilder = new StringBuilder("https://api.odcloud.kr/api/15077586/v1/centers"); /* 베이스 주소 */
		urlBuilder.append("?serviceKey="
				+ "SBoAA3IbVJ2mgKH2jNe0KAPi7a%2F6jFgOeYTB%2BvGdpBI0WRDyv60VTAMZbWNbM%2F7jtpKfGZYx0kZnKRqbUomGuA%3D%3D");
		/* Service Key */
		urlBuilder.append("&page=2"); /* 페이지번호 */
		urlBuilder.append("&perPage=10"); /* 한 페이지 결과 수 */
		URL url = new URL(urlBuilder.toString()); // 주소로 url 객체를 생상함
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET"); // 요청매소드
		conn.setRequestProperty("Content-type", "application/json"); // 데이터타입 json으로받겠다
		// http 상태코드임
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());

		JSONParser jsonParser = new JSONParser(); // jsonPrser(제이ㅡㄴ변환) 객체를 만들고
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		JSONArray arr = (JSONArray) jsonObject.get("data");
		System.out.println(arr);

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			System.out.print(ob.get("id") + "\t");
			System.out.print(ob.get("facilityName") + "\t");
			System.out.print(ob.get("address") + "\t");
			System.out.print(ob.get("org") + "\t");
			System.out.print(ob.get("createdAt") + "\t");
			System.out.println(ob.get("phoneNumber"));
		}
	}

}