/******************* Exercise 19 *****************
* Repeat Exercise 18 with a HashSet and
* LinkedHashSet.
*************************************************/

package holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E19_SetOrder {
  public static void main(String[] args) {
	Set<String> s1 =
	  new HashSet<String>(Countries.names(25));
	System.out.println(s1);
	String[] elements = s1.toArray(new String[0]);
	Arrays.sort(elements);
	Set<String> s2 = new LinkedHashSet<String>();
	for(String element : elements)
	  s2.add(element);
	System.out.println(s2);
  }
}
