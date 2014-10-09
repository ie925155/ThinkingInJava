package typeinfo.pet2;

import typeinfo.pets.Dog;

public class Pug extends Dog {
  public static class Factory
  implements typeinfo.factory.Factory<Pug> {
	public Pug create() { return new Pug(); }
  }
}
