package set형;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {

		File Frankenstein = new File("84-0.txt");

		System.out.println(Frankenstein.exists());

		TreeSet<String> frank = loadwords(Frankenstein);

		displaywords(frank);

		System.out.println(frank.size());

	}

	private static void displaywords(TreeSet<String> frank) {

		// 화면에 단어들을 출력하는 메소드
		int count = 0;
		for (String f : frank) {
			if (f.length() < 6)
				continue;
			System.out.printf("%10s  ", f.toLowerCase());
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	/*
	 * txt 책의 모든 단어를
	 * 
	 * 
	 * 
	 */

	private static TreeSet<String> loadwords(File file) {
		// 파일읽기
		TreeSet<String> wordset = new TreeSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				for (String word : words) {
					wordset.add(word);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음");

		} catch (IOException e1) {
			System.out.println("파일 못읽음");
		}
		return wordset;
	}

}
