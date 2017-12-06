public class Cyclops extends Monster{

	public Cyclops(){
		health = 155;
		strength = 20 + (int) Math.random() * 45;
		defense = 25;
		attack = 1.5;
	}

	public String toString() {
		return "Cyclops: " + super.toString();
    }	
	
}
