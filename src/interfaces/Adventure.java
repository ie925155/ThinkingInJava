package interfaces;

interface CanFight {
	void fight();
}

interface CanSwim{
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {};
}

/*
 *  core reasons for interfaces is shown that
 *  upcast to more than on base type (and the flexibility that this provides)
 */
class Hero extends ActionCharacter 
		   implements CanFight, CanSwim, CanFly{

	@Override
	public void fly() {		
		
	}

	@Override
	public void swim() {		
		
	}
	
	//not show fight in CanFight, because ActionCharacter also have fight() method
	
}

public class Adventure {
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight();}
	public static void main(String[] args) {		
		Hero h = new Hero();
		t(h); // Treat it as a CanFight
		u(h); // Treat it as a CanSwim
		v(h); // Treat it as a CanFly
		w(h); // Treat it as an ActionCharacter		
	}
}