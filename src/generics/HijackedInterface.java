// {CompileTimeError} (Won¡¦t compile)

package generics;

class Cat extends ComparablePet implements Comparable<Cat>{
	// Error: Comparable cannot be inherited with
	// different arguments: <Cat> and <Pet>
	public int compareTo(Cat arg) { return 0; }
}

public class HijackedInterface {

}
