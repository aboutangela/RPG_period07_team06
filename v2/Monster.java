public class Monster extends Character{

	public Monster(){
		health = 150;
		strength = (int) (20 + Math.random() * 45);
		defense = 20;
		attack = 1.0;
	}

	public String toString() {
	    return "Health: " + health + System.lineSeparator()
			 + "Strength:  " + strength + System.lineSeparator()
			 + "Defense: " + defense + System.lineSeparator()
			 + "Attack:  " + attack;
	}
	
}
