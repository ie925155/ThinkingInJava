/********************** Exercise 2 *********************
* Incorporate a new kind of interface into ToyTest.java
* and verify that it is detected and displayed properly.
********************************************************/

package typeinfo;

interface HasCPU {}

class FancierToy extends FancyToy implements HasCPU {}

public class E02_ToyTest2 {
  static void printInfo(Class<?> cc) {
	System.out.println("Class name: " + cc.getName() +
	  " is interface? [" + cc.isInterface() + "]");
	System.out.println("Simple name: " + cc.getSimpleName());
	System.out.println("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
	Class<?> c = null;
	try {
	  c = Class.forName("typeinfo.FancierToy");
	} catch(ClassNotFoundException e) {
	  System.out.println("Can't find FancierToy");
	  System.exit(1);
	}
	printInfo(c);
	for(Class<?> face : c.getInterfaces())
	  printInfo(face);
	Class<?> up = c.getSuperclass();
	Object obj = null;
	try {
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
