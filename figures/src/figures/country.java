package figures;

public abstract class country {

	public country(){
		
	}
	
	public abstract void setUp(String name, double pop);
	
	public abstract void setExp(double Social, double personService, double education, double defence);
	
	public double currentSpending(double social, double personService, double education, double defence){
		double finalBud = (social + personService + education + defence)*1000000;
		return finalBud;
	}
	
	public abstract void setPop(double working, double unemployed, double OAP, double total);
	
	public abstract void setBI(int BI, String impl);
}

