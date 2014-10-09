package generics;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class SimplerPets {
  public static void main(String[] args) {
	Map<Person, List<? extends Pet>> petPeople = New.map();
	// Rest of the code is the same...
  }
}
