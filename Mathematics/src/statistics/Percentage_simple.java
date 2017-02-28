package statistics;

public class Percentage_simple {
	
	/**
	 * Calculates how much percentage the value is of the total
	 * @param value
	 * @param total
	 * @return
	 */
	public static double percentageOf(double value, double total){
		return (value/total)*100;
	}
	
	public static double valueOfPercent(double value_Percent, double total){
		return value_Percent*total;
	}


}
