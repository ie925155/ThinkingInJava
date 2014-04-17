/****************** Exercise 3 ******************
* Modify Turtle.java so that it sends all output
* to System.err.
***********************************************/

package strings;

import java.util.Formatter;

public class E03_TurtleRedirected {
  public static void main(String[] args) {
	Formatter f = new Formatter(System.err);
	Turtle tommy = new Turtle("Tommy",f),
	terry = new Turtle("Terry",f);
	tommy.move(0,0);
	terry.move(4,8);
	tommy.move(3,4);
	terry.move(2,5);
	tommy.move(3,3);
	terry.move(3,3);
  }
}
