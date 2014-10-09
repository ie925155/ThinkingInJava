package typeinfo.pet2;

import typeinfo.pets.Cat;
import typeinfo.pets.EgyptianMau;

public class EgyptianMaua extends Cat {
  public static class Factory
  implements typeinfo.factory.Factory<EgyptianMau> {
	public EgyptianMau create() {
	  return new EgyptianMau();
	}
  }
}
