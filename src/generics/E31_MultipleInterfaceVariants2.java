/****************** Exercise 31 *****************
* Remove all the generics from
* MultipleInterfaceVariants.java and modify the
* code so that the example compiles.
************************************************/

package generics;
interface Payable2 {}

class Employee3 implements Payable2 {}
class Hourly extends Employee3 implements Payable2 {}

public class E31_MultipleInterfaceVariants2 {
  public static void main(String[] args) {
	new Employee3();
	new Hourly();
  }
}
