package typeinfo.pet2;

import typeinfo.pets.Rodent;

public class Rat extends Rodent {
  public static class Factory
  implements typeinfo.factory.Factory<Rat> {
	public Rat create() { return new Rat(); }
  }
}
