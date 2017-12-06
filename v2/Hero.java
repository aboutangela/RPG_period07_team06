public class Hero extends Protagonist {
    public Hero() {
		super(name);
       	defense = 55;
    }

    public String toString() {
		return "Hero: " + super.toString();
    }
}
