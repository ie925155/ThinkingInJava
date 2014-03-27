/****************** Exercise 10 ******************
* change Exercise 9 in the Polymorphism chapter
* to use an ArrayList to hold the Rodents and an
* Iterator to move through their sequence.
***********************************************/

package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Rodent {
  public void hop() { System.out.println("Rodent hopping"); }
  public void scurry() { System.out.println("Rodent scurrying"); }
  public void reproduce() { System.out.println("Making more Rodents"); }
  public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
  public void hop() { System.out.println("Mouse hopping"); }
  public void scurry() { System.out.println("Mouse scurrying"); }
  public void reproduce() { System.out.println("Making more Mice"); }
  public String toString() { return "Mouse"; }
}

class Hamster extends Rodent {
  public void hop() { System.out.println("Hamster hopping"); }
  public void scurry() { System.out.println("Hamster scurrying"); }
  public void reproduce() { System.out.println("Making more Hamsters"); }
  public String toString() { return "Hamster"; }
}

public class E10_RodentIterator {
  public static void main(String args[]) {
	ArrayList<Rodent> rodents = new ArrayList<Rodent>(
	  Arrays.asList(
	    new Rodent(), new Mouse(), new Hamster()));
	Rodent r;
	for(Iterator<Rodent> it = rodents.iterator();
	  it.hasNext();) {
	  r = it.next();
	  r.hop();
	  r.scurry();
	  r.reproduce();
	  System.out.println(r);
	}  	
  }
}
