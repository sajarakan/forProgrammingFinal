package jo.edu.htu.programming.game;

public class Damage {
	
	int punchDamage;
	int kickDamage;			//this class contains the initial values of each move a character can do
	
	public Damage()
	{	this.punchDamage=5;
		this.kickDamage=5;	}

	public int getPunchDamage() {
		return punchDamage;
	}

	public int getKickDamage() {
		return kickDamage;
	}
	
	
}
