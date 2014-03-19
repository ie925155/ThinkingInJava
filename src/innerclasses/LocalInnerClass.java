// Holds a sequence of Objects.

package innerclasses;

interface Counter {
  int next();
}

public class LocalInnerClass {
  private int count = 0;
  Counter getCounter(final String name) {
	// A local inner class:
    class LocalCounter implements Counter {
	  public LocalCounter() {
	    // Local inner class can have a constructor
	    System.out.println("LocalCounter()");
	  }
	  public int next() {
		System.out.println(name); // Access local final
	    return count++;
	  }
	}
	return new LocalCounter();
  }
  //The same thing with an anonymous inner class:
  Counter getCounter2(final String name) {
	return new Counter() {
      //Anonymous inner class cannot have a named
      //constructor, only an instance initializer:
	  {
	    System.out.println("Counter()");
      }
	  public int next() {
		System.out.println(name); // Access local final
	    return count++;
	  }
	};
  }
  public static void main(String[] args) {
	LocalInnerClass lic = new LocalInnerClass();
	Counter
	  c1 = lic.getCounter("Local inner "),
	  c2 = lic.getCounter2("Anonymous inner ");
	  for(int i = 0; i < 5; i++)
	    System.out.println(c1.next());
	  for(int i = 0; i < 5; i++)
		System.out.println(c2.next());
  }
}
