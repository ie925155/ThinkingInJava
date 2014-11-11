/****************** Exercise 4 *****************
* Repeat the previous exercise for a
* three-dimensional array.
***********************************************/

package arrays;

import java.util.Locale;

public class E04_ThreeDDoubleArray {
  public static double[][][] threeDDoubleArray(
	int xLen, int yLen, int zLen,
	double valStart, double valEnd) {
	double[][][] array = new double[xLen][yLen][zLen];
	double increment =
	  (valEnd - valStart)/(xLen * yLen * zLen);
	double val = valStart;
	for(int i = 0; i < array.length; i++)
	  for(int j = 0; j < array[i].length; j++)
		for(int k = 0; k < array[i][j].length; k++) {
		  array[i][j][k] = val;
		  val += increment;
		}
	return array;
  }
  public static void printArray(double[][][] array) {
	for(int i = 0; i < array.length; i++) {
	  for(int j = 0; j < array[i].length; j++) {
		for(int k = 0; k < array[i][j].length; k++)
		  System.out.printf(
		    Locale.US, "%.2f ", array[i][j][k]);	 
		    print();
	    }
		print();
	  }
  }
  
  public static void main(String args[]) {
	double[][][] threeD =
	threeDDoubleArray(4, 6, 2, 47.0, 99.0);
	printArray(threeD);
	System.out.println("**********************");
	double[][][] threeD2 =
	  threeDDoubleArray(2, 2, 5, 47.0, 99.0);
	printArray(threeD2);
	System.out.println("**********************");
	double[][][] threeD3 =
	threeDDoubleArray(9, 5, 7, 47.0, 99.0);
	printArray(threeD3);  
  }	
}
