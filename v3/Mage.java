public class Mage extends Protagonist {
    public Mage(String name) {
		super(name);
		health = 130;
    }

    public String toString() {
		return "Mage: " + getName() + System.lineSeparator()
		     + "Health: " + health + System.lineSeparator()
		     + "Strength:  " + strength + System.lineSeparator()
		     + "Defense: " + defense + System.lineSeparator()
		     + "Attack:  " + attack;
    }
}
