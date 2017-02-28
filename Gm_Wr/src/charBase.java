
public abstract class charBase {

	private int health = 100;
	
	public void reduceHealth(int dmg){
		health-=dmg;
	}
	
	public void addHealth(int health){
		this.health+=health;
	}
	
	public int getHealth(){
		return health;
	}
	
	/*Generate the name**/
	protected abstract String genName();
	
	public abstract String getName();
	
	public abstract char getGender();

	
	
	
}
