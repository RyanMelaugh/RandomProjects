package wordSearch;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		String[] in = Words.getWordInput();
		for(String s : in){
			System.out.println(s);
		}
		
		Map<Character,Integer> alpha = Words.getMostCommonChar(in);
		
		for(Map.Entry<Character, Integer> entry : alpha.entrySet()){
			System.out.println(entry.getKey() + " count: " + entry.getValue());
		}
		
		Grid g = new Grid(in,10);
		g.horizontalPlace(in[0]);
		
		char[][] a = g.getGrid();
		for(int i = 0; i < a.length; i++){
			System.out.println(" ");
			for(int c = 0; c < a[i].length; c++){
				System.out.print(a[i][c]);
			}
			
		}
	}

}
