/****************** Exercise 8 ******************
* Modify Exercise 1 so it uses an Iterator to
* move through the List while calling hop().
***********************************************/

package holding;

import java.util.ArrayList;
import java.util.Iterator;

public class E08_GerbilIterator {
  public static void main(String args[]) {
	ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
	for(int i = 0; i < 10; i++)
	  gerbils.add(new Gerbil(i));
	for(Iterator<Gerbil> it = gerbils.iterator();
	  it.hasNext();
	  it.next().hop());	
  }
}
