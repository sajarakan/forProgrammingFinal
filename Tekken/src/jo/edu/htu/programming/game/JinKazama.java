package jo.edu.htu.programming.game;

public class JinKazama extends Damage{
	
	private int jinPunch;
	private int jinKick;
	private int sMove;   //special move
	
	public JinKazama()
	{	this.jinPunch = 5;
		this.jinKick = 10;
		this.sMove = 10;}

	
	public int getJinPunch() {
		return jinPunch + punchDamage;		//initial damage plus the damage the character can do
	}										

	public int getJinKick() {
		return jinKick + kickDamage;
	}

	public int getSpecialmove() {
		return sMove * punchDamage;
	}
}
