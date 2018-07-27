/**
 * In this project, you will implement a letter frequency counter, which 
 * calculate the number of occurrences of each letter in a given list of 
 * words
 * https://www.mtholyoke.edu/courses/quenell/s2003/ma139/js/count.html
 */
package letters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterFrequency {

	private ArrayList<String> wordList;

	public LetterFrequency(String fileName) {
		wordList = new ArrayList<String>();
		loadWords(fileName);
	}

	/**
	 * This method loads the words from a given file
	 * 
	 * @param fileName
	 *            input file name DO NOT MODIFY
	 */
	private void loadWords(String fileName) {
		// This will reference one line at a time
		String line = null;
		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.startsWith("#"))
					continue;
				String reg = "[\\W\\d\\s\\,]";
				String[] words = line.split(reg);
				// String[] c = line.split(",");
				for (String s : words) {
					if (!s.isEmpty())
						wordList.add(s);
				}
			}
			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : wordList) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * 
	 * ALL WORDS ARE STORED IN wordList ARRAYLIST ! You need to iterate through each
	 * word and Calculate the frequency of letters in all words in wordList
	 * 
	 * @return an ArrayList of integers. First element of this is the frequency of
	 *         a, second element is the frequency of b, and so on.
	 * 
	 *         EXAMPLE: if wordList has ["cat","dog","turtle"] freq() --> returned
	 *         arraylist values:
	 *         [1,0,1,1,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,3,1,0,0,0,0,0]
	 * 
	 *         each number in returned arraylist represent how many times each
	 *         letter appears in wordsList arraylist(a:1,b:0,c:1....so on)
	 * 
	 */
	public ArrayList<Integer> freq() {
		// TODO
		int[] intArr = new int[26];
		for (int i = 0; i < wordList.size(); i++) {
			String word = wordList.get(i).toLowerCase();
			for (int j = 0; j < word.length(); j++) {
				char letter = word.charAt(j);
				for (int k = 97; k < 123; k++) {
					if (letter == k) {
						//intArr[k - 97]++;
						intArr[k % 97]++;
						break;
					}
				}
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int n : intArr) {
			result.add(n);
		}

		return result;
	}
}
