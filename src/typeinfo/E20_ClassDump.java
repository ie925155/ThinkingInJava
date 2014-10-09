// {Args: java.lang.String typeinfo.SuperToy}
/****************** Exercise 20 *****************
* Look up the interface for java.lang.Class in
* the JDK documentation from java.sun.com.
* Write a program that takes the name of a class
* as a command-line argument, then uses the
* Class methods to dump all the information
* available for that class. Test your program
* with a standard library class and a class you
* create.
***********************************************/

// The solution is a much-modified version of
// Showmethods.java.

package typeinfo;

public class E20_ClassDump {
  public static void display(String msg, Object[] vals) {
	System.out.println(msg);
	for(Object val : vals)
	  System.out.println(" " + val);
  }
  public static void
  classInfo(Class<?> c) throws Exception {
	System.out.println("c.getName(): " + c.getName());
	System.out.println("c.getPackage(): " + c.getPackage());
	System.out.println("c.getSuperclass(): " + c.getSuperclass());
	// This produces all the classes declared as members:
	display("c.getDeclaredClasses()",
	  c.getDeclaredClasses());
	display("c.getClasses()", c.getClasses());
	display("c.getInterfaces()", c.getInterfaces());
	// The "Declared" version includes all
	// versions, not just public:
	display("c.getDeclaredMethods()",
	  c.getDeclaredMethods());
	display("c.getMethods()", c.getMethods());
	display("c.getDeclaredConstructors()",
	  c.getDeclaredConstructors());
	display("c.getConstructors()", c.getConstructors());
	display("c.getDeclaredFields()",
	  c.getDeclaredFields());
	display("c.getFields()", c.getFields());
	if(c.getSuperclass() != null) {
	  System.out.println("Base class: --------");
	  classInfo(c.getSuperclass());
	}
	System.out.println("End of " + c.getName());	
  }
  public static void main(String[] args) throws Exception {
	for(String arg : args)
	  classInfo(Class.forName(arg));
  }
}
