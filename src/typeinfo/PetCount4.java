package typeinfo;

import net.mindview.util.TypeCounter;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class PetCount4 {
  public static void main(String[] args) {
	TypeCounter counter = new TypeCounter(Pet.class);
	for(Pet pet : Pets.createArray(20)) {
	  System.out.println(pet.getClass().getSimpleName() + " ");
	  counter.count(pet);
	}
	System.out.println();
	System.out.println(counter);		
  }
}
