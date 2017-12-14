public class Hero extends Protagonist {
    public Hero( String name) {
	super(name);
       	defense = 55;
    }

    public String toString() {
		return "Hero: " + getName() + System.lineSeparator()
		     + "Health: " + health + System.lineSeparator()
		     + "Strength:  " + strength + System.lineSeparator()
		     + "Defense: " + defense + System.lineSeparator()
		     + "Attack:  " + attack;
    }
}
