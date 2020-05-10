package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1_WordFinder {

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */

		List<String> words = loadWordList();

//		Stream<String> streamOfWords = words.stream();
//		Stream<String>largePWords = streamOfWords;
//		
//		largePWords
//				
//				.filter(pwords -> pwords.startsWith("p") || pwords.startsWith("P"))
//				.filter(pwords -> pwords.length() > 9)
		// .collect(Collections.toList());

		List<String> pWords = words.stream()
				.filter(thewords -> thewords.startsWith("p") || thewords.startsWith("P") && thewords.length() > 9)
				// . mapToObj(String::valueOf)
				.collect(Collectors.toList());

		System.out.println(pWords);

	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

}
