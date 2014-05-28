/****************** Exercise 12 *****************
* Use TypeCounter with the CoffeeGenerator.java
* class in the Generics chapter.
***********************************************/

package typeinfo;

import java.util.Iterator;

import net.mindview.util.TypeCounter;

public class E12_CoffeeCount {
  public static void main(String[] args) {
	TypeCounter counter = new TypeCounter(Coffee.class);
	for(Iterator<Coffee> it =
	  new CoffeeGenerator(20).iterator(); it.hasNext();) {
	  Coffee coffee = it.next();
	  System.out.println(coffee.getClass().getSimpleName() + " ");
	  counter.count(coffee);
	}
	System.out.println();
	System.out.println(counter);
  }
}
