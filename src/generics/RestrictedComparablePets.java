package generics;

class Hamster extends ComparablePet
  implements Comparable<ComparablePet> {
  public int compareTo(ComparablePet arg) { return 0; }
}

public class RestrictedComparablePets {

}
