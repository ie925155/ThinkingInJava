package typeinfo.pet2;

import typeinfo.pets.Dog;

public class Mutt extends Dog {
  public static class Factory
  implements typeinfo.factory.Factory<Mutt> {
	public Mutt create() { return new Mutt(); }
  }
}
