package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeOperationsException;

public class TimeCheck {

	public static void main(String[] args) {
		// 링크드 vs 어레이리시트
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		long duration = timeOperations(linkedList);
		System.out.println("측정시간" + duration);
	}

	private static long timeOperations(List<Integer> list) {
		// f리스트의 동작시간을 측정한다
		long start = System.currentTimeMillis(); // 현재시간(ms)
		for (int i = 0; i < 100000; i++) {
//			list.add(0, i); 0번째에 i값을 계쏙 넣음
			list.add(i);
		}
		return System.currentTimeMillis() - start;
	}

}
