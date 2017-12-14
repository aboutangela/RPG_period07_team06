public class Warrior extends Protagonist {
    public Warrior(String name) {
		super(name);
		strength = 110;
    }
    // .\Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist
    public String toString() {
		return "Warrior: " + getName() + System.lineSeparator()
		     + "Health: " + health + System.lineSeparator()
		     + "Strength:  " + strength + System.lineSeparator()
		     + "Defense: " + defense + System.lineSeparator()
		     + "Attack:  " + attack;
    }
    
}
