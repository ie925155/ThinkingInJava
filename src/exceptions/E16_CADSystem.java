/****************** Exercise 16 *****************
* Modify reusing/CADSystem.java to demonstrate
* that returning from the middle of a try-finally
* will still perform proper cleanup.
***********************************************/

package exceptions;

public class E16_CADSystem {
  public static void main(String[] args) {
	reusing.CADSystem x = new reusing.CADSystem(47);
	try {
	  return;
	} finally {
	  x.dispose();
	}
  }
}
