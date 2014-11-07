/****************** Exercise 30 *****************
* Create a Holder for each of the primitive
* wrapper types, and show that autoboxing and
* autounboxing works for the set() and get()
* methods of each instance.
************************************************/

package generics;

public class E30_AutoboxingUnboxingTest {
  public static void main(String[] args) {
	Holder<Integer> hi = new Holder<Integer>();
	hi.set(1);
	int i = hi.get();
	System.out.println(i == 1);
	Holder<Byte> hb = new Holder<Byte>();
	hb.set((byte)1);
	byte b = hb.get();
	System.out.println(b == 1);
	Holder<Short> hs = new Holder<Short>();
	hs.set((short)1);
	short s = hs.get();
	System.out.println(s == 1);
	Holder<Long> hl = new Holder<Long>();
	hl.set(1L);
	long l = hl.get();
	System.out.println(l == 1);
	Holder<Float> hf = new Holder<Float>();
	hf.set(1.0F);
	float f = hf.get();
	System.out.println(f == 1.0F);
	Holder<Double> hd = new Holder<Double>();
	hd.set(1.0);
	double d = hd.get();
	System.out.println(d == 1.0);
	Holder<Character> hc = new Holder<Character>();
	hc.set('A');
	char c = hc.get();
	System.out.println(c == 'A');
	Holder<Boolean> hbool = new Holder<Boolean>();
	hbool.set(true);
	boolean bool = hbool.get();
	System.out.println(bool);
  }
}
