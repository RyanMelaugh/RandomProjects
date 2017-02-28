package projecteuler;

import java.util.ArrayList;

public class first {
	private int total = 0;
	private int current = 0;
	ArrayList<Integer> mult = new ArrayList<Integer>();
	
	
	public int calc(int cycle){
		current++;
		if(total>=999){
			return cycle;
		}
		if(cycle==0){
			return cycle;
		}else{
			if(current%3==0 || current%5==0){
				mult.add(current);
				if(cycle==1){
					System.out.println(current + "(" + total + ")" + " - FINISH"); 
				}else{
					System.out.println(current + "(" + total + ")" + ", "); 
				}
				total+=current;
				calc(cycle-1);
			}else{
				calc(cycle-1);
			}
			
		}
		return 0;
	}
	

}
