/****************** Exercise 29 *****************
* Create a generic method that takes as an
* argument a Holder<List<?>>. Determine what
* methods you can and can¡¦t call for the Holder
* and for the List. Repeat for an argument of
* List<Holder<?>>.
************************************************/

package generics;

import java.util.ArrayList;
import java.util.List;

public class E29_WildcardTest {
  static void f1(Holder<List<?>> holder) {
	List<?> list = holder.get();
	System.out.println(holder.equals(list));
	// Compile errors:
	// list.add(1);
	// list.add(new Object());
	Integer i = (Integer)list.get(0);
	System.out.println(i);
	System.out.println(list.contains(i));
	System.out.println(list.remove(i));
	holder.set(new ArrayList<Float>());
  }
  static void f2(List<Holder<?>> list) {
	Holder<?> holder = (Holder<?>)list.get(0);
	System.out.println(holder.equals(Integer.valueOf(1)));
	// Compile error:
	// holder.set(new Integer(2));
	System.out.println(holder.get());
	list.add(new Holder<Float>(1.0F));
	System.out.println(list.get(1).get());
	list.remove(0);
	System.out.println(list.size());
  }
  public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);
	f1(new Holder<List<?>>(list1));
	List<Holder<?>> list2 = new ArrayList<Holder<?>>();
	list2.add(new Holder<Integer>(1));
	f2(list2);
  }
}
