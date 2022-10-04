package set형;

public class Ex1 {

	public static void main(String[] args) {
		// set 예제 1
		String text1 = "The Kremlin paved the way Tuesday to annex more of Ukraine and escalate the war by claiming that residents of a large swath overwhelmingly supported joining with Russia in stage-managed referendums the U.S. and its Western allies have dismissed as illegitimate.";
		String text2 = "소속사 후크 엔터테인먼트는 28일 짤막한 공식입장문을 통해 “금일 보도된 박민영 보도와 관련한 소속사 입장을 전한다. 현재 박민영이 드라마 ‘월수금화목토’ 촬영에 임하고 있어, 사실 관계 확인이 늦어지고 있다. 정확한 입장을 신속히 전달하지 못하고 있는 점 양해 부탁한다”고 전했다.";

//		String[] words = text1.split("[^a-zA-Z]+"); -사이에 띄어쓰면 안됨
		String[] words = text2.split("[^가-힣]+");

		for (String word : words) {

			if (word.length() <= 2)
				continue;
			System.out.println(word.toLowerCase()); // 소문자로출력
		}
	}

}
