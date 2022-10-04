package demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project1 {

	public static void main(String[] args) {
		// 네이버 스포츠 뉴스
		String url = "https://sports.news.naver.com/wfootball/index";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); // 해당 주소 사이트의html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 선택한 태그 및 자식태그 포함 태그들을 다 가져오기
		Elements elements = doc.select("div.home_news");
//  System.out.println(elements.toString());
//  제목글자만가져오기
		String title = elements.select("h2").text(); // .substring(0, 4); 문자열이너무길면 0~4 5글자만 잘라넨다
		System.out.println(title);
		System.out.println("============");

		// li태그들중 1개의li를반복해서 내용을출력
		for (Element el : elements.select("li")) {
			System.out.println(el.text());
		}
	}

}
