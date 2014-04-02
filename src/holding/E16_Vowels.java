/****************** Exercise 16 *****************
* Create a Set of the vowels. Working from
* UniqueWords.java, count and display the number of
* vowels in each input word, and also display the
* total number of vowels in the input file.
***********************************************/

package holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E16_Vowels {
  private final static Set<Character> vowels =
	new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
	 'i', 'A', 'E', 'O', 'U', 'I'));
  public static void main(String[] args) {
	HashSet<String> processedWords = new HashSet<String>();
	int fileVowels = 0;
	int wordVowels;
	for(String word :
	  new TextFile("E16_Vowels.java", "\\W+")) {
	  wordVowels = 0;
	  for(char letter : word.toCharArray())
		if(vowels.contains(letter))
		  wordVowels++;
		if(!processedWords.contains(word)) {
		  processedWords.add(word);
		  System.out.println(word + " has " + wordVowels + " vowel(s)");
		}
		fileVowels += wordVowels;
	}
	System.out.println("Total number of vowels in file: " + fileVowels);
  }
}
