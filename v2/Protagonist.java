public class Protagonist extends Character{
	private String name;

	public Protagonist( String input){
		name = input;
		health = 125;
		strength = 100;
		defense = 40;
		attack = 0.4;
	}
	
	public String getName(){
		return name;
	}

	public void specialize(){
		defense = defense / 2 -5;
		attack = attack * 2;
	}

	public void normalize() {
		defense = 40;
		attack = 0.4;
	}

	public String toString() {
	    return name + System.lineSeperator()
		+ "Health: " + health + System.lineSeperator()
		+ "Strength:  " + strength + System.lineSeperator()
		+ "Defense: " + defense + System.lineSeperator()
		+ "Attack:  " + attack;
	}

}
