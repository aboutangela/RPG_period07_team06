public class Warrior extends Protagonist {
    public Warrior(String name) {
		super(name);
		strength = 110;
    }

    public String toString() {
		return "Warrior: " + super.toString();
	}
}
