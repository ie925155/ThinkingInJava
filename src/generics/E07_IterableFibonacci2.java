/****************** Exercise 7 *****************
* Use composition instead of inheritance to adapt
* Fibonacci to make it Iterable.
************************************************/

package generics;

import java.util.Iterator;

class IterableFibonacci2 implements Iterable<Integer> {
  private Fibonacci fib = new Fibonacci();
  private int n;
  public IterableFibonacci2(int count) { n = count; }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public boolean hasNext() { return n > 0; }
      public Integer next() {
    	--n;
    	return fib.next();
      }
      public void remove() { // Not implemented
    	throw new UnsupportedOperationException();
      }
    };
  }
}

public class E07_IterableFibonacci2 {
  public static void main(String[] args) {
	for(int i : new IterableFibonacci2(18))
	  System.out.print(i + " ");
  }
}
