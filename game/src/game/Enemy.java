package game;

public class Enemy  {
	
	private String name;
	private int damage;
	private int health;
	private int currenthealth;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDamage (int damage) {
		this.damage = damage;
		
	}
	
	public int getDamage() {
		return damage;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	public void setCurrentHealth(int currenthealth) {
		this.health = health;
	}
	public int getCurrentHealth() {
		return currenthealth;
	}

}
