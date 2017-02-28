package poker;

import java.util.Random;

public class Player {
	
	private int id;
	
	Player(String name){
		
		//randomly generate id
		Random rnd = new Random();
		if(name==null){
			id = (name + rnd.nextInt()).hashCode();
		} else {
			id = ("default" + rnd.nextInt()).hashCode();
		}
	}
	
	public int getId(){
		return id;
	}
	
	

}
