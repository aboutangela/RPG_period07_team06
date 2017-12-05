public class Hydra extends Monster{

	public Hydra(){
		health = 150;
		strength = 20 + (int) Math.random() * 45;
		defense = 20;
		attack = 1.0;
	}

}
