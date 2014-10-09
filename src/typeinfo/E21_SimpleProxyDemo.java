/****************** Exercise 21 *****************
* Modify SimpleProxyDemo.java so it measures
* method-call times.
***********************************************/

package typeinfo;


interface Interface2 {
  void doSomething();
  void somethingElse(String arg);
}

class RealObject2 implements Interface {
  public void doSomething() { System.out.println("doSomething"); }
  public void somethingElse(String arg) {
    System.out.println("somethingElse " + arg);
  }
}

class SimpleProxy2 implements Interface {
  private Interface2 proxied;
  public SimpleProxy2(Interface2 proxied) {
	this.proxied = proxied;
  }
  public void doSomething() {
	System.out.println("SimpleProxy doSomething");
	long start = System.nanoTime();
	proxied.doSomething();
	long duration = System.nanoTime() - start;
	System.out.println("METHOD-CALL TIME: " + duration);
  }
  public void somethingElse(String arg){
	System.out.println("SimpleProxy somethingElse " + arg);
	long start = System.nanoTime();
	proxied.somethingElse(arg);
	long duration = System.nanoTime() - start;
	System.out.println("METHOD-CALL TIME: " + duration);
  }
}

public class E21_SimpleProxyDemo {
  public static void consumer(Interface iface) {
	iface.doSomething();
	iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
	consumer(new RealObject());
	consumer(new SimpleProxy(new RealObject()));
  }
}
