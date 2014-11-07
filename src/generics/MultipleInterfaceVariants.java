// {CompileTimeError} (Won¡¦t compile)

package generics;

interface Payable<T> {}

class Employee2 implements Payable<Employee2> {}
class Hourly2 extends Employee2
  implements Payable<Hourly2> {} ///:~

public class MultipleInterfaceVariants {

}
