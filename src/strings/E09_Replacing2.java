/****************** Exercise 9 ******************
* Using the documentation for java.util.regex.Pattern
* as a resource, replace all the vowels in
* Splitting.knights with underscores.
************************************************/

package strings;

public class E09_Replacing2 {
  public static void main(String[] args) {
	System.out.println(Splitting.knights.replaceAll(
	"(?i)[aeiou]","_"));
  }
}
