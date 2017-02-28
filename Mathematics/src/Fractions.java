
public class Fractions {
	
	public static String simplify_str(double top, double bottom){
		int i = 2;
		lbl: do{
			if((bottom%top)!=0){
				break lbl;
			}
		} while( i < top);{
			if((top%i)==0 && (bottom%i)==0){
				top /= i;
				bottom /= i;
				i = 2;
			} else {
				i++;
			}

		}
		return top + "/" + bottom;
	}

}
