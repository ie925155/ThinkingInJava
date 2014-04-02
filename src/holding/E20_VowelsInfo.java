/****************** Exercise 20 *****************
* Modify Exercise 16 to count the occurrence of
* each vowel.
***********************************************/

package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E20_VowelsInfo {
  private final static Set<Character> vowels =
	new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
	  'i', 'A', 'E', 'O', 'U', 'I'));
  static void
  updateStat(Map<Character,Integer> stat, char letter) {
    Character ch = Character.toLowerCase(letter);
    Integer freq = stat.get(ch);
    stat.put(ch, freq == null ? 1 : freq + 1);
  }
  public static void main(String[] args) {
	HashMap<Character,Integer> fileStat =
	  new HashMap<Character,Integer>();
	HashSet<String> processedWords = new HashSet<String>();
	HashMap<Character,Integer> wordStat =
	  new HashMap<Character,Integer>(); 
	for(String word :
	  new TextFile("E20_VowelsInfo.java", "\\W+")) {
	  wordStat.clear();
	  for(char letter : word.toCharArray())
		if(vowels.contains(letter)) {
		  updateStat(wordStat, letter);
		  updateStat(fileStat, letter);
		}
	  if(!processedWords.contains(word)) {
		  processedWords.add(word);
		  System.out.println("Vowels in " + word + ": " + wordStat);
	  }
	}
	System.out.println("*************************");
	System.out.println("Vowels in the whole file: " + fileStat);	
  }
}
