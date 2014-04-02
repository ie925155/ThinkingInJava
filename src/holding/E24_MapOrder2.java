/******************* Exercise 24 **************************
* Fill a LinkedHashMap with String keys and objects.
* Extract the pairs, sort them based on the keys, and
* re-insert them into the Map.
*********************************************************/

package holding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class E24_MapOrder2 {
  public static void main(String[] args) {
	Map<String,String> m1 =
	  new LinkedHashMap<String,String>(
	Countries.capitals(25));
	System.out.println(m1);
	String[] keys = m1.keySet().toArray(new String[0]);
	Arrays.sort(keys);
	Map<String,String> m2 =
	  new LinkedHashMap<String,String>();
	for(String key : keys)
	  m2.put(key, m1.get(key));
	System.out.println(m2);
  }
}
