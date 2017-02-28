package wordSearch;

import java.util.Random;

public class Grid {
	
	String[] wordList;
	private boolean wordsImported = false;
	
	//Grid
	private char[][] grid;
	private int gridSize;
	
	Grid(){
		
	}
	
	Grid(String[] words){
		setWordList(words);
	}
	
	Grid(String[] words, int size){
		setWordList(words);
		initialiseGrid(size);
	}
	
	public void setWordList(String[] words){
		wordList = words;
		wordsImported = true;
	}
	
	private void initialiseGrid(int size){
		gridSize = size;
		grid = new char[size][size];
		populateJunk();		
	}
	
	private void populateJunk(){
		for(int i = 0; i < gridSize;i++){
			for(int c = 0; c < gridSize; c++){
				grid[i][c] = 'a';
			}
		}
	}
	
	public char[][] getGrid(){
		return grid;
	}
	
	public void horizontalPlace(String word){
		int length = word.length();
		Random rnd = new Random();
		
		//Top(0) or Bottom(1)
		int relativePos = rnd.nextInt(2);
		
		
		//Distance from ceiling or floor
		int potentialStart = gridSize-length;		
		int startPlace_ceiling = rnd.nextInt(potentialStart-1);
		if(startPlace_ceiling == -1){startPlace_ceiling = 0;}
		
		//Distance from sides
		int startPlace_sides = rnd.nextInt(gridSize-1);
		if(startPlace_sides == -1){startPlace_sides = 0;}
		
		if(relativePos == 0){
			for(int i = 0; i < length; i++){
				grid[startPlace_ceiling][startPlace_sides] = word.charAt(i);
				startPlace_ceiling++;
			}
		} else {
			for(int i = 0; i < length; i++){
				grid[startPlace_ceiling][startPlace_sides] = word.charAt(i);
				startPlace_ceiling--;
			}
		}
	}
	
	public void verticalPlace(String word){
		
	}
	
	
	public void diagonalPlace(String word){
		
	}
	
	

}
