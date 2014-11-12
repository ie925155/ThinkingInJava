package containers;

import java.util.Iterator;

import net.mindview.util.Generator;
import net.mindview.util.MapData;
import net.mindview.util.Pair;
import arrays.CountingGenerator;
import arrays.RandomGenerator;

class Letters implements Generator<Pair<Integer,String>>,
  Iterable<Integer> {
  private int size = 9;
  private int number = 1;
  private char letter = 'A';
  public Pair<Integer,String> next() {
    return new Pair<Integer,String>(
      number++, "" + letter++);
  }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public Integer next() { return number++; }
      public boolean hasNext() { return number < size; }
      public void remove() {
    	throw new UnsupportedOperationException();
      }
    };
  }
}

public class MapDataTest {
  public static void main(String[] args) {
	// Pair Generator:
	System.out.println(MapData.map(new Letters(), 11));
	// Two separate generators:
	System.out.println(MapData.map(new CountingGenerator.Character(),
	  new RandomGenerator.String(3), 8));
	// A key Generator and a single value:
	System.out.println(MapData.map(new CountingGenerator.Character(),
	  "Value", 6));
	// An Iterable and a value Generator:
	System.out.println(MapData.map(new Letters(),
	  new RandomGenerator.String(3)));
	// An Iterable and a single value:
	System.out.println(MapData.map(new Letters(), "Pop"));  
  }
}
