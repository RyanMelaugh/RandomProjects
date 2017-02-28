import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class scramble {
	
	String w;
	int t;
	
	int len;
	String newWord = "";
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	scramble(String word, int turns){
		w = word;
		t = turns;
	}
	
	public void runScramble(){
		len = w.length();
		Random rnd = new Random();
		
		for(int i = 0; i < t; i++){
			
			int a = 0;
			while(a < len){
				int pos = rnd.nextInt(len);
				
				if(map.containsKey(pos) == false){
					map.put(pos, 0);
					newWord = newWord + w.charAt(pos);
					a++;
				} else {
					int val = map.get(pos) + 1;
					map.put(pos, val);
				}

			}
			map.clear();
			System.out.println(newWord);
			newWord = "";
			
		}
	}

}
