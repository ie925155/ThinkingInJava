package interfaces;

/****************** Exercise 14 ******************
* Create three interfaces, each with two methods.
* Inherit a new interface from each, adding
* a new method. Use the new interface to create
* a class, and inherit from a concrete class.
* Now write four methods, each of which takes one
* of the four interfaces as an argument. Create
* an object of your class in main(), and pass it
* to each of the methods.
***********************************************/


interface Interface1 {
	void f1();
	void g1();
}

interface Interface2 {
	void f2();
	void g2();
}

interface Interface3 {
	void f3();
	void g3();
}

interface Multiple extends Interface1, Interface2, Interface3 {
	void h();
}

class Concrete {
	String s;
	public Concrete(String s) { this.s = s; }
}

class All extends Concrete implements Multiple {

	public All() {
		super("All");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void h() {
		// TODO Auto-generated method stub
		
	}
	
}

public class E14_InterfaceInheritance {
	
	static void takes1(Interface1 i) {
		i.f1();
		i.g1();
	}
	static void takes2(Interface2 i) {
		i.f2();
		i.g2();
	}
	static void takes3(Interface3 i) {
		i.f3();
		i.g3();
	}
	
	static void takesAll(All a) {
		a.f1();
		a.g1();
		a.f2();
		a.g2();
		a.f3();
		a.g3();
		a.h();
		}
	public static void main(String args[]) {
		All a = new All();
		takes1(a);
		takes2(a);
		takes3(a);
		takesAll(a);
	}
}
