package poker;

import java.util.ArrayList;
import java.util.Random;

public class deck {
	
	cards cardsHearts = new cards();
	cards cardsSpades = new cards();
	cards cardsClubs = new cards();
	cards cardsDiamonds = new cards();
	int complete = 0;
	
	int numli = 1;
	
	ArrayList<String> deck = new ArrayList<String>();

	deck(){
		
	}
	
	public void createDeck(){
		cardsHearts.refreshCards();
		cardsSpades.refreshCards();
		cardsClubs.refreshCards();
		cardsDiamonds.refreshCards();
		
		Random rnd = new Random();
		
		
		for(int i = 1; i >= complete; i++){
			int numCardType = rnd.nextInt(4)+1;
			
			if(deck.size()==52){
				break;
			}
			
			if(numCardType==1 && cardsHearts.cardsTaken<=12){
				String card = chooseCard(cardsHearts) + "♥";
				deck.add(card);
				//System.out.println(numli + ": " + card);
				//numli++;
			} else if (numCardType==2 && cardsSpades.cardsTaken<=12){
				String card = chooseCard(cardsSpades) + "♠";
				deck.add(card);
				//System.out.println(numli + ": " + card);
				//numli++;
			} else if (numCardType == 3 && cardsClubs.cardsTaken<=12){
				String card = chooseCard(cardsClubs) + "♣";
				deck.add(card);
				//System.out.println(numli + ": " + card);
				//numli++;
			} else if (numCardType == 4 && cardsDiamonds.cardsTaken<=12){
				String card =  chooseCard(cardsDiamonds) + "♦";
				deck.add(card);
				//System.out.println(numli + ": " + card);
				//numli++;
			}
			
			
		}
	}
	
	public String chooseCard(cards cardType){
		boolean found = false;
		Random rnd = new Random();
		while(found == false){
			int card = rnd.nextInt(13);
			if(cardType.cardCheck[card] == false){
				cardType.cardCheck[card] = true;
				cardType.cardsTaken++;
				return cards.cards[card];
			} 
		}
		return null;
	}
	
	public void printDeck(){
		int num = 1;
		for(String i : deck){
			System.out.println(num + ": " + i);
			num++;
		}
	}
	
	
	
}
