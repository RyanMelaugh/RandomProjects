import java.util.ArrayList;


public class RangeAndInterval {
	
	public static void main(String[] args){
		
		findRangeAndInterval(-7,5,100);
		
		
	}
	
	public static void findRangeAndInterval(float min,float max, float points){
		
		float range = Math.abs(max-min);
		ArrayList<Float> list = new ArrayList<Float>(); 
		
		float interval = range/points;
		System.out.println("Range: " + range + "\nInterval: " + interval);
		for(float i = min; i <= max;i=i+interval){
			list.add(i);
			System.out.println(list.get(list.size()-1));
		}
		System.out.println("\n" + list.size());
		
	}

}
