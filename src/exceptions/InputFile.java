// Paying attention to exceptions in constructors.

package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
  private BufferedReader in;
  public InputFile(String fname) throws Exception {
	try {
	  in = new BufferedReader(new FileReader(fname));
  	  // Other code that might throw exceptions
	} catch(FileNotFoundException e) {
	  System.out.println("Could not open " + fname);
      // Wasn��t open, so don��t close it
	  throw e;
	} catch(Exception e) {
	  // All other exceptions must close it
	  try {
	    in.close();
	  } catch(IOException e2) {
	    System.out.println("in.close() unsuccessful");
	  }
	  throw e; // Rethrow
	} finally {
	  // Don��t close it here!!!
	}
  }
  public String getLine() {
	String s;
	try {
	  s = in.readLine();
	} catch(IOException e) {
	  throw new RuntimeException("readLine() failed");
	}
	return s;
  }
  public void dispose() {
	try {
	  in.close();
	  System.out.println("dispose() successful");
	} catch(IOException e2) {
	  throw new RuntimeException("in.close() failed");
	}
  }
}
