package arrays;

import java.util.Arrays;

//Initialization & re-assignment of arrays.

public class ArrayOptions {
  public static void main(String[] args) {
	// Arrays of objects:
	BerylliumSphere[] a; // Local uninitialized variable
	BerylliumSphere[] b = new BerylliumSphere[5];
	// The references inside the array are
	// automatically initialized to null:
	System.out.println("b: " + Arrays.toString(b));
	BerylliumSphere[] c = new BerylliumSphere[4];
	for(int i = 0; i < c.length; i++)
	if(c[i] == null) // Can test for null reference
	  c[i] = new BerylliumSphere();
	// Aggregate initialization:
	BerylliumSphere[] d = { new BerylliumSphere(),
	  new BerylliumSphere(), new BerylliumSphere()
	};
	// Dynamic aggregate initialization:
	a = new BerylliumSphere[]{
	  new BerylliumSphere(), new BerylliumSphere(),
	};
	// (Trailing comma is optional in both cases)
	System.out.println("a.length = " + a.length);
	System.out.println("b.length = " + b.length);
	System.out.println("c.length = " + c.length);
	System.out.println("d.length = " + d.length);
	a = d;
	System.out.println("a.length = " + a.length);
	// Arrays of primitives:
	int[] e; // Null reference
	int[] f = new int[5];
	// The primitives inside the array are
	// automatically initialized to zero:
	System.out.println("f: " + Arrays.toString(f));
	int[] g = new int[4];
	for(int i = 0; i < g.length; i++)
	  g[i] = i*i;
	int[] h = { 11, 47, 93 };
	// Compile error: variable e not initialized:
	//!System.out.println("e.length = " + e.length);
	System.out.println("f.length = " + f.length);
	System.out.println("g.length = " + g.length);
	System.out.println("h.length = " + h.length);
	e = h;		
	System.out.println("e.length = " + e.length);
	e = new int[]{ 1, 2 };
	System.out.println("e.length = " + e.length);
  }
}
