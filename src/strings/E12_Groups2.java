/************************** Exercise 12 ******************
* Modify Groups.java to count all unique words
* with no initial capital letter.
*********************************************************/

package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E12_Groups2 {
  public static void main(String[] args) {
	Set<String> words = new HashSet<String>();
	Matcher m =
	  Pattern.compile("\\b((?![A-Z])\\w+)\\b")
	  .matcher(Groups.POEM);
	while(m.find())	
	  words.add(m.group(1));	  
	  System.out.println("Number of unique words = " + words.size());
	  System.out.println(words.toString());
	}
}
