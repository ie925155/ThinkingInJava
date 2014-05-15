// {Args: typeinfo.Gum typeinfo.Cookie}
/****************** Exercise 7 ******************
* Modify SweetShop.java so that each type of
* object creation is controlled by a
* command-line argument. That is, if your
* command line is "java SweetShop Candy," then
* only the Candy object is created. Notice how
* you can control which Class objects are loaded
* via the command-line argument.
***********************************************/

package typeinfo;

public class E07_CommandLoad {  
  public static void main(String[] args) throws Exception {
	for(String arg : args)
	  Class.forName(arg);
	}
}