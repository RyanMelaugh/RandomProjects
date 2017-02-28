package projecteuler;

public class fib {
	int total =0;
	int cycle = 0;
	
	public int calc(long a, long b){
		if(b>=4000000){
			return total;
		}else{
			System.out.println(b + ", ");
			if(b%2==0){
				total+=b;
				//System.out.println(b + ", ");
				calc(b,(a+b));
			}else{
				//System.out.println(b + ", ");
				calc(b,(a+b));
			}
		}
		return total;
	}

}
