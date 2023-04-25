package maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public MapDemo() {
	}

	public static void main(String[] args) {
		String sentence = "to be or not to be";
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		String[] sentenceArray = sentence.split(" ");

		for (String word : sentenceArray) {
			if (myMap.containsKey(word)) {
				myMap.put(word, myMap.get(word)+1);
			} else {
				myMap.put(word, 1);
			}
			
		}
		System.out.println(myMap);

	}
	
	public static void telephoneBook() {
		Map<String, String> phoneDirectory = new HashMap<String, String>();
		
	}

}
