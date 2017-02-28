package projecteuler;

import java.util.ArrayList;

public class prime {
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> primeCalc(long num){
		for(int div = 2;div<num;div++){
		if(num%div==0){
			System.out.println(div + ",");			
			nums.add(div);
			num/=div;
			div+=1;
		}else if(div<=num){
			num/=div;
			div+=1;
			}
		System.out.println(div);
		}
		
		return nums;
	}
	
	public ArrayList<Integer> primeCalc1(long num, int div){
		if(num%div==0){
			System.out.println(div + ",");			
			nums.add(div);
			primeCalc1(num/div,(div+1));
		}else if(div<=num){
			primeCalc1(num, (div+1));
		}
		return nums;
	}

}
