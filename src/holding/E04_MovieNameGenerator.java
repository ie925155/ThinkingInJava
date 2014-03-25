/****************** Exercise 4 ******************
* Create a generator class that produces String objects
* with the names of characters from your favorite
* movie each time you call next(), and then loops
* around to the beginning of the character list
* when it runs out of names. Use this generator to
* fill an array, an ArrayList, a LinkedList, a
* HashSet, a LinkedHashSet, and a TreeSet, then
* print each container.
***********************************************/

package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

interface Generator<String>{
	String next();
}

class MovieNameGenerator implements Generator<String> {
  String[] characters = {
	"Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
	"Bashful", "Snow White", "Witch Queen", "Prince"
  };
  int next;
  public String next() {
	String r = characters[next];
	next = (next + 1) % characters.length;
	return r;
  }	
}

public class E04_MovieNameGenerator  {
  private static final MovieNameGenerator mng =
	new MovieNameGenerator();
	static String[] fill(String[] array) {
	  for(int i = 0; i < array.length; i++)
	    array[i] = mng.next();
	  return array;
	}
	static Collection<String>
	fill(Collection<String> collection) {
	  for(int i = 0; i < 5; i++)
		collection.add(mng.next());
	  return collection;
	}
	public static void main(String[] args) {
	  System.out.println(Arrays.toString(fill(new String[5])));
	  System.out.println(fill(new ArrayList<String>()));
	  System.out.println(fill(new LinkedList<String>()));
	  System.out.println(fill(new HashSet<String>()));
	  System.out.println(fill(new LinkedHashSet<String>()));
	  System.out.println(fill(new TreeSet<String>()));
	}	
}
