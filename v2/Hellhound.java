public class Hellhound extends Monster{

	public Hellhound(){
		health = 170;
		strength = 20 + (int) Math.random() * 45;
		defense = 50;
		attack = 1.9;
	}

	public String toString() {
		return "Hellhound: " + super.toString();
    }	
	
}
