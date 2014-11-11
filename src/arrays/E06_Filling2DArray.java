/****************** Exercise 6 *****************
* Write a method that takes two int arguments,
* indicating the two sizes of a 2-D array. The
* method should create and fill a 2-D array of
* BerylliumSphere according to the size arguments.
***********************************************/

package arrays;

import java.util.Arrays;

public class E06_Filling2DArray {
  static BerylliumSphere[][] fill(int xLen, int yLen) {
	BerylliumSphere[][] a = new BerylliumSphere[xLen][yLen];
	for(int i = 0; i < xLen; i++)
	  for(int j = 0; j < yLen; j++)
	    a[i][j] = new BerylliumSphere();
		return a;
  }
  public static void main(String[] args) {
	System.out.println(Arrays.deepToString(fill(3, 3)));
  }
}
