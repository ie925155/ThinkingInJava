// Testing class Class.

package typeinfo.toys;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
	System.out.println("Class name: " + cc.getName() +
	" is interface? [" + cc.isInterface() + "]");
	System.out.println("Simple name: " + cc.getSimpleName());
	System.out.println("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
	Class c = null;
	try {
	  c = Class.forName("typeinfo.toys.FancyToy");	  
	} catch(ClassNotFoundException e) {
	  System.out.println("Can¡¦t find FancyToy");
	  System.exit(1);
	}
	printInfo(c);
	for(Class face : c.getInterfaces())
	  printInfo(face);
	Class up = c.getSuperclass();
	Object obj = null;
	try {
	  // Requires default constructor:
	  obj = up.newInstance();
	} catch(InstantiationException e) {
		System.out.println("Cannot instantiate");
	  System.exit(1);
	} catch(IllegalAccessException e) {
		System.out.println("Cannot access");
	  System.exit(1);
	}
	printInfo(obj.getClass());
  }
}
