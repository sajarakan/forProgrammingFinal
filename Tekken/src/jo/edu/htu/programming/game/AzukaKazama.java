package jo.edu.htu.programming.game;

public class AzukaKazama extends Damage{
	
	private int azukaPunch;
	private int azukaKick;
	private int sMove;
	
	public AzukaKazama() {
		this.azukaPunch=10;
		this.azukaKick=5;
		this.sMove=20;
	}

	
	public int getAzukaPunch() {
		return azukaPunch + punchDamage;
	}

	public int getAzukaKick() {
		return azukaKick * kickDamage;
	}

	public int getSpecialMove() {
		return sMove * kickDamage;
	}


	
}
