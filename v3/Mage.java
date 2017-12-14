public class Mage extends Protagonist {
    public Mage(String name) {
		super(name);
		health = 130;
    }

    public String toString() {
		return "Mage: " + super.toString();
    }	
}
