/****************** Exercise 13 *****************
* Use TypeCounter with the RegisteredFactories.java
* example in this chapter.
***********************************************/

package typeinfo;

import net.mindview.util.TypeCounter;

public class E13_PartCount {
  public static void main(String[] args) {
	TypeCounter counter = new TypeCounter(Part.class);
	Part part;
	for(int i = 0; i < 20; i++) {
	  part = Part.createRandom();
	  printnb(part.getClass().getSimpleName() + " ");
	  counter.count(part);
	}
	System.out.println();
	System.out.println(counter);
  }
}
