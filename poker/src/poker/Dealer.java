package poker;

import java.util.ArrayList;

public class Dealer {
	
	ArrayList<Player> plyrList = new ArrayList<Player>();
	int positionDealer = 0;
	
	int pot = 0;
	
	/**
	 * 
	 */
	Dealer(){
		
	}
	
	/**
	 *Add a player to the table
	 * @param plyr
	 */
	public void addPlayer(Player plyr){
		plyrList.add(plyr);
	}
	
	
	/**
	 * 
	 * @param plyr
	 * @return Return 1 for success, 0 for failure
	 */
	public int removePlayer(Player plyr){
		for(Player p : plyrList){
			if(p.getId() == plyr.getId()){
				plyrList.remove(p);
				return 1;
			}
		}
		return 0;
	}
	
	public void moveDealer(){
		if(positionDealer < plyrList.size()){
			positionDealer+=1;
		} else {
			positionDealer=0;
		}
	}
	
	public void playHand(){
		deck newDeck = new deck();
		newDeck.createDeck();
	}
	
	
	

}
