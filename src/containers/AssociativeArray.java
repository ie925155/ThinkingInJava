// Associates keys with values.

package containers;

public class AssociativeArray<K,V> {
  private Object[][] pairs;
  private int index;
  public AssociativeArray(int length) {
	pairs = new Object[length][2];
  }
  public void put(K key, V value) {
	if(index >= pairs.length)
	  throw new ArrayIndexOutOfBoundsException();
	pairs[index++] = new Object[]{ key, value };
  }
  @SuppressWarnings("unchecked")
  public V get(K key) {
	for(int i = 0; i < index; i++)
	  if(key.equals(pairs[i][0]))
		return (V)pairs[i][1];
	return null; // Did not find key
  }
  public String toString() {
	StringBuilder result = new StringBuilder();
	for(int i = 0; i < index; i++) {
	  result.append(pairs[i][0].toString());
	  result.append(" : ");
	  result.append(pairs[i][1].toString());
	  if(i < index - 1)
	    result.append("\n");
	}
	return result.toString();
  }
  public static void main(String[] args) {
	AssociativeArray<String,String> map =
	  new AssociativeArray<String,String>(6);
	map.put("sky", "blue");
	map.put("grass", "green");
	map.put("ocean", "dancing");
	map.put("tree", "tall");
	map.put("earth", "brown");
	map.put("sun", "warm");
	try {
	  map.put("extra", "object"); // Past the end
	} catch(ArrayIndexOutOfBoundsException e) {
	  System.out.println("Too many objects!");
	}
	System.out.println(map);
	System.out.println(map.get("ocean"));
  }
}
