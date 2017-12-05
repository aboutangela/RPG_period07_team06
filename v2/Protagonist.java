public class Protagonist extends Character{
	private String name;

	public Protagonist( String input){
		name= input;
		health = 125;
		strength = 100;
		defense = 40;
		attack = 0.4;
	}
	
	public String getName(){
		return name;
	}

	public void specialize(){
		defense -= 10;
		attack += 0.5;
	}

	public void normalize() {
		defense = 40;
		attack = 0.4;
	}
}