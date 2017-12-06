public class Hydra extends Monster{

	public Hydra(){
		health = 150;
		strength = 20 + (int) Math.random() * 45;
		defense = 30;
		attack = 1.7;
	}

	public String toString() {
		return "Hydra: " + super.toString();
    }	
	
}
