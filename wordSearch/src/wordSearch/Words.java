package wordSearch;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Words {
	
	public static String[] getWordInput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Please type with a space or comma each word you want in the word search");
		String input = scn.nextLine();
		
		//Split into the array to return
		String[] output = input.split(",| ");
		return output;
	}
	
	public static Map getMostCommonChar(String[] words){
		Map<Character,Integer> alphabet = getPresetMap();
		
		for(Map.Entry<Character, Integer> entry : alphabet.entrySet()){
			
		}
		
		for (int i = 0; i < words.length; i++){
			for(int c = 0; c < words[i].length(); c++){
				char letter = Character.toLowerCase(words[i].charAt(c));
				alphabet.put(letter, alphabet.get(letter) + 1);
			}
		}
		
		return alphabet;
	}
	
	public static Map getPresetMap(){
		Map<Character,Integer> alphabet = new HashMap<Character, Integer>();
		alphabet.put('a', 0);
		alphabet.put('b', 0);
		alphabet.put('c', 0);
		alphabet.put('d', 0);
		alphabet.put('e', 0);
		alphabet.put('f', 0);
		alphabet.put('g', 0);
		alphabet.put('h', 0);
		alphabet.put('i', 0);
		alphabet.put('j', 0);
		alphabet.put('k', 0);
		alphabet.put('l', 0);
		alphabet.put('m', 0);
		alphabet.put('n', 0);
		alphabet.put('o', 0);
		alphabet.put('p', 0);
		alphabet.put('q', 0);
		alphabet.put('u', 0);
		alphabet.put('r', 0);
		alphabet.put('s', 0);
		alphabet.put('t', 0);
		alphabet.put('v', 0);
		alphabet.put('w', 0);
		alphabet.put('x', 0);
		alphabet.put('y', 0);
		alphabet.put('z', 0);
		return alphabet;
	}

}
