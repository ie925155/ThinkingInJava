// {Args: typeinfo.Derived}
/****************** Exercise 9 ******************
* Modify the previous exercise so that it uses
* Class.getDeclaredFields() to also display
* information about the fields in a class.
***********************************************/

package typeinfo;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

interface Iface {
  int i = 47;	
  void f();
}

class Base implements Iface { 
  String s;
  double d;
  public void f() { System.out.println("Base.f"); }
}

class Composed {
  Base b;
}

class Derived extends Base {
  Composed c;
  String s;
}

public class E09_GetDeclaredFields {
  static Set<Class<?>> alreadyDisplayed =
	new HashSet<Class<?>>();
  static void printClasses(Class<?> c) {
	// getSuperclass() returns null on Object:
	if(c == null) return;
	System.out.println(c.getName());
	Field[] fields = c.getDeclaredFields();
	if(fields.length != 0)
	  System.out.println("Fields:");
	for(Field fld : fields) {
	  System.out.println(" " + fld);
	}
	for(Field fld : fields) {
	  Class<?> k = fld.getType();
	  if(!alreadyDisplayed.contains(k)) {
	    printClasses(k);
	    alreadyDisplayed.add(k);
	  }
	}
	// Produces the interfaces that this class
	// implements:
	for(Class<?> k : c.getInterfaces()) {
	  System.out.println("Interface: " + k.getName());
	  printClasses(k.getSuperclass());
	}
	printClasses(c.getSuperclass());
  }
  public static void main(String args[]) throws Exception {
	for(int i = 0; i < args.length; i++) {
	  System.out.println("Displaying " + args[i]);
	  printClasses(Class.forName(args[i]));
	  if(i < args.length - 1)
	    System.out.println("==================");
	}	  
  }
}
