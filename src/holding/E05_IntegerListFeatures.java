/****************** Exercise 5 ******************
* Use Integers instead of Pets to modify
* ListFeatures.java (remember autoboxing).
* Explain any difference in results.
***********************************************/

package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class E05_IntegerListFeatures {
  static Random rand = new Random(47);
  public static void main(String[] args) {
	List<Integer> ints = new ArrayList<Integer>(
	  Arrays.asList(1, 2, 3, 4, 5, 6, 7));
	System.out.println("1: " + ints);
	ints.add(8);
	System.out.println("2: " + ints);
	System.out.println("3: " + ints.contains(8));
	ints.remove(Integer.valueOf(8));
	Integer i = ints.get(2);
	System.out.println("4: " + i + " " + ints.indexOf(i));
	Integer j = Integer.valueOf(1);
	System.out.println("5: " + ints.indexOf(j));
	System.out.println("6: " + ints.remove(j));
	System.out.println("7: " + ints.remove(i));
	System.out.println("8: " + ints);
	ints.add(3, 0);
	System.out.println("9: " + ints);
	List<Integer> sub = ints.subList(1, 4);
	System.out.println("subList: " + sub);
	System.out.println("10: " + ints.containsAll(sub));
	Collections.sort(sub);
	System.out.println("sorted subList: " + sub);
	System.out.println("11: " + ints.containsAll(sub));
	Collections.shuffle(sub, rand);
	System.out.println("shuffled subList: " + sub);
	System.out.println("12: " + ints.containsAll(sub));
	List<Integer> copy = new ArrayList<Integer>(ints);
	sub = Arrays.asList(ints.get(1), ints.get(4));
	System.out.println("sub: " + sub);
	copy.retainAll(sub);
	System.out.println("13: " + copy);
	copy = new ArrayList<Integer>(ints);
	copy.remove(2);
	System.out.println("14: " + copy);
	copy.removeAll(sub);
	System.out.println("15: " + copy);
	copy.set(1, 9);
	System.out.println("16: " + copy);
	copy.addAll(2, sub);
	System.out.println("17: " + copy);
	System.out.println("18: " + ints.isEmpty());
	ints.clear();
	System.out.println("19: " + ints);
	System.out.println("20: " + ints.isEmpty());
	ints.addAll(Arrays.asList(1, 2, 3, 4));
	System.out.println("21: " + ints);
	Object[] o = ints.toArray();
	System.out.println("22: " + o[3]);
	Integer[] ia = ints.toArray(new Integer[0]);
	System.out.println("22: " + ia[3]);
  }
}
