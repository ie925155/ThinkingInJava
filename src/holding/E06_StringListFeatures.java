/****************** Exercise 6 ******************
* Using Strings instead of Pets, modify
* ListFeatures.java . Explain any difference in
* results.
***********************************************/

package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class E06_StringListFeatures {
  static Random rand = new Random(47);
  public static void main(String[] args) {
    List<String> strs = new ArrayList<String>(
	Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
	System.out.println("1: " + strs);
	strs.add("H");
	System.out.println("2: " + strs);
	System.out.println("3: " + strs.contains("H"));
	strs.remove("H");
	String s1 = strs.get(2);
	System.out.println("4: " + s1 + " " + strs.indexOf(s1));
	String s2 = "A";
	System.out.println("5: " + strs.indexOf(s2));
	System.out.println("6: " + strs.remove(s2));
	System.out.println("7: " + strs.remove(s1));
	System.out.println("8: " + strs);
	strs.add(3, "0");
	System.out.println("9: " + strs);
	List<String> sub = strs.subList(1, 4);
	System.out.println("subList: " + sub);
	System.out.println("10: " + strs.containsAll(sub));
	Collections.sort(sub);
	System.out.println("sorted subList: " + sub);
  }
}
