package figures;

public class UK extends country {

	String name = null;
	double pop = 0;
	double social = 0;
	double personService = 0;
	double education = 0;
	double defence = 0;
	double working = 0;
	double unemployed = 0;
	double OAP = 0;
	double total = 0;
	double cost = 0;
	
	@Override
	public void setUp(String name, double pop) {
		this.name = name;
		this.pop = pop;
		
	}

	@Override
	public void setExp(double social, double personService, double education,
			double defence) {
		this.social = social;
		this.personService = personService;
		this.education = education;
		this.defence = defence;
		
		
		
	}

	@Override
	public void setPop(double working, double unemployed, double OAP,
			double total) {
		this.working = working;
		this.unemployed = unemployed;
		this.OAP = OAP;
		this.total = total;
		
	}

	@Override
	public void setBI(int BI, String impl) {
		if(impl.equals("full")){
			total*=1000000;
			cost = total*BI;
		}else if(impl.equals("work")){
			working*=1000000;
			cost = total*BI;
		}else if(impl.equals("semi")){
			double BI2 = BI/=2;
			unemployed*=1000000;
			working*=1000000;
			total = (unemployed*BI2) + (working*BI);
		}
		
	}
	
	public double getTotal(){
		return total;
	}

	
	
}
