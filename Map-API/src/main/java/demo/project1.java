package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class project1 {
	private static String clientID = "o3gxeagv3l";
	private static String sceretKey = "iIdlMH1nASfRnbiPMRzQeuXoiJvp6NEuo5rJrOer";

	public static void main(String[] args) throws IOException, ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주소를 입력하시오 : ");
		String address = scanner.nextLine();
		scanner.close();

		StringBuilder urlBuilder = new StringBuilder(
				"https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=");
		urlBuilder.append(URLEncoder.encode(address, "UTF-8")); // 한글 주소를 utf-8로 인코딩해서 요청함

		URL url = new URL(urlBuilder.toString()); // url주소 객체 생성
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 연결설정
		conn.setRequestMethod("GET");
		conn.setRequestProperty("content-type", "application/json");
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", sceretKey);

		BufferedReader br;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		conn.disconnect();
//		System.out.println(sb.toString());
		JSONParser jsonParser = new JSONParser(); // jsonPrser(제이ㅡㄴ변환) 객체를 만들고
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		JSONArray arr = (JSONArray) jsonObject.get("addresses");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
//			 System.out.println(employee.toString());
			System.out.println("address:" + ob.get("roadAddress"));
			System.out.println("jibunAddress:" + ob.get("jibunAddress"));
			System.out.println("경도:" + ob.get("x"));
			System.out.println("위도:" + ob.get("y"));

			String x = (String) ob.get("x");
			String y = (String) ob.get("y");
			String z = (String) ob.get("roadAddress");

			mapService(x, y, z);
		}
	}

	private static void mapService(String x, String y, String address) throws IOException {
		// 위도 경도값 을 가지고 지도 이미지를 받아오기 (주소는표시용)
		String mapURL = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		String pos = URLEncoder.encode(x + " " + y, "UTF-8");
		mapURL += "center=" + x + "," + y;
		mapURL += "&level=16&w=700&h=500";
		mapURL += "&markers=type:t|wize:mid|pos:" + pos + "|labele:" + URLEncoder.encode(address, "UTF-8");

		URL url = new URL(mapURL);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 연결설정
		conn.setRequestMethod("GET");
//		conn.setRequestProperty("content-type", "application/json"); 컨텐트 타입은 이미지로 되어있어서 지움
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", sceretKey);

		int resposeCode = conn.getResponseCode();

		if (resposeCode == 200) {
			InputStream is = conn.getInputStream();// 이미지를받기위한입력리스트

			byte[] bytes = new byte[1024];
			// 랜덤 이미지 파일이름
			String time = Long.valueOf(new Date().getTime()).toString();
			File f = new File(time + ".jpg");
			f.createNewFile(); // 파일생성
			OutputStream outputStream = new FileOutputStream(f);
			int read = 0;
			while ((read = is.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.close();
			is.close();
		} else { // 에러 발생
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			conn.disconnect();
			System.out.println(response.toString());
		}

	}
}
