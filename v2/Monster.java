public class Monster extends Character{

	public Monster(){
		health = 150;
		strength = 20 + (int) Math.random() * 45;
		defense = 20;
		attack = 1.0;
	}

	public String toString() {
	    return "Health: " + health + System.lineSeperator()
			 + "Strength:  " + strength + System.lineSeperator()
			 + "Defense: " + defense + System.lineSeperator()
			 + "Attack:  " + attack;
	}
	
}
