package demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Project1 {
	MainFrame mainFrame;

	public Project1(MainFrame mainFrame) throws IOException {
		this.mainFrame = mainFrame;
		// 주소입력창의 주소가져오기
		String code = mainFrame.code.getText();

		String url = "https://finance.naver.com/item/main.naver?code=" + code;

		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); // 해당 주소 사이트의html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 종목의 여러가지 정보 태그들
		Elements todaylist = doc.select(".new_totalinfo dl>dd");

		String time = todaylist.get(0).text(); // 첫번재 dd 태그 날짜시간
		String name = todaylist.get(1).text().split(" ")[1]; // 두번째 dd 종목명
		String juga = todaylist.get(2).text().split(" ")[1]; // tp번째 dd 주가
		String dungRakrate = todaylist.get(3).text().split(" ")[6];
		String siga = todaylist.get(5).text().split(" ")[1];
		String goga = todaylist.get(6).text().split(" ")[1];
		String zeoga = todaylist.get(8).text().split(" ")[1];
		String georaeryang = todaylist.get(10).text().split(" ")[1];
		// 상한가, 상승, 보합, 하한가 , 하락
		String stype = todaylist.get(3).text().split(" ")[3]; // 상한가,상승,보합,하한가,하락 구분
		// 어제와 가격 비교
		String vsYesterday = todaylist.get(3).text().split(" ")[4];

		System.out.printf("============== %s ================\n", name); // 종목명
		System.out.println("주가:" + juga);
		System.out.println("등락률:" + dungRakrate + "%");
		System.out.println("시가:" + siga);
		System.out.println("고가:" + goga);
		System.out.println("저가:" + zeoga);
		System.out.println("거래량:" + georaeryang);
		System.out.println("타입:" + stype);
		System.out.println("전일대비:" + vsYesterday);
		System.out.println("가져오는 시간:" + time);

		josicVO vo = new josicVO();
		vo.setJuga(juga);
		vo.setDungRakrate(dungRakrate);
		vo.setSiga(siga);
		vo.setGoga(goga);
		vo.setJuga(zeoga);
		vo.setGeoraeryang(georaeryang);
		vo.setStype(stype);
		vo.setVsYesterday(vsYesterday);
		vo.setTime(time);

		josicService(vo);
	}

	private void josicService(josicVO vo) {

		mainFrame.Juga.setText("주가 : " + vo.getJuga());
		mainFrame.DungRakrate.setText("등락률" + vo.getDungRakrate());
		mainFrame.Siga.setText("시가 :" + vo.getSiga());
		mainFrame.Goga.setText("고가 : " + vo.getGoga());
		mainFrame.Zeoga.setText("저가 : " + vo.getZeoga());
		mainFrame.Georaeryang.setText("거래량 : " + vo.getGeoraeryang());
		mainFrame.Stype.setText("타입 : " + vo.getStype());
		mainFrame.VsYesterday.setText("전일대비 : " + vo.getVsYesterday());
		mainFrame.Time.setText("가져오는시간 : " + vo.getTime());

	}

}
