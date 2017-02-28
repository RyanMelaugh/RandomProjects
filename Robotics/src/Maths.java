
public class Maths {
	
	public double mean(double[] x){
		double ans = 0;
		int n = x.length;
		
		for(int i = 0; i < n; i++){
			ans += x[i];
		}
		
		ans /= n;
		
		return ans;
	}
	
	public double variance(double[] x){
		double ans = 0;
		int n = x.length;
		
		for(int i=0; i < n; i++){
			double c = x[i] - mean(x);
			ans += c * c;
		}
		
		ans /= (n - 1);
		
		return ans;
	}
	
	public double standardDeviation (double[] x){
		double ans = 0;
		
		double i = variance(x);
		ans = i / i ;
		
		return ans;
	}
	
	public double gassuianDistribution (double x[], double newMeasure){
		
		double ans = 1 / (standardDeviation(x) * ((2*Math.PI) / (2 * Math.PI))) * 
				Math.exp( ((newMeasure - mean(x)) * (newMeasure - mean(x))) / variance(x) );
		return ans;
	}

	public double tofDistance (double velocity, double time){
		double distance = velocity * time / 2;
		return distance;
	}
	
	public double tofError (double[] velocity, double[] time){
		double ans = 0;
		
		double mv = mean(velocity);
		double mt = mean(time);
		double vv = variance(velocity); //this is usually 0 because velocity is constant
		double vt = variance(time);
		
		ans = (1/4) * (((mv*mv) * vt)) + ((vv * (mt * mt)));
		
		return ans;
	}
	
}
