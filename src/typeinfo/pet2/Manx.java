package typeinfo.pet2;

import typeinfo.pets.Cat;

public class Manx extends Cat {
  public static class Factory
  implements typeinfo.factory.Factory<Manx> {
	public Manx create() { return new Manx(); }
  }
}
