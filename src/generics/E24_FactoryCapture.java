/****************** Exercise 23 *****************
* Modify Exercise 21 so that factory objects are
* held in the Map instead of Class<?>.
************************************************/

package generics;

import java.util.HashMap;
import java.util.Map;

class FactoryCapture {
  Map<String,FactoryI<?>> factories =
	new HashMap<String,FactoryI<?>>();	
  public Object createNew(String factoryname, int arg) {
	FactoryI<?> f = factories.get(factoryname);
	try {
	  return f.create(arg);
	} catch(NullPointerException e) {
	  System.out.println("Not a registered factoryname: " + factoryname);
	  return null;
    }
  }
  public void
    addFactory(String factoryname, FactoryI<?> factory) {
    factories.put(factoryname, factory);
  }
}

public class E24_FactoryCapture {
  public static void main(String[] args) {
	FactoryCapture fc = new FactoryCapture();
	fc.addFactory("Integer", new IntegerFactory());
	fc.addFactory("Widget", new Widget.Factory());
	System.out.println(fc.createNew("Integer", 1));
	System.out.println(fc.createNew("Widget", 2));
	fc.createNew("Product", 3);
  }
}
