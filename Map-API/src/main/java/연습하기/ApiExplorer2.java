package 연습하기;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.json.XML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import gui.AddressVO;
import gui.MainFrame;

import java.awt.Frame;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class ApiExplorer2 {
	연습하기.MainFrame mainFrame2;
	static String serviceKey = "SBoAA3IbVJ2mgKH2jNe0KAPi7a%2F6jFgOeYTB%2BvGdpBI0WRDyv60VTAMZbWNbM%2F7jtpKfGZYx0kZnKRqbUomGuA%3D%3D";
	static int pageNo = 1;
	static int numOfRows = 10;

	public ApiExplorer2(연습하기.MainFrame mainFrame2) throws IOException, ParseException {
//		this.mainFrame = mainFrame;
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/6260000/BusanCultureExhibitDetailService/getBusanCultureExhibitDetail"); /*
																													 * URL
																													 */
		urlBuilder.append("?serviceKey=" + serviceKey);
		urlBuilder.append("&pageNo=" + pageNo); /* 페이지번호 */
		urlBuilder.append("&numOfRows=" + numOfRows); /* 한 페이지 결과 수 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
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

//		JSONParser jsonParser = new JSONParser(); // jsonPrser(제이ㅡㄴ변환) 객체를 만들고
//		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
//		JSONObject parsebody = (JSONObject) jsonObject.get("body");
//		JSONObject parseitems = (JSONObject) parsebody.get("items");

		String xm = sb.toString();
		// xml을 json으로 변환
		org.json.JSONObject json = XML.toJSONObject(xm);
		String jsonStr = json.toString(4);
//		System.out.println(jsonStr);

		JSONParser jsonParser = new JSONParser(); // jsonPrser(자손 변환) 객체를 만들고
		JSONObject obj = (JSONObject) jsonParser.parse(jsonStr);
		JSONObject parsebody = (JSONObject) obj.get("response");
		JSONObject ob1 = (JSONObject) parsebody.get("body");
		JSONObject ob2 = (JSONObject) ob1.get("items");

		JSONArray arr = (JSONArray) ob2.get("item");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			System.out.println("타이틀" + ob.get("title"));
			System.out.println("타이틀" + ob.get("dabom_url"));

			ItemsVO vo = new ItemsVO();
			vo.setTitle((String) ob.get("title"));
			vo.setDabom_url((String) ob.get("dabom_url"));

			Apiex(vo);

		}
	}

	private void Apiex(ItemsVO vo) {

		mainFrame2.resTitle.setText(vo.getTitle());
		mainFrame2.resUrl.setText(vo.getDabom_url());

	}
}
