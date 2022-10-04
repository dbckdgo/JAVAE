package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Double> numbers = new LinkedList<>();

		while (true) {
			System.out.println("숫자 'q' 입력 >");
			String input = scanner.nextLine().trim();
//			input = input.trim();
			if (input.equalsIgnoreCase("q"))
				break;

			try {
				double value = Double.parseDouble(input);
				numbers.add(value);
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다");
			}
		}

		System.out.println();
		if (numbers.isEmpty()) {
			System.out.println("입력된 숫자가 없습니다");
		} else {
			System.out.println("입력된 숫자 : ");
			double total = 0;
			for (Double n : numbers) {
				System.out.printf("%.2f\n", n);
				total += n;
			}

			System.out.println("평균값 : " + total / numbers.size());
		}
	}
}
