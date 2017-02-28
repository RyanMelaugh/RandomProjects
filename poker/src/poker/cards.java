package poker;

public class cards {
	
	public boolean[] cardCheck = {false, false, false, false, false, false, false, false, false, 
								false, false, false, false};
	public int cardsTaken = 0;
	public static String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A" };
	
	
	public void refreshCards(){
		for(int i = 0; i < cardCheck.length; i++){
			cardCheck[i] = false;
		}
		
	}
	
	

}
