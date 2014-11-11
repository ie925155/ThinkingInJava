package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
  private static long counter;
  private final long id = counter++;
  public String toString() { return "Sphere " + id; }
}

public class ContainerComparison {
  public static void main(String[] args) {
	BerylliumSphere[] spheres = new BerylliumSphere[10];
	for(int i = 0; i < 5; i++)
	  spheres[i] = new BerylliumSphere();
	System.out.println(Arrays.toString(spheres));
	System.out.println(spheres[4]);
	List<BerylliumSphere> sphereList =
	  new ArrayList<BerylliumSphere>();
	for(int i = 0; i < 5; i++)
	  sphereList.add(new BerylliumSphere());
	System.out.println(sphereList);
	System.out.println(sphereList.get(4));
	int[] integers = { 0, 1, 2, 3, 4, 5 };
	System.out.println(Arrays.toString(integers));
	System.out.println(integers[4]);
	List<Integer> intList = new ArrayList<Integer>(
	Arrays.asList(0, 1, 2, 3, 4, 5));
	intList.add(97);
	System.out.println(intList);
	System.out.println(intList.get(4));
  }
}
