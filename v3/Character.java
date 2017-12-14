public class Character{
	protected int health;
	protected int strength;
	protected int defense;
	protected double attack;

	public boolean isAlive() {
		return health > 0;
	}

	public int getDefense(){
		return defense;
	}

	public void lowerHP(int damage) {
		health -= Math.abs(damage);
	}

	public int attack( Character other) {
		int damage = (int) ( strength * attack) - other.getDefense();
		other.lowerHP( damage);
		return damage;
	}
}
