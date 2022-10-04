package demo;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project2 {

	public static void main(String[] args) {
		String url = "http://www.cgv.co.kr/movies/";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); // 해당 주소 사이트의html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 선택한 태그 및 자식태그 포함 태그들을 다 가져오기
		Elements elements = doc.select("div.sect-movie-chart");

		System.out.println("================");
		// el1은 순위들을 저장 , el2는 제목을저장
		Iterator<Element> el1 = elements.select("strong.rank").iterator();
		Iterator<Element> el2 = elements.select("strong.title").iterator();

//		hasNext()는 다음객체가 있으면 true 없으면 false 로 다음객체가 없으면 ㄷ반복문종료
		while (el1.hasNext()) {
			System.out.println(el1.next().text() + "\t" + el2.next().text());
		}
	}
}
