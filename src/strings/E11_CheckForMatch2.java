/************************** Exercise 11 ******************
*Apply the regular expression
* (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
* to
* "Arline ate eight apples and one orange while Anita
* hadn't any"
*********************************************************/

package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E11_CheckForMatch2 {
  public static void main(String[] args) {
	Pattern p = Pattern.compile(
	  "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
	  Matcher m = p.matcher("Arline ate eight apples and " +
	    "one orange while Anita hadn't any");
	while(m.find()) {
	  System.out.println("Match \"" + m.group() +
		"\" at positions " + m.start() + "-" +
		  (m.end() - 1));
	}	
  }
}
